package com.cee.tech.oop.service;

public class MartialArtService extends  SportService{
    @Override
    public  void  sportLocation(){
        System.out.println("Location: Japan");
    }
    // e.g., Karate, Taekwondo
    public void style(){
        System.out.println("Style: Taekwondo");
    };
    public void beltLevel(){
        System.out.println("Belt level:  Black belt");
    }
}
