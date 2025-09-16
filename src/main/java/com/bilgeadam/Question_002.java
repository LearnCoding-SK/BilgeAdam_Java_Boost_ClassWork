package com.bilgeadam;

/**
 * Question; Find the number between 1 and 100 that could be divide 5 or/and 8
 */

public class Question_002 {
    public static void main(String[] args) {

        int counter=1;
        while(counter<=100){

            if(counter%5==0 && counter%8==0){
                System.out.println(counter + " could be divided by 5 and 8");
            }else if(counter%8==0){
                System.out.println(counter + " could be divided by 8");
            }else if(counter%5==0){
                System.out.println(counter + " could be divided by 5 ");
            }else {
                System.out.println(counter);
            }
            counter++;
        }

    }
}
