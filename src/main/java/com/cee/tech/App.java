package com.cee.tech;


import com.cee.tech.oop.service.BallGameService;
import com.cee.tech.oop.service.MartialArtService;
import com.cee.tech.oop.service.SportService;
import com.cee.tech.oop.service.TrackGameService;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("Ball games");
        System.out.println("_____________");
        System.out.println();
        BallGameService sportService = new BallGameService();
        sportService.sportLocation();
        sportService.matchOfficial();

        System.out.println();

        System.out.println("Track games");
        System.out.println("_______________");
        System.out.println();
        TrackGameService trackGameService = new TrackGameService();
        trackGameService.sportLocation();
        trackGameService.athlete();

        List<SportService> sports = new ArrayList<>();
        sports.add(new MartialArtService());
        sports.add(new BallGameService());
        sports.add(new TrackGameService());

        for(SportService allSports: sports){
            allSports.sportLocation();
        }

    }
}
