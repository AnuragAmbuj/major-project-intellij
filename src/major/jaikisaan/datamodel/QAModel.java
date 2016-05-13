package major.jaikisaan.datamodel;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import major.appengine.connector.AppEngineConnector;
import major.appengine.connector.GQLResultSetFetcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by Anurag Ambuj on 2/18/2016.
 */
public class QAModel {
    private String query;
    private String answer;
    private String email;

    public ArrayList<String> getQueryAnswers() {

        return queryAnswers;
    }

    public void setQueryAnswers(ArrayList<String> queryAnswers) {
        this.queryAnswers = queryAnswers;
    }

    private ArrayList<String> queryAnswers = new ArrayList<String>();

    public String getSlist() {
        return slist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSlist(String slist) {

        this.slist = slist;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    private String slist;
    private String stage;
    private String crop;

    /*
    String name = request.getParameter("name");
        String email = request.getParameter("email");
        String crop= request.getParameter("cropselector");
        String stage = request.getParameter("stage");
        String slist = request.getParameter("slist");
        String query = request.getParameter("query");
        String answer = "NA";
     */

    public QAModel(String query, String answer, String slist, String stage, String crop,String email) {
        this.query = query;
        this.answer = answer;
        this.slist = slist;
        this.stage = stage;
        this.crop = crop;
        this.email=email;
        Entity entity = GQLResultSetFetcher.getEntityFromQuery(query);
        if(entity.getProperty("answers")==null)
        {
            queryAnswers = new ArrayList<String>();
        }
        else
        {
            String tempAns = entity.getProperty("answers").toString();
            StringTokenizer tokenizer = new StringTokenizer(tempAns,";");
            while(tokenizer.hasMoreTokens())
            {
                queryAnswers.add(tokenizer.nextToken());
            }
        }
    }

    public QAModel(String query, String answer)
    {
        this.query = query;
        this.answer = answer;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getAnswer() {
        return answer;
    }
    public static void setAnswerToAQuery(String keyQuery,String yourAnswer)
    {
        Entity entity= GQLResultSetFetcher.getEntityFromQuery(keyQuery);
        if(entity!=null)
        {
            entity.setProperty("answer",yourAnswer);
            AppEngineConnector.getDatastoreService().put(entity);
        }

    }
    public void insertMultiple(String answer)
    {
        queryAnswers.add(answer);
    }
    public String convertToSemicolonSeparated()
    {
        String temp="";
        for(int i=0;i<queryAnswers.size();i++)
        {
            temp = temp+ queryAnswers.get(i)+";";
        }
        return temp;
    }
    public static QAModel getQAModelFromEntity(Entity entity)
    {
        String name=entity.getProperty("name").toString();
        String email=entity.getProperty("email").toString();
        String crop=entity.getProperty("crop").toString();
        String slist=entity.getProperty("state").toString();
        String query=entity.getProperty("query").toString();
        String answer=entity.getProperty("answer").toString();
        String stage=entity.getProperty("stage").toString();
        QAModel qaModel = new QAModel(query,answer,slist,stage,crop,email);
        return qaModel;
    }
    public static void setAnswersToAQuery(String keyQuery,String yourAnswer)
    {
        Entity entity = GQLResultSetFetcher.getEntityFromQuery(keyQuery);
        System.out.println(entity.getProperty("email"));
        if(entity!=null)
        {
            QAModel model = getQAModelFromEntity(entity);
            System.out.println(model.getQuery());
            model.getQueryAnswers().add(yourAnswer);
            System.out.println(model.convertToSemicolonSeparated());
            entity.setProperty("answers",model.convertToSemicolonSeparated());
            AppEngineConnector.getDatastoreService().put(entity);
        }
    }

}
