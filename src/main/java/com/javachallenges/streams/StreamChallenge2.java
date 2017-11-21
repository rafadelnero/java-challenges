package com.javachallenges.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamChallenge2 {

    public static void main(String... doYourBest) {
        List<Jedi> jediList = List.of(new Jedi("Luke", 10), new Jedi("Anakin", 10),
                new Jedi("ObiWan", 11));

        Map<Integer, List<Jedi>> jediByAge =
                jediList.stream()
                .filter(j -> j.age < 10)
                .collect(Collectors.groupingBy(j -> j.age));

        List<Jedi> newJediList = Optional.ofNullable(jediByAge.get(10))
                .orElse(List.of(new Jedi("QuiGon", 20)));

        System.out.println(newJediList.get(0).name);
    }

    static class Jedi {
        private String name;
        private int age;
        public Jedi(String name, int age) { this.name = name; this.age = age; }
    }

}
