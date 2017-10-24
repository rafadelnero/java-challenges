package com.javachallenges.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FunctionsStreamChallenge {

    public static void main(String... doYourBest) {
        Optional<Integer> number = Stream.iterate(0, n -> n + 1)
                .filter(FunctionsStreamChallenge::isEven)
                .filter(n -> n >=5)
                .map(n -> n * 2)
                .limit(20)
                .findAny();

        System.out.println(number);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
