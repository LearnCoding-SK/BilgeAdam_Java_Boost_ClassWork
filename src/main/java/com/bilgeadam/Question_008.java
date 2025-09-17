package com.bilgeadam;
import java.util.Random;
import java.util.Scanner;

/**
 *  Question 008;
 *  produce random number between 1 and 100 then ask the user to find this randomly produced number until user coulf find it.
 *
 *  note; use Random class... it used like;
 *  1 - Random randomlyProducedNumber= new Random(100);
 *   or
 *  2 - Random random= new Random();
 *      int randomlyProducedNumber= random.nextInt(bound:100);
 *
 */
public class Question_008 {
    public static void main(String[] args) {
        Random random= new Random(100);
        int randomlyProducedNumber = random.nextInt(100);
        int guess;

        // System.out.println("randomly produced number is "+randomlyProducedNumber);  ==> we don't print out the number.

        Scanner input = new Scanner(System.in);

        System.out.println("Computer produce random number between 1 and 100");
        System.out.println("try to find it");

        do{

            System.out.println("enter your guess");

            guess = input.nextInt();
            if(  guess>=0 && guess<=100 && guess<randomlyProducedNumber ){
                System.out.println("You guessed "+guess+" its wrong please increase the guess");

            }else if( guess>=0 && guess<=100 && guess>randomlyProducedNumber ){
                System.out.println("You guessed "+guess+" its wrong please decrease the guess");
            }else  if(guess==randomlyProducedNumber){
                System.out.println("You guessed "+guess+" its correct guess");
            }else {
                System.out.println("You guessed "+guess+" its not suitable for the range of numbers that randomly produced number is created. range is between 1 and 100");
            }

        }while(guess!=randomlyProducedNumber);



    }

}
