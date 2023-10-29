package com.cee.tech.oop.service.impl;

import com.cee.tech.oop.model.BallGameModel;
import com.cee.tech.oop.service.GoverningBody;
import com.cee.tech.oop.service.RefereeServiceI;
import com.cee.tech.oop.service.SportServiceI;
import com.cee.tech.oop.service.BallGameServiceI;

public class BallGameServiceImp extends GoverningBody implements SportServiceI,BallGameServiceI, RefereeServiceI {
    BallGameModel ballGameModel;

    public BallGameServiceImp(BallGameModel ballGameModel){
        this.ballGameModel = ballGameModel;
    }
    @Override
    public void sportLocation() {
        System.out.println("Location: Old Trafford, Manchester");
    }
    public  void homeTeam(){
        System.out.println("Home Team: " + ballGameModel.getHomeTeam());
    }

    public  void awayTeam(){
        System.out.println("Away Team: " + ballGameModel.getAwayTeam());
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

    @Override
    public void whichBody() {
        System.out.println("Governing body: FIFA");
    }
}
