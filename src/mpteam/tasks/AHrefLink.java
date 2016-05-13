package mpteam.tasks;

/**
 * Created by Anurag Ambuj on 4/23/2016.
 */
public class AHrefLink {
    String title;
    String ahref;

    public AHrefLink(String title,String ahref)
    {
        this.title = title;
        this.ahref = ahref;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "<a href='"+ahref+"'>"+title+"</a>";
    }

}
