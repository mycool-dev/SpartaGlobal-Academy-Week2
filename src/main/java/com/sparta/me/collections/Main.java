package com.sparta.me.collections;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List myList = new ArrayList();
        //programming to the interface
        //allows me to change arrayList to any other child of list without causing any problems

        ArrayList<String> stringArrayList = new ArrayList<>();
        /*
        If you know the type of collection you want and what it should do you DO NOT code to the interface,
        instead you put in the concrete type you want to use.
        On the other hand if you don't quite know what you want, but you know you roughly want a type of list you,
        would code to the interface instead
        */

        myList.add("hello");
        myList.add("hello");
        myList.add("hello");
        myList.add("hello");

        System.out.println(myList);
    }
}
