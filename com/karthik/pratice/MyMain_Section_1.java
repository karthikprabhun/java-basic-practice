package com.karthik.pratice;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MyMain_Section_1 {
    public static void main(String[] args) {

        /* This program demonstrates basic concepts like Variables - primitive & reference types ,
        constant, casting - implicit and explicit,arithmetic operation and logical ops
         , Arrays , conditional statements, reading / write input   */

        MyFirstFunction myFirstFunction = new MyFirstFunction();
        myFirstFunction.helloWorld();

        myFirstFunction.helloWorldWithArgument("from Karthik");

        System.out.println(myFirstFunction.sum(10, 99));

        /* Primitive Types - copies value not reference address */
        byte age = 30;  // range -127 to 128
        int viewsCount = 123_456_789; // int is 4 bytes - replace 3_123_456_789
        long viewsCountX = 3_123_456_789L; // long is 8 bytes
        float price = 10.99F; // to store decimal number - suffix at the end required - 4 bytes
        double priceDouble = 10.99; // 8 bytes
        char letter = 'A'; // store a single character
        boolean result = true;

        /* Reference types */
        Date date = new Date(); // imported from java.util.*
        date.getTime(); // Reference type as members

       /* Primitive vs Reference Type
        new keyword is used to allocate memory whereas in primitive this is taken care automatically.
        Primitive does have member function*/

        /*Memory Managaement*/

        int x = 10;
        int y = x;
        x = 20;
        System.out.println(y); // primitive type copies value not reference, hence the value stored are independent of each other

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        point1.y = 2;

        System.out.println(point2);

        // In the above primitive example,x and y both are independent. Change in x value does not change y
        // Whereas as in reference type, the change in value reflected in other as both are referencing to same object or memory
        // i.e.Primitive store actual values whereas reference type store references or address
        // Reference types are copied by references whereas primitive types are copied by values.

        /* String Class */
        String message = "hello world" + "!!"; // new String("hello world");
        message.toUpperCase();
        System.out.println("String Class Demo : " + message + " with length " + message.length() + " replace ! with * " + message.replace("!", "*"));
        System.out.println(message); // This prints the original value , becz String is immutable in java. i.e. we can't mutate them.
        // Any method that modifies will always return new String object.

        /* Escape Sequences - Double quotes, back slash , tab space*/
        String text = "c:\twindows\\learn\\karthik\"";
        System.out.println(text);

        /* Arrays  - fixed length */

        int[] numbers = new int[5]; // ={10,33,9,89};
        numbers[0] = 13;
        numbers[1] = 12;
        numbers[2] = 35;
        System.out.println(numbers.length);
        System.out.println(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        /* Multi dimesntional array*/

        int[][] table = new int[5][5];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[0][3] = 4;
        table[0][4] = 5;
        table[1][0] = 10;

        System.out.println(Arrays.deepToString(table)); // toString() will not show content inside multidimensional array


        /* Constants - use final keyword */

        final float PI = 3.14f; // use capital letter as convention to define constant
        System.out.println(PI);

        /* Mathematical Operations */
        int x1 = 1;
        x1++; //++x1; post and pre fix return same result. however if used with right side of assignment operation it will change
        /* int y1 = x1++;*/  // y1 not incremented but x1 is
        int y1 = ++x1; // both y1 & x1 incremented
        System.out.println("X : " + x1 + " y : " + y1);

        /* augmented assignment operator*/
        int z1 = 1;
        z1++;
        z1 += 2; // same as z1 = z1 + 2
        // z1 -=2;
        System.out.println("Z : " + z1);

        /* Casting */
        // Implicit casting -  in this case jvm will automatically create temp var with suitable type before performing type converstion
        // bytes > short > int > long > float > double
        Short a = 10;
        int a1 = a + 2; // here 2 is int, a is short and a1 is integer
        System.out.println("A : " + a1);

        // Explicit Casting - use wrapper class cast function to type cast to suitable type

        String val = "1.1";
        double toDouble = Double.parseDouble(val) + 2; // Use wrapper class method to cast type
        System.out.println(toDouble);

        /* Number formating */
        // NumberFormat currencyFormat = new NumberFormat(); // NumberFormat is abstract class, hence instantiation not allowed.
        NumberFormat percent = NumberFormat.getCurrencyInstance(); // getCurrencyInstance() is a factory method
        String text1 = percent.format(0.1);
        System.out.println(text1);
        /* or */
        System.out.println(NumberFormat.getCurrencyInstance().format(0.1)); // Method chaining.

        /* Reading input */

        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Age: ");
        byte age2 = scanner.nextByte(); // to read floatuse nextFloat() and for string use nextline()
        System.out.println("your age is :" + age2);*/

        System.out.print("What's your name:");
        String name = scanner.nextLine().trim(); // next() will if there is a space between words
        System.out.println("your name is :" + name);
        System.out.print("What's your favorite color: ");
        String color = scanner.next();
        System.out.println("your color is :" + color);
        System.out.print("What's your favorite number: ");
        int number = scanner.nextInt();
        System.out.println("your number is :" + number);

    }
}
