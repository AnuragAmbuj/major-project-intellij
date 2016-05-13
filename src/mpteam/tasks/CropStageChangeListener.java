package mpteam.tasks;

/**
 * Created by Anurag Ambuj on 4/17/2016.
 */
public interface CropStageChangeListener {
    public static final int GERMINATION_STAGE=0;
    public static final int FLOWERING_STAGE=1;
    public static final int FRUITS_STAGE=3;
    public static final int ADULT_STAGE=4;
    public void cropStageChanged(CropStageChangeEvent csce);
    public void cropStageSucceeded(CropStageChangeEvent csce);
    public void cropStagePreceeded(CropStageChangeEvent csce);
}
