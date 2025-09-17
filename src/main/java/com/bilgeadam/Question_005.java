package com.bilgeadam;

/**
 * take a number and create the pattern below;
 * for example number is 5;
 *     * * * * *
 *     * * * * *
 *     * * * * *
 *     * * * * *
 *     * * * * *
 *
 * solve with using one for loop
 */

public class Question_005 {

        public static void main(String[] args) {

            int number= 5;

            for (int i = 1 ; i <= number*number; i++) {
                System.out.print("* ");
                if(i%5==0){
                    System.out.println();
                }

            }



}
}
