package com.sparta.me.generics;

public class GenericBox<T> {
    private T t;

    public GenericBox(T t) {
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        //GenericBox<? extends Number> box = new GenericBox<>("Hello");
    }
}
