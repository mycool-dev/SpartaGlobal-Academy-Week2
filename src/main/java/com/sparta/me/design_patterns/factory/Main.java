package com.sparta.me.design_patterns.factory;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak();
    }
}
