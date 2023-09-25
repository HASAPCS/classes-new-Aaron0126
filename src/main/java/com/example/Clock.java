package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours=hours;
        this.minutes=minutes;
        // TODO: Initialize the hours and minutes
    }

    public void addMinutes(int minutes) {
        this.minutes=minutes+minutes;
        // if minutes>60;
        
        // TODO: Add the value of the minutes parameter to the current minutes. 
        // Adjust the hours and minutes accordingly to represent a valid time.
    }

    public String getTime() {
        // TODO: Return the time in the format "HH:MM"
        return "0"; //this.hours, this.minutes;  // Change this default return statement
    }
}
