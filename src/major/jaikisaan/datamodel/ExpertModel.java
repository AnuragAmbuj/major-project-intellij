package major.jaikisaan.datamodel;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Anurag Ambuj on 1/24/2016.
 */
public class ExpertModel {

    private String expertName;
    private String answerCount;
    private String password;

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(String answerCount) {
        this.answerCount = answerCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
