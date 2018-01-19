package com.javachallenges.streams;

import java.util.List;

public class StreamChallenge10 {
    public static void main(String... doYourBest) {
        List<Simpson> simpsonList = List.of(new Simpson("Homer", 35),
                new Simpson("Margie", 35), new Simpson("Bart", 10),
                new Simpson("Lisa", 8));

        simpsonList.stream().filter(simpson -> simpson.getName().equals("Bart"))
                .filter(simpson -> simpson.getAge() > 9)
                .findFirst();
    }
    static class Simpson {
        private String name;
        private int age;
        public Simpson(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            System.out.println(name);
            return name;
        }
        public int getAge() {
            System.out.println(age);
            return age;
        }
    }
}

