package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by jstys on 1/18/18.
 */

public abstract class Mood {

    protected Date date;

    public Mood(){
        this.date=new Date();
    }

    public Mood(Date date){
        this.date=date;
    }



    public abstract String getMoodString();
}
