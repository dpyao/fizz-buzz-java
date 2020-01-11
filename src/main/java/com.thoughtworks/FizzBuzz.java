package com.thoughtworks;

public class FizzBuzz {
    public String getOutputString(int number) {
        String numberString = Integer.toString(number);

        if(numberString.contains("7"))
            return "Fizz";
        if(numberString.contains("5"))
            return "BuzzWhizz";
        if(numberString.contains("3"))
            return "Fizz";

        return numberString;
    }
}
