package com.javachallenges.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalChallenge4 {

    public static void main(String... doYourBest) {
        List<Integer> list = List.of(10, 1, 3, 5, 7, 9);

        Optional<Integer> number =
                list.stream()
                .takeWhile(i -> i > 5)
                .dropWhile(i -> i > 9)
                .findFirst()
                .or(() -> Optional.of(777));

        System.out.println(number);
    }

}
