package com.cee.tech.oop.service.impl;

import com.cee.tech.oop.model.TrackGameModel;
import com.cee.tech.oop.service.GoverningBody;
import com.cee.tech.oop.service.SportServiceI;
import com.cee.tech.oop.service.TrackGameServiceI;

public class TrackGameServiceImp extends GoverningBody implements SportServiceI, TrackGameServiceI {

    TrackGameModel trackGame = new TrackGameModel("10 miles", "Max Verstappen");

    @Override
    public void athleteName() {

        System.out.println("Driver: " + trackGame.getAthlete());
    }

    @Override
    public void distanceCover() {
        System.out.println("Distance: " + trackGame.getDistance());
    }

    @Override
    public void sportLocation() {
        System.out.println("Location: Singapore GP");
    }

    @Override
    public void startSportTime() {
        System.out.println("Formula one: Start Time 2100 GMT");
    }

    @Override
    public void stopSportTime() {
        System.out.println("Formula one: Stop Time 2300 GMT");
    }

    @Override
    public void showAttendance() {
        System.out.println("Total Attendance: 20,000");
    }


    @Override
    public void whichBody() {
        System.out.println("Governing body:  Fédération Internationale de l'Automobile (FIA)");
    }
}
