package com.bilgeadam;

/**
 * take a number and create the pattern below;
 *   for example number is 5;
 *     * * * * *
 *     * * * * *
 *     * * * * *
 *     * * * * *
 *     * * * * *
 */

public class Question_004 {
    public static void main(String[] args) {
        
        int number= 5;

        for (int i = 0; i < number; i++) {
            for (int j = 0 ; j < number; j++) {
            System.out.print("* ");
            }
            System.out.println();
        }



    }
}
