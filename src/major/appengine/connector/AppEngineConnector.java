package major.appengine.connector;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

/**
 * Created by Anurag Ambuj on 1/23/2016.
 */
public class AppEngineConnector {
    protected static DatastoreService datastoreService= DatastoreServiceFactory.getDatastoreService();
    public static DatastoreService getDatastoreService()
    {
        return datastoreService;
    }
    public static Entity createEntity(String kind)
    {
        Entity entity =new Entity(kind);
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
}
