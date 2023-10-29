package com.cee.tech.oop.service.impl;

import com.cee.tech.oop.service.RefereeServiceI;
import com.cee.tech.oop.service.SportServiceI;
import com.cee.tech.oop.service.BallGameServiceI;

public class BallGameServiceImp implements BallGameServiceI, RefereeServiceI {
    @Override
    public void sportLocation() {
        System.out.println("Location: Old Trafford, Manchester");
    }
    public  void homeTeam(){
        System.out.println("Home Team: Man U");
    }

    public  void awayTeam(){
        System.out.println("Away Team: Man City");
    }

    @Override
    public void startSportTime() {
        System.out.println("Manchester Derby kick off: 1830 EAT");
    }

    @Override
    public void stopSportTime() {
        System.out.println("Manchester Derby stop time: 2000 EAT ");
    }

    @Override
    public void showAttendance() {
        System.out.println("Total Attendance: 67,300");
    }


    @Override
    public void centerReferee() {
        System.out.println("Manchester Derby referee: Mike Dean");
    }
}
