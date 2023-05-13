package com.sparta.me.nested_classes.anon;

public class Main {
    public static void main(String[] args) {

        Speakable bird = new Speakable() {
            @Override
            public void speak(String name) {
                System.out.println(name + " chirps ");
            }
        };
        bird.speak("barry");

        // Speakable bird = name -> System.out.println(name + " chirps ");
    }
}
