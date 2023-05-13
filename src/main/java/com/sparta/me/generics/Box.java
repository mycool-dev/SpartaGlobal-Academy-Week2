package com.sparta.me.generics;

public class Box {
    private Object object; //problem?
    /*
    problem is that you can do pretty much anything you want to
    this box which you might not want to do
     */

    public Box(Object object) {
        this.object = object;
    }

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }

    public static void main(String[] args) {
        Box box = new Box(1);
        System.out.println(box.get());
    }
}
