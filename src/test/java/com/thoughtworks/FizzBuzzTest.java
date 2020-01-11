package com.thoughtworks;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_Fizz_when_input_number_include_7_Or_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actualOne = fizzBuzz.getOutputString(7);
        String actualTwo = fizzBuzz.getOutputString(17);
        String actualThree = fizzBuzz.getOutputString(70);
        String actualFour = fizzBuzz.getOutputString(3);
        String actualFive = fizzBuzz.getOutputString(13);
        String actualSix = fizzBuzz.getOutputString(37);
        String actualSeven = fizzBuzz.getOutputString(75);

        //then
        assertEquals(actualOne,"Fizz");
        assertEquals(actualTwo,"Fizz");
        assertEquals(actualThree,"Fizz");
        assertEquals(actualFour,"Fizz");
        assertEquals(actualFive,"Fizz");
        assertEquals(actualSix,"Fizz");
        assertEquals(actualSeven,"Fizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_input_number_include_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actualOne = fizzBuzz.getOutputString(5);
        String actualTwo = fizzBuzz.getOutputString(25);
        String actualThree = fizzBuzz.getOutputString(50);
        String actualFour = fizzBuzz.getOutputString(35);

        //then
        assertEquals(actualOne,"BuzzWhizz");
        assertEquals(actualTwo,"BuzzWhizz");
        assertEquals(actualThree,"BuzzWhizz");
        assertEquals(actualFour,"BuzzWhizz");
    }
}
