
# THESE ARE THE QUESTIONS , ANSWERED THROUGH BILGE ADAM ACADEMY JAVA BOOST TRAINING BOOTCAMP.



## QUESTIONS;

---

### Question 001;
Today is the sunday. What will be the day after 178 days passed?

```java \n
/**
 * NUMERİC SYMBOL OF THE WEEK DAYS;
 0 -> Sunday
 1 -> Monday
 2 -> Tuesday
 3 -> Wednesday
 4 -> Thursday
 5 -> Friday
 6 -> Saturday
 */
public class Question_001 {
    public static void main(String[] args) {
    
        int numberOfDaysPassed=178;
        int numericSymbolOfToday=0;
        int numberOfTheDaysInAWeek=7;

        int numericSymbolOfTheDayAfter178DaysPassed= numberOfDaysPassed % numberOfTheDaysInAWeek;
        System.out.println("Numeric Symbol Of The Day After 178 Days Passed: ="+numericSymbolOfTheDayAfter178DaysPassed);
        //answer is => 3 -> Wednesday

    }

}
```
---
### Question 002;
Find the number between 1 and 100 that could be divide 5 or/and 8 => use while loop. could be answered with for loop.

``` java \n
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
```
---
### Question 003;
Take a number and then create pattern below; <br>
1<br>
1 2<br>
1 2 3<br>
1 2 3 4<br>
.<br>
.<br>
.
``` java \n

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
```

---

### Question 004;
take a number and create the pattern below;
for example number is 5;

     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

``` java  \n

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
```

---

### Question 005;
take a number and create the pattern below;
for example number is 5;<br>
* * * * * <br>
* * * * * <br>
* * * * * <br>
* * * * * <br>
* * * * * <br>

solve with using one for loop

``` java  \n
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
```

---
### Question 006;
Find the numbers of odd numbers between 1 and 100

``` java \n
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
```

---
### Question 007;
take 3 number from user and determine big and small numbaer, then subtract small from big and print the subtraction
``` java \n
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
```

---
### Question 008;
produce random number between 1 and 100 then ask the user to find this randomly produced number until user coulf find it.

note; use Random class... it used like;
Random random= new Random();
int randomlyProducedNumber= random.nextInt(bound:100);

``` java \n
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
```

---