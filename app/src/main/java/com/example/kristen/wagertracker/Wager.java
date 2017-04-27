package com.example.kristen.wagertracker;

/**
 * Created by Kristen on 4/26/2017.
 */


public class Wager{
    String trackName;
    String wagerDate;
    String wagerType;
    String wagerAmount;

    public Wager() { /* Required by Firebase for serialization purposes */ }

    //Constructor
    public Wager(String wTrack, String wDate, String wType, String wAmount){
        trackName = wTrack;
        wagerDate = wDate;
        wagerType = wType;
        wagerAmount = wAmount;
    }

    @Override
    public String toString(){
        return "Track: " + trackName + "\n"
                + "Date of Wager: " + wagerDate + "\n"
                + "Type of Wager: " + wagerType + "\n"
                + "Amount of Wager: " + wagerAmount ;
    }

}