package com.bilgeadam;

import java.util.Scanner;

/**
 *  Question 007;
 *  take 3 number from user and determine big and small numbaer,
 *  then subtract small from big and print the subtraction
 */

public class Question_007 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("type three numbers");
        System.out.println("type first number");
        int number1 = input.nextInt();
        System.out.println("type second number");
        int number2 = input.nextInt();
        System.out.println("type third number");
        int number3 = input.nextInt();

        int bigNumber;
        int smallNumber;

        bigNumber=number1;


        if(number2>number1 && number2>number3)bigNumber=number2;
        if(number3>number1 && number3>number2)bigNumber=number3;

        smallNumber=number1;

        if(number2<number1 && number2<number3) smallNumber=number2;
        if(number3<number1 && number3<number2) smallNumber=number3;

        int subtraction=bigNumber-smallNumber;

        System.out.println("The subtraction is "+subtraction);




    }
}
