package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        //Step 3: create item variable, quantity
        String item = "Shoes";
        double itemPrice = 39.99;
        int quantity = 4;

        //Print sentence with the variables
        System.out.printf("You bought %d %s for $%.2f", quantity , item , itemPrice * quantity);

    }
}
