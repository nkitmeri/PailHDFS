package bigdata.pailhdfs;

import bigdata.tweetpail.SplitTweetPailStructure;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.hadoop.Hfs;
import com.backtype.cascading.tap.PailTap;
import com.backtype.hadoop.pail.PailSpec;
import com.backtype.hadoop.pail.PailStructure;
import com.backtype.hadoop.pail.SequenceFileFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jcascalog.Api;
import jcascalog.Subquery;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class App extends Configured implements Tool
{
    public static PailTap splitTweetTap(String path) 
    {
        Map<String, Object> options = new HashMap<>();
        options.put(SequenceFileFormat.CODEC_ARG,
            SequenceFileFormat.CODEC_ARG_BZIP2);
        options.put(SequenceFileFormat.TYPE_ARG,
            SequenceFileFormat.TYPE_ARG_BLOCK);
        PailTap.PailTapOptions opts = new PailTap.PailTapOptions();
        opts.spec = new PailSpec("SequenceFile", options,
                (PailStructure) new SplitTweetPailStructure());

        return new PailTap(path, opts);
    }
    
    @Override
    public int run(String[] args) throws Exception
    {
        Configuration hadConf = this.getConf();
        Map apiConf = new HashMap();
        String sers = "backtype.hadoop.ThriftSerialization," +
        "org.apache.hadoop.io.serializer.WritableSerialization";
        apiConf.put("io.serializations", sers);        
                
        Iterator<Map.Entry<String, String>> iter = hadConf.iterator();
        while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                apiConf.put(entry.getKey(), entry.getValue());
        }
        
        Api.setApplicationConf(apiConf);
        
        Api.execute( splitTweetTap( args[1] ),
                new Subquery( "?tTweets" )
                        .predicate( new Hfs( new TextLine(), args[0] ),
                                "_", "?jTweets" )
                        .predicate( new CreateTweets(), "?jTweets" )
                        .out( "?tTweets" ) );
        
        return 0;
    }
    
    public static void main( String[] args )
    {
        Configuration conf = new Configuration();
        conf.set( "mapred.reduce.tasks", "28" );
        conf.set( "mapred.child.java.opts", "-Xmx2g" );
        
        try 
        {
            ToolRunner.run(conf, new App(), args);
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }
  
}
