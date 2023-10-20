package com.javachallenges.streams;

import java.util.*;

public class SortedStreamChallenge {

    public static void main(String... doYourBest) {
        Set<Hero> heroesSet = Set.of(new Hero("Spider Man"), new Hero("Wolverine"),
                new Hero("Batman"), new Hero("Iron Man"), new Hero("Beast"));

        List<Hero> heroesList = new ArrayList<>();
        heroesList.addAll(heroesSet);

        heroesList.stream()
                .sorted()
                .forEach(w -> System.out.println(w.name));
    }

    static class Hero {
        private String name;
        Hero(String name) {
            this.name = name;
        }
    }

}
