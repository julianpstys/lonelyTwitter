package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by jstys on 1/18/18.
 */

public class MadMood extends Mood {

    public MadMood(){
        super();
    }

    public MadMood(Date date){
        super(date);
    }

    public void setDate(Date date){
        this.date=date;
    }

    public Date getDate(){
        return this.date;
    }

    @Override
    public String getMoodString(){
        return "mad";
    }


}
