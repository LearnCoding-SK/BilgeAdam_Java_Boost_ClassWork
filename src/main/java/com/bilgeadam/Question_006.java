package com.bilgeadam;

/**
 *  Question 006;
 *  find the number of odd numbers between 1 and 100
 */

public class Question_006 {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 0; i <=100 ; i++) {

            if(i%2==1){
                counter++;
            }
        }
        System.out.println("number of odd numbers between 1 and 100 is = "+ counter);

    }
}
