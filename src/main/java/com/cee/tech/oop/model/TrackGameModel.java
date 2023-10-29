package com.cee.tech.oop.model;

import java.util.Scanner;

public class TrackGameModel {
    private  String distance;
    private  String athlete;

    Scanner scanner = new Scanner(System.in);


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
