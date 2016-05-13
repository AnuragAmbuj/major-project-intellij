package major.appengine.connector;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import major.jaikisaan.datamodel.QAModel;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Anurag Ambuj on 1/24/2016.
 */
public class GQLResultSetFetcher {
    public boolean isEmailPresent(String email) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email))
                return true;

        }
        return false;
    }

    public boolean validateUserRegistration(String email, String password) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email) && all.getProperty("password").equals(password))
                return true;
        }
        return false;
    }

    public String getFirstNameFromEmail(String email) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email))
                return all.getProperty("firstname").toString();
        }
        return "";
    }

    public String getLastNameFromEmail(String email) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email))
                return all.getProperty("lastname").toString();
        }
        return "";
    }

    public String getCropFromEmail(String email) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email))
                return all.getProperty("cropselector").toString();
        }
        return "";
    }

    public String getSowingTimeFromEmail(String email) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email)) {
                return all.getProperty("date").toString();
            }
        }
        return "";
    }

    public String getLocationFromEmail(String email) {
        Query q = new Query("User");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("email").equals(email)) {
                return all.getProperty("location").toString();
            }
        }
        return "";
    }

    public String getPest1FomCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pest1").toString();
            }
        }
        return " NA ";
    }

    public String getPest2FomCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pest2").toString();
            }
        }
        return " NA ";
    }

    public String getPest3FomCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pest3").toString();
            }
        }
        return " NA ";
    }

    public String getPesticide1FomCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pesticide1").toString();
            }
        }
        return " NA ";
    }

    public String getPesticide2FomCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pesticide2").toString();
            }
        }
        return " NA ";
    }

    public String getPesticide3FomCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pesticide3").toString();
            }
        }
        return " NA ";
    }

    public String getPesticidedose1FromCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pesticidedose1").toString();
            }
        }
        return " NA ";
    }

    public String getPesticidedose2FromCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pesticidedose2").toString();
            }
        }
        return " NA ";
    }

    public String getPesticidedose3FromCrop(String crop) {
        Query q = new Query("Crops");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("cropname").equals(crop)) {
                return all.getProperty("pesticidedose3").toString();
            }
        }
        return " NA ";
    }

    public String getPestFromTomato(String stage) {
        Query q = new Query("Tomato");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pests").toString();
            }

        }
        return " NA ";
    }

    public String getPesticideFromTomato(String stage) {
        Query q = new Query("Tomato");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pesticides").toString();
            }
        }
        return " NA ";
    }

    public String getPesticideDoseFromTomato(String stage) {
        Query q = new Query("Tomato");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("doses").toString();
            }
        }
        return " NA ";
    }

    public String getPestFromChilli(String stage) {
        Query q = new Query("Chilli");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pests").toString();
            }

        }
        return " NA ";
    }

    public String getPesticideFromChilli(String stage) {
        Query q = new Query("Chilli");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pesticides").toString();
            }
        }
        return " NA ";
    }

    public String getPesticideDoseFromChilli(String stage) {
        Query q = new Query("Chilli");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("doses").toString();
            }
        }
        return " NA ";
    }

    public String getPestFromPotato(String stage) {
        Query q = new Query("Potato");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pests").toString();
            }

        }
        return " NA ";
    }

    public String getPesticideFromPotato(String stage) {
        Query q = new Query("Potato");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pesticides").toString();
            }
        }
        return " NA ";
    }

    public String getPesticideDoseFromPotato(String stage) {
        Query q = new Query("Potato");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("doses").toString();
            }
        }
        return " NA ";
    }

    public String getPestFromCrop(String stage, String crop) {
        Query q = new Query(crop.trim());
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pests").toString();
            }

        }
        return " NA ";
    }

    public String getPesticideFromCrop(String stage, String crop) {
        Query q = new Query(crop.trim());
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("pesticides").toString();
            }
        }
        return " NA ";
    }

    public String getPesticideDoseFromCrop(String stage, String crop) {
        Query q = new Query(crop.trim());
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("stage").equals(stage)) {
                return all.getProperty("doses").toString();
            }
        }
        return " NA ";
    }

    public static boolean isQueryAnswered(String query) {
        Query q = new Query("Queries");
        PreparedQuery preparedQuery = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : preparedQuery.asIterable()) {
            if (all.getProperty("query").equals("NA"))
                return false;
        }
        return true;
    }

    public List<QAModel> getAllUnasweredQueries() {
        ArrayList<QAModel> arrayList = new ArrayList<>();
        Query q = new Query("Queries");
        PreparedQuery query = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity entity : query.asIterable()) {
            if (entity.getProperty("answer").equals("NA".trim())) {
                //arrayList.add(new QAModel(all.getProperty("query").toString(), all.getProperty("answer").toString()));
                String name = entity.getProperty("name").toString();
                String email = entity.getProperty("email").toString();
                String crop = entity.getProperty("crop").toString();
                String slist = entity.getProperty("state").toString();
                String ques = entity.getProperty("query").toString();
                String answer = entity.getProperty("answer").toString();
                String stage = entity.getProperty("stage").toString();
                QAModel qaModel = new QAModel(ques, answer, slist, stage, crop, email);
                arrayList.add(qaModel);
            }
        }
        return arrayList;
    }

    public static Entity getEntityFromQuery(String query) {
        Query q = new Query("Queries");
        Entity entity = null;
        PreparedQuery pq = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity all : pq.asIterable()) {
            if (all.getProperty("query").toString().trim().equals(query.trim())) {
                entity = all;
            }

        }
        return entity;
    }

    public static ArrayList<QAModel> getAllAnsweredQueries() {
        ArrayList<QAModel> arrayList = new ArrayList<>();
        Query q = new Query("Queries");
        PreparedQuery query = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity entity : query.asIterable()) {
            if (!entity.getProperty("answer").equals("NA".trim())) {
                //arrayList.add(new QAModel(all.getProperty("query").toString(), all.getProperty("answer").toString()));
                String name = entity.getProperty("name").toString();
                String email = entity.getProperty("email").toString();
                String crop = entity.getProperty("crop").toString();
                String slist = entity.getProperty("state").toString();
                String ques = entity.getProperty("query").toString();
                String answer = entity.getProperty("answer").toString();
                String stage = entity.getProperty("stage").toString();
                QAModel qaModel = new QAModel(ques, answer, slist, stage, crop, email);
                arrayList.add(qaModel);
            }
        }
        return arrayList;
    }

    public static ArrayList<QAModel> getAllSearchedAndAnsweredQueries(String keySearch) {
        StringTokenizer tokenizer = new StringTokenizer(keySearch);
        String keyword1 = " ", keyword2 = "Unanswered", keyword3 = "Unanswered";
        if (tokenizer.hasMoreTokens()) {
            keyword1 = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            keyword2 = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            keyword3 = tokenizer.nextToken();
        }
        ArrayList<QAModel> arrayList = new ArrayList<>();
        Query q = new Query("Queries");
        PreparedQuery query = AppEngineConnector.getDatastoreService().prepare(q);
        for (Entity entity : query.asIterable()) {
            if (entity.getProperty("query").toString().contains(keySearch) || entity.getProperty("query").toString().contains(keyword1) || entity.getProperty("query").toString().contains(keyword2) || entity.getProperty("query").toString().contains(keyword3) || entity.getProperty("crop").toString().contains(keyword1)|| entity.getProperty("crop").toString().contains(keyword2)|| entity.getProperty("crop").toString().contains(keyword3)) {
                // arrayList.add(new QAModel(entity.getProperty("query").toString(), all.getProperty("answer").toString()));
                String name = entity.getProperty("name").toString();
                String email = entity.getProperty("email").toString();
                String crop = entity.getProperty("crop").toString();
                String slist = entity.getProperty("state").toString();
                String ques = entity.getProperty("query").toString();
                String answer = entity.getProperty("answer").toString();
                String stage = entity.getProperty("stage").toString();
                QAModel qaModel = new QAModel(ques, answer, slist, stage, crop, email);
                arrayList.add(qaModel);
            }
        }
        return arrayList;

    }

}
