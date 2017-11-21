package com.javachallenges.streams;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamChallenge {
    public static void main(String... doYourBest) {
        Map<Integer, Map<String, List<Integer>>> map =
                Stream.of(2, 3, 5, 7, 8, 10)
                        .collect(Collectors.groupingBy(i -> i / 5 * 5,
                                TreeMap::new,
                                Collectors.groupingBy(i -> i % 2 == 0 ?
                                        "Even" : "Odd")));

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
