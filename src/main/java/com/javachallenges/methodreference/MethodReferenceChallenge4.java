package com.javachallenges.methodreference;

import java.util.function.BiFunction;

public class MethodReferenceChallenge4 {

    public static void main(String... doYourBest) {
        BiFunction<Integer, Integer, Integer> add = MethodReferenceChallenge4::add;
        int result = add.apply(10, 20);

        BiFunction<Double, Float, Integer> subtract = MethodReferenceChallenge4::subtract;
        result += subtract.apply(10D, (float) 10D);

        System.out.println(result);
    }

    static int add(double a, double b) {
        return (int) (a + b);
    }
    static int subtract(double a, double b) {
        return (int) (a - b + a);
    }

}




