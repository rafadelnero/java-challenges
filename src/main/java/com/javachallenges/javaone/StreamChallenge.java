package com.javachallenges.javaone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamChallenge {
    public static void main(String[] doYourBest) {
        List<Simpson> simpsons = Arrays.asList(new Simpson("Homer", 35),
                new Simpson("Margie", 30), new Simpson("Bart", 10),
                new Simpson("Lisa", 8));

        Integer simpsonAge = simpsons.stream().map(e -> e.age)
                .filter(age -> age >= 20)
                .min(Comparator.naturalOrder()).get();

//        System.out.println(Optional.of(simpsonAge).orElse(2));

        Optional.of(simpsonAge).ifPresent(theAge -> {
            int minAge = IntStream.iterate(theAge, j -> j + 1).limit(50).min().orElse(2);
            System.out.println(minAge);
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
    // A) 2     B) NullPointerException
    // C) 30    D) 35

    // using Optional
    // change to use infinite streams
}
