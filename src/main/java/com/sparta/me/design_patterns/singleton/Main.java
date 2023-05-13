package com.sparta.me.design_patterns.singleton;

public class Main {
    public static void main(String[] args) {

/*      Original code created different objects
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();
        Singleton s3 = new Singleton();
        Singleton s4 = new Singleton();
        */

        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();
        Singleton s4 = Singleton.getSingleton();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
