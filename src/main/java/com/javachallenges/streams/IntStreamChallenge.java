package com.javachallenges.streams;

import java.util.List;

public class IntStreamChallenge {
    public static void main(String... doYourBest) {
        List<Jedi> jediList = List.of(new Jedi("Luke", 30), new Jedi("Anakin", 55),
                new Jedi("ObiWan", 65));

        int sum = jediList.stream()
                .mapToInt(Jedi::getAge)
                .takeWhile(a -> {
                            System.out.println(a);
                            return a < 50;
                    }
                ).filter(a -> a >= 60)
                .sum();
        System.out.println(sum);
    }
    static class Jedi {
        private String name;
        private int age;
        public Jedi(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }
}
