package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

       // initializing and declaring datatypes
        String favoriteColor = "Red";
        int year = 2026;
        String middleInitial = null;
        boolean havePets = false;
        String niceMessage = "You will become great, and you will achieve great things";

        // add declared datatypes in a sentence
        System.out.println("The answer is " + favoriteColor );
        System.out.println("The answer is " + year );
        System.out.println("The answer is " + middleInitial);
        System.out.println("The answer is " + havePets);
        System.out.println("The nice message is " + niceMessage);


        //Step 2
        int daysInWeek = 7;
        double coffeePrice = 4.99;
        char favoriteLetter = 'L';
        boolean is_raining = false;

        //print all variables in complete sentence
        System.out.println("There are " + daysInWeek + " days in a week");
        System.out.println("The coffe price at dunkin is " + coffeePrice + "$");
        System.out.println("My favorite letter is " + favoriteLetter);
        System.out.println("Does it rain a lot in the summer? " + is_raining);

    }
}
