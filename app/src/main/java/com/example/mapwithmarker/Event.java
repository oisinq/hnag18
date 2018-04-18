package com.example.mapwithmarker;

import java.io.Serializable;

// We make this custom class "Serializable" to make it easier to transfer it between activities in an intent
public class Event implements Serializable {
    private String eventName;
    private String date;
    private String location;
    private String description;
    private int mImageResourceId;

    public Event(String eventName, String date, String location, String description, int imageResourceId) {
       this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.description = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the event
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Get the date of the event
     */
    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}