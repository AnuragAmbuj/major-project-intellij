package mpteam.tasks;

import java.util.ArrayList;

/**
 * Created by Anurag Ambuj on 4/17/2016.
 */
public class StageChangeEventSource {
    private ArrayList<CropStageChangeListener> listenerArrayList = new ArrayList<>();
    public void addCropStageChangeListener(CropStageChangeListener ce)
    {
        listenerArrayList.add(ce);
    }
    public void fireEvent(){

    }
}
