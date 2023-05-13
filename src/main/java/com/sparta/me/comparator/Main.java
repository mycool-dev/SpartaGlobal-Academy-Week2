package com.sparta.me.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        ArrayList<Spartan> spartanList = new ArrayList<>(Arrays.asList(
                new Spartan(1,"Mike"),
                new Spartan(2,"Dan"),
                new Spartan(3,"Ryan")
        ));
        System.out.println(spartanList.get(0).getSpartanName());//before sorting
        Collections.sort(intArr);//knows how to sort numbers
        Collections.sort(spartanList, new SpartanComparator());//naturally does not know sure how to sort spartans
        System.out.println(spartanList.get(0).getSpartanName());//after sorting
    }

}
