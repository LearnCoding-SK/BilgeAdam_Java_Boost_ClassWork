
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

```java \n
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

### Question 005;