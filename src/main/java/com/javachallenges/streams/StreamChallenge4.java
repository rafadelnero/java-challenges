package com.javachallenges.streams;

import java.util.stream.IntStream;

public class StreamChallenge4 {

    public static void main(String... doYourBest) {
        System.out.println(isPrime(6));
    }

    static boolean isPrime(final int number) {
        return number > 1 && IntStream.range(2, number)
                .noneMatch(index -> {
                    boolean lol = number % index == 0;

                    return false;
                });
    }

}
