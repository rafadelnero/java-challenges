package com.javachallenges.logicaloperators;

public class LogicalOperatorsChallenge2 {

    public static void main(String... doYourBest) {
        int num1 = 5;
        int num2 = 5;

        if (num1 > num2 & num1++ > ++num2) {
            num1++;
        }

        if (++num2 > num1 || num1++ == num2++) {
            num1++;
        }

        System.out.println(num1 + ":" + num2);
    }

}
