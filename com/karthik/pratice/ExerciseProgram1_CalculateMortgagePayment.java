package com.karthik.pratice;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExerciseProgram1_CalculateMortgagePayment {

    public static void main(String[] args) {
        // define constant using final keyword.
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Annual interest rate: ");
        float annualInterestRate = sc.nextFloat();
        float montlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.print(" Period ( years ) ");
        byte years = sc.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        /*
        * Calculating Mortgage Payments with an Equation refer https://www.wikihow.com/Calculate-Mortgage-Payments
        * */
        double mortgage = principal * (montlyInterestRate * Math.pow(1 + montlyInterestRate, numberOfPayments)) / (Math.pow(1 + montlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage payment is " + mortgageFormatted);




    }

}
