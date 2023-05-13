package com.sparta.me.nested_classes.innerclass;

public class OuterClass {
    private String privateString = "private String";

    private class InnerClass {//the inner class can see the fields from the outer class
        public String print() {
            return "I can see the " + privateString;
        }
        OuterClass outerClass = new OuterClass();

    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        InnerClass innerObject = outerObject.new InnerClass();
        //inner class is created using the object from the outer class
    }
}
