package com.javachallenges.streams;

import java.util.stream.IntStream;

public class StreamChallenge8 {

    public static void main(String... doYourBest) {
        IntStream.iterate(0, i -> i + 2)
                .limit(5)
                .skip(1)
                .sorted()
                .takeWhile(i -> i < 10)
                .dropWhile(i -> i > 2) // Removes the elements if the first condition matches
                .forEach(System.out::println);
    }

}


