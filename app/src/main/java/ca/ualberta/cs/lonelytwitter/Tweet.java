package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by jstys on 1/18/18.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private List<Mood> moodList;

    public Tweet(String message){
        this.message=message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message=message;
        this.date=date;

    }
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public void addMood(Mood mood){
        this.moodList.add(mood);
    }

    public List<Mood> getMoodList(){
        return this.moodList;
    }


    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        else{
            this.message = message;
        }
    }

    public abstract Boolean isImportant();

}
