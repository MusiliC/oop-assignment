package com.cee.tech.oop.service.impl;

import com.cee.tech.oop.service.SportServiceI;
import com.cee.tech.oop.service.TrackGameServiceI;

public class TrackGameServiceImp implements SportServiceI, TrackGameServiceI {
    @Override
    public void athleteName() {
        System.out.println("Driver: Max Verstappen");
    }

    @Override
    public void distanceCover() {
        System.out.println("Distance: 10 miles");
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



}
