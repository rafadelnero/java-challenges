package com.javachallenges.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamChallenge6 {

    public static void main(String... doYourBest) {
        List<Integer> list = Arrays.asList(1, 6, 7, 90, 100);

        list.stream()
                .takeWhile(e -> e < 100)
                .dropWhile(e -> e < 50)
                .forEach(System.out::println);
    }

}

