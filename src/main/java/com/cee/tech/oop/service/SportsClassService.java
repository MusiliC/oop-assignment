package com.cee.tech.oop.service;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.cee.tech.oop.model.SportModel;

public class SportsClassService {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    SportModel sportModel = new SportModel("Football", 1000, LocalTime.now(), LocalTime.now());

    public void startApplication(){
        System.out.println();
        startSport();
        System.out.println();
        sportAttendance();
        System.out.println();
        stopSport();
        System.out.println();
    }

    
    public  void startSport(){
        System.out.println(sportModel.getSportName() + " Starting! at " + sportModel.getStartTime().format(formatter));
    }

    public void stopSport(){
        System.out.println(sportModel.getSportName() + " has ended! at " + sportModel.getStopTime().format(formatter));
    }

    public  void sportAttendance(){
        System.out.println("The attendance for " + sportModel.getSportName() + " is " + sportModel.getTotalAttendance());
    }
}
