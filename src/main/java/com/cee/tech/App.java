package com.cee.tech;


import com.cee.tech.oop.model.BallGameModel;
import com.cee.tech.oop.service.BallGameServiceI;
import com.cee.tech.oop.service.RefereeServiceI;
import com.cee.tech.oop.service.SportServiceI;
import com.cee.tech.oop.service.impl.BallGameServiceImp;
import com.cee.tech.oop.service.impl.MartialArtServiceImp;
import com.cee.tech.oop.service.impl.TrackGameServiceImp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    BallGameModel ballGameModel;
    public static void main(String[] args) {
        System.out.println();
        System.out.println("All Sports");
        System.out.println("_____________");
        System.out.println();
        List<SportServiceI> sports = new ArrayList<>();
        sports.add(new MartialArtServiceImp());
        sports.add(new BallGameServiceImp(new BallGameModel("Man U", "Man City")));
        sports.add(new TrackGameServiceImp());

        for (SportServiceI allSports : sports) {
            allSports.startSportTime();
            allSports.stopSportTime();
        }

        System.out.println();
        System.out.println();
        System.out.println("Sports with center referees");
        System.out.println("_____________");
        System.out.println();
        List<RefereeServiceI> refGames = new ArrayList<>();
        refGames.add(new BallGameServiceImp(new BallGameModel("Man U", "Man City")));
        refGames.add(new MartialArtServiceImp());

        for (RefereeServiceI eachRefGame : refGames) {
            eachRefGame.sportLocation();
            eachRefGame.startSportTime();
            eachRefGame.centerReferee();
        }

        System.out.println();

        System.out.println("Ball games");
        System.out.println("_____________");
        System.out.println();
        BallGameServiceImp ballGameServiceI = new BallGameServiceImp(new BallGameModel("Man U", "Man City"));
        ballGameServiceI.sportLocation();
        ballGameServiceI.homeTeam();
        ballGameServiceI.awayTeam();
        System.out.println("Abstract class");
        ballGameServiceI.setUp();
        ballGameServiceI.whichBody();


        System.out.println();

        System.out.println("Track games");
        System.out.println("_______________");
        System.out.println();
        TrackGameServiceImp trackGameServiceImp = new TrackGameServiceImp();
        trackGameServiceImp.sportLocation();
        trackGameServiceImp.athleteName();
        trackGameServiceImp.distanceCover();
        System.out.println("Abstract class");
        trackGameServiceImp.setUp();
        trackGameServiceImp.whichBody();

        System.out.println();

        System.out.println("Martial Art games");
        System.out.println("_______________");
        System.out.println();
        MartialArtServiceImp martialArtServiceImp = new MartialArtServiceImp();
        martialArtServiceImp.sportLocation();
        martialArtServiceImp.martialArtStyle();
        System.out.println("Abstract class");
        martialArtServiceImp.setUp();
        martialArtServiceImp.whichBody();


    }
}
