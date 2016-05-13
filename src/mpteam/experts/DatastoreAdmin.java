package mpteam.experts;

import com.google.appengine.api.datastore.*;
import major.appengine.connector.AppEngineConnector;

import javax.servlet.RequestDispatcher;

/**
 * Created by Avinash on 3/28/2016.
 */
public class DatastoreAdmin {

    static DatastoreService ds = AppEngineConnector.getDatastoreService();

    public static boolean checkLogin(String usernaame, String password) {


        Query q = new Query("Admins");
        String status1;
        PreparedQuery pq = ds.prepare(q);
               for(Entity all:pq.asIterable())
        {
            if(all.getProperty("username").equals(usernaame))
                if(all.getProperty("password").equals(password))
                {
                    return true;
                }
        }
        return false;
    }
    public static void insertData(String username,String password)
    {
        Entity entity = new Entity("Admins");
        entity.setProperty("username",username);
        entity.setProperty("password",password);
        ds.put(entity);
    }
public static String ckdata(String username,String Password){

   String status1;

    if(username.length()<3 && Password.length()<3)
    {
          status1="Too Short Login Credentials";
        return status1;
    }
    else
    {
         status1 = "Welcome EXPERT!!!";
    }

    return status1;

}
}
