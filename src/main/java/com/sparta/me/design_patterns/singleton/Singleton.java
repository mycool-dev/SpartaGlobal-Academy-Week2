package com.sparta.me.design_patterns.singleton;

public class Singleton {
    private Singleton(){};// first step is making the constructor private

    private static final Singleton singleton = new Singleton(); //creates the object

    public static Singleton getSingleton(){
        return singleton;
    }//method to return the object

}
