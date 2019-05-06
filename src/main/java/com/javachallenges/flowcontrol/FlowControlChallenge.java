package com.javachallenges.flowcontrol;

public class FlowControlChallenge {

    static String String;

    public static void main(String... doYourBest) {
        System.out.println(String);

        boolean isHomerFat;
        boolean isBartPrankster = false;

        int result = 0;

        if (isHomerFat = true | (isBartPrankster = true)) {
            result++;
            isHomerFat = false;
        }

       // condition && condition
        if (isHomerFat || isBartPrankster & (isBartPrankster = false || isHomerFat)) {
            result++;
        }

        if (!isHomerFat && !isBartPrankster) {
            result++;
        }

        System.out.println(String.valueOf(result) + isHomerFat + isBartPrankster);
    }
}

// Rodrigo Rinaldo 2falsefalse
// Farhad Dorival  Compilation fails
