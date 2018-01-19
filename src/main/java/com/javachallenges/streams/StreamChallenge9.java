package com.javachallenges.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamChallenge9 {

    public static void main(String... doYourBest) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 10);

        numbers.addAll(numbers.stream()
                .filter(i -> i > 10)
                .collect(Collectors.toList()));

        numbers.forEach(System.out::println);
    }
}

