package com.javachallenges.javaone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamChallenge {
    public static void main(String... doYourBest) {
        List<Simpson> simpsons = Arrays.asList(
                new Simpson("Homer", 35), new Simpson("Margie", 30),
                new Simpson("Bart", 10), new Simpson("Lisa", 8));

        simpsons.stream()
            .map(e -> e.age)
            .filter(age -> age >= 30)
            .min(Comparator.naturalOrder())
            .ifPresent(simpsonAge -> {
                    IntStream.iterate(simpsonAge, age -> age + 1)
                             .forEachOrdered(System.out::println);
            });
    }

    static class Simpson {
        String name;
        int age;
        public Simpson(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}