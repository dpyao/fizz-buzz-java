package com.thoughtworks;

public class FizzBuzz {
    public Boolean isNumberCanDivided (int number, int divisor) {
        return number % divisor == 0;
    }

    public String getOutputString(int number) {
        String numberString = Integer.toString(number);

        if(numberString.contains("7"))
            return "Fizz";
        if(numberString.contains("5"))
            return "BuzzWhizz";
        if(numberString.contains("3"))
            return "Fizz";

        if(this.isNumberCanDivided(number, 3) || this.isNumberCanDivided(number, 5) || this.isNumberCanDivided(number, 7)) {
            String result = "";

            if(this.isNumberCanDivided(number, 3))
                result += "Fizz";
            if(this.isNumberCanDivided(number, 5))
                result += "Buzz";
            if(this.isNumberCanDivided(number, 7))
                result += "Whizz";

            return result;
        }

        return numberString;
    }
}
