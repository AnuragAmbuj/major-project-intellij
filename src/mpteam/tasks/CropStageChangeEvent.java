package mpteam.tasks;

import java.util.EventObject;

/**
 * Created by Anurag Ambuj on 4/17/2016.
 */
public class CropStageChangeEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CropStageChangeEvent(Object source) {

        super(source);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object getSource()
    {
        return source;
    }

    public int getAnalysedDateDifferenece()
    {
        return getAnalysedDateDifferenece();
    }
}
