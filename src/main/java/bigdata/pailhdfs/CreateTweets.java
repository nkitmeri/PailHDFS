package bigdata.pailhdfs;

import bigdata.tweetthrift.Date;
import bigdata.tweetthrift.HashtagEntity;
import bigdata.tweetthrift.MentionEntity;
import bigdata.tweetthrift.Text;
import bigdata.tweetthrift.Tweet;
import bigdata.tweetthrift.TweetType;
import bigdata.tweetthrift.URLEntity;
import bigdata.tweetthrift.User;
import cascading.flow.FlowProcess;
import cascading.operation.FunctionCall;
import cascading.tuple.Tuple;
import cascalog.CascalogFunction;
import java.util.ArrayList;
import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.UserMentionEntity;
import twitter4j.json.DataObjectFactory;

/**
 *
 * @author nikos
 */
public class CreateTweets extends CascalogFunction 
{

    @Override
    public void operate( FlowProcess process, FunctionCall call )
    {
        // thrift lists
        List<MentionEntity> mentionEntities = new ArrayList<>(); 
        List<HashtagEntity> hashtagEntities = new ArrayList<>();
        List<URLEntity> urlEntities = new ArrayList<>();
        
        try 
        {
            Status jTweet = DataObjectFactory.createStatus(
                    call.getArguments().getString(0) );
            Tweet tTweet = new Tweet();
            
            tTweet.setId( jTweet.getId() );
            tTweet.setDate( new Date( jTweet.getCreatedAt().toString() ) );
            
            try
            {
                tTweet.getLanguage().setGetLang( jTweet.getIsoLanguageCode() );
            }
            catch( NullPointerException e ) {}
            
            tTweet.setUser( new User( jTweet.getUser().getId() ) );
            tTweet.setType( ( jTweet.isRetweet() ) ? TweetType.RETWEET :
                    TweetType.TWEET );
            tTweet.setText( new Text( jTweet.getText() ) );
            
            for( UserMentionEntity ume : jTweet.getUserMentionEntities() )
                mentionEntities.add( new MentionEntity( ume.getId() ) );
            if( !mentionEntities.isEmpty() )
                tTweet.setMentionEntities( mentionEntities );
            for( twitter4j.HashtagEntity hte : jTweet.getHashtagEntities() )
                hashtagEntities.add( new HashtagEntity( hte.getText() ) );
            if( !hashtagEntities.isEmpty() )
                tTweet.setHashtagEntities( hashtagEntities );
            for( twitter4j.URLEntity urle : jTweet.getURLEntities() )
                urlEntities.add( new URLEntity( urle.getURL() ) );
            if( !urlEntities.isEmpty() )
                tTweet.setUrlEntities( urlEntities );
            
            Tuple tuple = new Tuple( tTweet );
            call.getOutputCollector().add( tuple );
        } 
        catch( TwitterException e )
        {
            throw new RuntimeException(e);
        }
    }
    
}
