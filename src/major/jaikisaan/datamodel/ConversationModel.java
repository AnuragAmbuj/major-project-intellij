package major.jaikisaan.datamodel;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Anurag Ambuj on 1/24/2016.
 */
public class ConversationModel {

    private String expertName;
    private String areaExpertise;
    private int answerCount;
    private int questionCount;

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getAreaExpertise() {
        return areaExpertise;
    }

    public void setAreaExpertise(String areaExpertise) {
        this.areaExpertise = areaExpertise;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }
}
