package mpteam.tasks;

import major.appengine.connector.AppEngineConnector;
import mpteam.experts.DatastoreAdmin;

import java.util.ArrayList;

/**
 * Created by Anurag Ambuj on 4/23/2016.
 */
public class LinkGenerator {
    private AHrefLink aHrefLink;
    private ArrayList<AHrefLink> linkArrayList;
    private ArrayList<AHrefLink> getLinkArrayList()
    {
        ArrayList<AHrefLink> linkList = new ArrayList<AHrefLink>();
        AHrefLink link = new AHrefLink("borer","/pestimages/cpodborer.jpg");
        linkList.add(link);
        link = new AHrefLink("mite","/pestimages/mites.jpg");
        linkList.add(link);
        link = new AHrefLink("buck","/pestimages/buck.jpg");
        linkList.add(link);
        link = new AHrefLink("cut","/pestimages/cut.jpg");
        linkList.add(link);
        link = new AHrefLink("jass","/pestimages/jassid.jpg");
        linkList.add(link);
        link = new AHrefLink("hop","/pestimages/leafhopper.jpg");
        linkList.add(link);
        link = new AHrefLink("dery","/pestimages/powdery_mildew.jpg");
        linkList.add(link);
        link = new AHrefLink("aphid","/pestimages/white_aphids.jpg");
        linkList.add(link);
        link = new AHrefLink("beet","/pestimages/barmy.jpg");
        linkList.add(link);
        return linkList;

    }
    public static ArrayList<AHrefLink> getAHrefList()
    {
        return new LinkGenerator().getLinkArrayList();
    }
}
