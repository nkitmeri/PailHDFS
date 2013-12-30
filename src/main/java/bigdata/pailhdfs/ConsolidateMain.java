package bigdata.pailhdfs;

import bigdata.tweetthrift.Tweet;
import com.backtype.hadoop.pail.Pail;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 *
 * @author nikos
 */
public class ConsolidateMain extends Configured implements Tool
{

    @Override
    public int run( String[] args ) throws IOException 
    {
        Configuration hadConf = this.getConf();
        Pail<Tweet> pail = new Pail<>( args[0] );
        
        pail.consolidate();
        
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        Configuration conf = new Configuration();
        conf.set( "mapred.reduce.tasks", "28" );
        conf.set( "mapred.child.java.opts", "-Xmx2g" );
        
        try 
        {
            ToolRunner.run(conf, new ConsolidateMain(), args);
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    
}
