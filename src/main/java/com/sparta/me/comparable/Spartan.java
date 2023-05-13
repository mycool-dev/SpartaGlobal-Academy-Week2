package com.sparta.me.comparable;

public class Spartan implements Comparable<Spartan> {
    int spartanId;
    String spartanName;

    public Spartan(int spartanId, String spartanName) {
        this.spartanId = spartanId;
        this.spartanName = spartanName;
    }

    public int getSpartanId() {
        return spartanId;
    }

    public void setSpartanId(int spartanId) {
        this.spartanId = spartanId;
    }

    public String getSpartanName() {
        return spartanName;
    }

    public void setSpartanName(String spartanName) {
        this.spartanName = spartanName;
    }

    @Override
    public int compareTo(Spartan o) {
        return this.getSpartanName().compareTo(o.getSpartanName());
    }
}
