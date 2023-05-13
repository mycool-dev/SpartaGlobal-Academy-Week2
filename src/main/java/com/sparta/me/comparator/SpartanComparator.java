package com.sparta.me.comparator;

import java.util.Comparator;

public class SpartanComparator implements Comparator<Spartan> {
    @Override
    public int compare(Spartan o1, Spartan o2) {
        return o1.getSpartanName().compareTo(o2.getSpartanName());
    }
}
