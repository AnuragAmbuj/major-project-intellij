package major.appengine.connector;

import com.google.api.server.spi.config.Nullable;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import major.jaikisaan.datamodel.QAModel;

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
    public static boolean insertTomatoData(String stage,String pests,String pesticides,String doses)
    {
        try {
            Entity entity = new Entity("Tomato",stage);
            entity.setProperty("stage", stage);
            entity.setProperty("pests", pests);
            entity.setProperty("pesticides", pesticides);
            entity.setProperty("doses", doses);
            getDatastoreService().put(entity);
        }catch (Exception e)
        {
            return false;
        }
        return true;
    }
    public static boolean insertChilliData(String stage,String pests,String pesticides,String doses)
    {
        try {
            Entity entity = new Entity("Chilli",stage);
            entity.setProperty("stage", stage);
            entity.setProperty("pests", pests);
            entity.setProperty("pesticides", pesticides);
            entity.setProperty("doses", doses);
            getDatastoreService().put(entity);
        }catch (Exception e)
        {
            return false;
        }
        return true;
    }
    public static boolean insertPotatoData(String stage,String pests,String pesticides,String doses)
    {
        try {
            Entity entity = new Entity("Potato",stage);
            entity.setProperty("stage", stage);
            entity.setProperty("pests", pests);
            entity.setProperty("pesticides", pesticides);
            entity.setProperty("doses", doses);
            getDatastoreService().put(entity);
        }catch (Exception e)
        {
            return false;
        }
        return true;
    }
    public static boolean insertCropStageData(String crop,String stage,String pests,String pesticides,String doses)
    {
        try {
            Entity entity = new Entity(crop.trim(),stage.trim());
            entity.setProperty("stage", stage);
            entity.setProperty("pests", pests);
            entity.setProperty("pesticides", pesticides);
            entity.setProperty("doses", doses);
            getDatastoreService().put(entity);
        }catch (Exception e)
        {
            return false;
        }
        return true;
    }
    public static void insertQueryData(String name, String email, String crop, String stage, String slist, String query, String answer)
    {
        Entity entity = new Entity("Queries",email);
        entity.setProperty("name",name);
        entity.setProperty("email",email);
        entity.setProperty("crop",crop);
        entity.setProperty("state",slist);
        entity.setProperty("query",query);
        entity.setProperty("answer",answer);
        entity.setProperty("stage",stage);
        getDatastoreService().put(entity);
    }





}
