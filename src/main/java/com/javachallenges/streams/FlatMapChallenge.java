package com.javachallenges.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapChallenge {
    public static void main(String... doYourBest) {
        Animal a1 = new Animal("Dinosaur", Set.of("Chicken", "Ice Cream"));
        Animal a2 = new Animal("Dog", Set.of("Bones", "Cheese Burger", "Soda"));

        List<String> collect =
                List.of(a1, a2).stream()
                        .map(x -> x.getFoods())
                        .flatMap(x -> x.stream())
                        .limit(4).filter(x -> x.matches(".*"))
                        .distinct()
                        .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));
    }

    static class Animal {
        private String name;
        private Set<String> foods;
        public Animal (String name, Set<String> foods) {
            this.name = name;
            this.foods = foods; }

        public Set<String> getFoods() { return foods; }
        public String getName() { return name; }
    }
}
