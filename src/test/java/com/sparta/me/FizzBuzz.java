package com.sparta.me;

public class FizzBuzz {
    public static String fizzbuzz(int input) {
        String output;
        if (input == 3) {
            output = "Fizz";
        } else {
            output = String.valueOf(input);
        }
        return output;
    }
}
