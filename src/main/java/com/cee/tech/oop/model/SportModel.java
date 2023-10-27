package com.cee.tech.oop.model;


import java.time.LocalTime;

public class SportModel {

    private String sportName;
    private  int totalAttendance;

    private LocalTime startTime;

    private  LocalTime stopTime;

    public SportModel(String sportName, int totalAttendance, LocalTime startTime, LocalTime stopTime) {
        this.sportName = sportName;
        this.totalAttendance = totalAttendance;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getTotalAttendance() {
        return totalAttendance;
    }

    public void setTotalAttendance(int totalAttendance) {
        this.totalAttendance = totalAttendance;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getStopTime() {
        return stopTime;
    }

    public void setStopTime(LocalTime stopTime) {
        this.stopTime = stopTime;
    }
}
