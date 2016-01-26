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
                return all.getProperty("cropselector").toString();
        }
        return "";
    }
    public String getSowingTimeFromEmail(String email)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email))
            {
                return all.getProperty("date").toString();
            }
        }
        return "";
    }
    public String getLocationFromEmail(String email)
    {
        Query q=new Query("User");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("email").equals(email))
            {
                return all.getProperty("location").toString();
            }
        }
        return "";
    }
    public String getPest1FomCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pest1").toString();
            }
        }
        return " NA ";
    }
    public String getPest2FomCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pest2").toString();
            }
        }
        return " NA ";
    }
    public String getPest3FomCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pest3").toString();
            }
        }
        return " NA ";
    }
    public String getPesticide1FomCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pesticide1").toString();
            }
        }
        return " NA ";
    }
    public String getPesticide2FomCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pesticide2").toString();
            }
        }
        return " NA ";
    }
    public String getPesticide3FomCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pesticide3").toString();
            }
        }
        return " NA ";
    }
    public String getPesticidedose1FromCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pesticidedose1").toString();
            }
        }
        return " NA ";
    }
    public String getPesticidedose2FromCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pesticidedose2").toString();
            }
        }
        return " NA ";
    }
    public String getPesticidedose3FromCrop(String crop)
    {
        Query q=new Query("Crops");
        PreparedQuery preparedQuery=AppEngineConnector.getDatastoreService().prepare(q);
        for(Entity all:preparedQuery.asIterable())
        {
            if(all.getProperty("cropname").equals(crop))
            {
                return all.getProperty("pesticidedose3").toString();
            }
        }
        return " NA ";
    }


}
