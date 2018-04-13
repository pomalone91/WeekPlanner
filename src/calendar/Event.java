package calendar;

import java.sql.Time;
import java.util.Date;

public class Event {

    // Properties for an event
    String title;
    String description;
    Date start;
    Time duration;

    // Constructor
    public Event(String title, String description, Date start, Time duration) {
        this.title = title;
        this.description = description;
        this.start = start;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStart() {
        return start;
    }

    public Time getDuration() {
        return duration;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }
}
