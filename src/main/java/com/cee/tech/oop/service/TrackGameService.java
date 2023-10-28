package com.cee.tech.oop.service;

public class TrackGameService extends  SportService{
    public  void athlete(){
        System.out.println("Athlete: Lewis Hamilton");
    }

    @Override
    public  void  sportLocation(){
        System.out.println("Location: Singapore GP");
    }
    public  void duration(){
        System.out.println("Time: 1:46:37.418");
    }

    public  void distance(){
        System.out.println("Distance: 10 miles");
    }
}
