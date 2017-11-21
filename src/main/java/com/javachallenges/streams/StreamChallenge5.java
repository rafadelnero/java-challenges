package com.javachallenges.streams;

import java.util.List;

public class StreamChallenge5 {
    public static void main(String... doYourBest) {
        List<Jedi> jediList = List.of(new Jedi("Luke", 20), new Jedi("ObiWan", 30),
                new Jedi("QuiGon", 40));

        jediList.stream()
                .filter(jedi -> jedi.name.startsWith("Obi"))
                .filter(jedi -> jedi.name.startsWith("Lu"))
                .map(Jedi::getAge)
                .filter(age -> age > 30)
                .forEach(age -> System.out.println(age));
    }
    static class Jedi {
        private String name;
        private int age;
        public Jedi(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() { return name; }
        public int getAge() { return age; }
    }
}
