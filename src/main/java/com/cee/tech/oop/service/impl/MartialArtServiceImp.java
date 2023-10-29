package com.cee.tech.oop.service.impl;

import com.cee.tech.oop.service.MartialArtI;
import com.cee.tech.oop.service.RefereeServiceI;
import com.cee.tech.oop.service.SportServiceI;

public class MartialArtServiceImp implements SportServiceI, MartialArtI, RefereeServiceI {
    @Override
    public void martialArtStyle() {
        System.out.println("Martial Art style: Taekwondo");
    }
    @Override
    public void sportLocation() {
        System.out.println("Location: Okinawa Japan");
    }
    @Override
    public void startSportTime() {
        System.out.println("Martial Art Kick off: 20:00 GMT");
    }

    @Override
    public void stopSportTime() {
        System.out.println("Martial Art Stop time: 2100 GMT");
    }

    @Override
    public void showAttendance() {
        System.out.println("Total Attendance: 10,000");
    }


    @Override
    public void centerReferee() {
        System.out.println("Taekwondo Referee: Andrew Jay");
    }
}
