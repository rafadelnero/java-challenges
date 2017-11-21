package com.javachallenges.streams;

import java.util.List;

public class ParallelChallenge {
    public static void main(String... doYourBest) {
        List<Simpson> simpsons = List.of(new Simpson(10),
                new Simpson(11), new Simpson(15), new Simpson(20),
                new Simpson(22));

        simpsons.stream().parallel()
                .filter(s -> s.age > 10)
                .forEach(System.out::println);
    }
    static class Simpson {
        int age;
        public Simpson(int age) {
            this.age = age;
        }
        public String toString() {
            return ""+ this.age;
        }
    }
}
