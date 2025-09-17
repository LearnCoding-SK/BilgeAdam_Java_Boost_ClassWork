package com.bilgeadam;

/**
 * Question 003;
 * Take a number from user and then create pattern below; <br>
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * .
 * .
 * .
 */
public class Question_003 {
    public static void main(String[] args) {

        int number;
        number = 5;

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j);
            }
            System.out.println();


        }


    }
}
