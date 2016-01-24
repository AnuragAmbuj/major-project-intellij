package major.appengine.connector;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

/**
 * Created by Anurag Ambuj on 1/24/2016.
 */
public class GQLResultSetFetcher {
    public boolean isEmailPresent(String email)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email))
                return true;

        }
        return false;
    }
    public boolean validateUserRegistration(String email,String password)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email) && all.getProperty("password").equals(password))
                return true;
        }
        return false;
    }
    public String getFirstNameFromEmail(String email)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email))
                return all.getProperty("firstname").toString();
        }
        return "";
    }
    public String getLastNameFromEmail(String email)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email))
                return all.getProperty("lastname").toString();
        }
        return "";
    }
    public String getCropFromEmail(String email)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email))
                return all.getProperty("crop").toString();
        }
        return "";
    }
}
