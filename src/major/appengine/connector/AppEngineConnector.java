package major.appengine.connector;

import com.google.api.server.spi.config.Nullable;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

/**
 * Created by Anurag Ambuj on 1/23/2016.
 */
public class AppEngineConnector {
    protected static DatastoreService datastoreService= DatastoreServiceFactory.getDatastoreService();
    public static DatastoreService getDatastoreService()
    {
        return datastoreService;
    }
    public static Entity createEntity(String kind, String keyTomatino)
    {

       Entity entity=new Entity(kind,keyTomatino);
       return entity;
    }
    public static void writeProperty(Entity entity,String property,String value)
    {
        entity.setProperty(property,value);
    }
    public static void deleteProperty(Entity entity,String property)
    {
        entity.removeProperty(property);
    }
    public static void deleteEntity(String kind)
    {
        //TODO
    }
    public static boolean connectionCreator()
    {
        //TODO
        return true;
    }
    public String getConnectionString()
    {
        //TODO
        return null;
    }


}
