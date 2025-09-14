public class Question_001 {
    public static void main(String[] args) {

        /*
        Question 001 ; Today is the sunday, what will be the day after 178 days passed
         */

        /*
    NUMERİC SYMBOL OF THE WEEK DAYS;
    0 -> Sunday
    1 -> Monday
    2 -> Tuesday
    3 -> Wednesday
    4 -> Thursday
    5 -> Friday
    6 -> Saturday
     */
        int numberOfDaysPassed=178;
        int numericSymbolOfToday=0;
        int numberOfTheDaysInAWeek=7;

        int numericSymbolOfTheDayAfter178DaysPassed= numberOfDaysPassed % numberOfTheDaysInAWeek;
        System.out.println("Numeric Symbol Of The Day After 178 Days Passed: ="+numericSymbolOfTheDayAfter178DaysPassed);
        // 3 - > Wednesday

    }

}
