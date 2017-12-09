package com.javachallenges.staticconcepts;

@SuppressWarnings(value = "all")
public class StaticChallenge2 {
    public static void main(String... doYourBest) {
        Simpson homerSimpson = new Simpson("Homer", 35);
        homerSimpson.age++;

        Simpson bartSimpson = new Simpson("Bart", 8);
        bartSimpson.age++;

        System.out.println(homerSimpson.name + bartSimpson.name);
        System.out.println(homerSimpson.age + bartSimpson.age);
    }

    static class Simpson {
        static String name;
        static int age;

        public Simpson(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
