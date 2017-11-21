package com.javachallenges.logicaloperators;

public class LogicalOperatorsChallenge3 {

    public static void main(String... doYourBest) {
        int num1 = 7;
        int num2 = 7;

        if (num1 > num2 && num1++ > ++num2) {
            num1++;
        }

        if (++num2 > num1 || num1++ == num2++) {
            num1++;
        }

        System.out.println(num1 + ":" + num2);
    }

}
