package com.sparta.me.generics;

public class GenericBox<T> {//<T> can be anything (its a placeholder for the TYPE)
    private T t;

    public GenericBox(T t) {
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        /*
        This now states that you can provide anything AS LONG as it extends number
        (Number and its subclasses)
        GenericBox<? extends Number> box = new GenericBox<>("Hello");
        ************************************************************************************
        when using a wildcard as a placeholder you have the same level of flexibility
        as the Box class but when the object is created it becomes immutable.
        NOTE - only immutable if using the ? on its own
        GenericBox<?> wildCardBox = new GenericBox<>(false);
        ************************************************************************************
        You can use Integer and any of its parents up to Object
        GenericBox<? super Integer> lowerBoundedWildcard = new GenericBox<Integer>(1);

        */

        GenericBox<String> boxString = new GenericBox<>("Hello");
        GenericBox<Integer> boxInt = new GenericBox<>(1);
        System.out.println(boxString.get());
        System.out.println(boxInt.get());
      /*
        benefit of the GenericBox class over the box class is that
        we can still have any type of box we want, but we need to specify it
        when we create a box
        */

        /*
        will compile (number and parents(object))
        GenericBox<? super Number> b1 = new GenericBox<>("Hello");

        wont compile (number and children)
        GenericBox<? extends Number> b2 = new GenericBox<>("Hello");
         */
    }
}
