package com.karthik.pratice;

import java.util.Scanner;

public class ExerciseProgram2_FIZZBUZZ {
    public static void main(String[] args) {
        System.out.println("FIZZ BUZZ Application");
        Scanner scanner = new Scanner(System.in);
        String userAction;


        do {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (number % 5 == 0) {
                System.out.println("FIZZ");
            } else if (number % 3 == 0) {
                System.out.println("BUZZ");
            } else
                System.out.println(number);

            System.out.println("do you want to continue ?");
            userAction = scanner.next();
        } while (userAction.equals("yes") ? true : false);




    }


}
