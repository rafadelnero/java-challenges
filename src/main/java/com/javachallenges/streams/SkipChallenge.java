package com.javachallenges.streams;

import java.util.List;

public class SkipChallenge {

    public static void main(String ... doYourBest) {
        List<Corleone> list = List.of(new Corleone("Vito"),
                new Corleone("Michael") , new Corleone("Sony"),
                new Corleone("Fredo"));

        list.stream().parallel()
                .skip(4)
                .limit(4)
                .findFirst().ifPresent(System.out::println);
    }

    static class Corleone {
        private String name;

        public Corleone(String name) {
            this.name = name;
        }
        public String toString() {
            return this.name;
        }
    }

}
