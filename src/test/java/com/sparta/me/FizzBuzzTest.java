package com.sparta.me;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("Given that the input is zero, return zero")
    void givenThatTheInputIsZeroReturnZero() {
        assertEquals("0", FizzBuzz.fizzbuzz(0));
    }

    @Test
    @DisplayName("Given that the input is one, return one")
    void givenThatTheInputIsOneReturnOne() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    @DisplayName("Given that the input is 3, return fizz")
    void givenThatTheInputIs3ReturnFizz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }
}
