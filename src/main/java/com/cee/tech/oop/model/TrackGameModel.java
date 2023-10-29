package com.cee.tech.oop.model;

public class TrackGameModel {
    private  String distance;
    private  String athlete;



    public TrackGameModel(String distance, String athlete) {
        this.distance = distance;
        this.athlete = athlete;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getAthlete() {
        return athlete;
    }

    public void setAthlete(String athlete) {
        this.athlete = athlete;
    }


}
