package com.javachallenges.streams;

import java.util.stream.IntStream;

public class StreamChallenge7 {

    public static void main(String... doYourBest) {
        IntStream.iterate(10, i -> i >= 0, i -> i  - 2)
                .filter(i -> i > 5 && i < 10)
                .sorted()
                .forEach(System.out::println);
    }

}

