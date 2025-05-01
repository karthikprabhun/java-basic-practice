package com.karthik.pratice;

import java.util.Scanner;

public class MyMain_Section_2 {
    public static void main(String[] args) {

        // boolean expression - double, not, less than or greater then equal
        int x = 10;
        int y = 20;
        if (x == y) // this is a boolean expression
            System.out.println("x == y");
        else
            System.out.println("x != y");

        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Be hydrated");
        } else if (temp > 20 && temp < 30)
            System.out.println("It's a beautiful day");
        else
            System.out.println("It's a cold day");

        //logical operator - combine booleans expression.  ! -> not operator reverse the operation.

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;

        if (isEligible)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");

        System.out.println("Ternary Operator");
        int numberOfBooksRead = 12;
        /*String className = "First";  // avoid set class name using if statement , instead use ternary operator like below
        if (numberOfBooksRead <= 10)
            className = "Second";
        */
        String className = numberOfBooksRead >= 10 ? "First" : "Second";
        System.out.println("className = " + className);
        String role = "moderator";
        switch (role) {
            case "admin":
                System.out.println(" you are an admin");
                break;
            case "moderator":
                System.out.println(" you are a moderator");
                break; // check what happens if you remove break ?
            default:
                System.out.println("You are a guest");

        }


        System.out.println("Continue & Break statement");
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println(" Do you wan to continue? (Y/N)");
            input = sc.next().toUpperCase();
            if (input.equals("Y"))
                continue; // control goes back to beginning of while
            else
                break; //comes out of the loop

        }


    }
}
