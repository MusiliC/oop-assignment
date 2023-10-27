package com.cee.tech.oop.model;

import java.time.LocalDate;

public class TrackGamesModel {
    private String totalDistance;
    private LocalDate duration;
    private String averageSpeed;

    public TrackGamesModel(String totalDistance, LocalDate duration, String averageSpeed) {
        this.totalDistance = totalDistance;
        this.duration = duration;
        this.averageSpeed = averageSpeed;
    }

    public String getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(String totalDistance) {
        this.totalDistance = totalDistance;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    public String getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(String averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}
