package com.javachallenges.staticconcepts;

@SuppressWarnings(value = "all")
public class StaticChallenge1 {
    public static void main(String... doYourBest) {
        Homer bart = new Bart();

        System.out.println(bart.age + bart.getAge());

    }
    static class Homer {
        static int age = 35;
        static int getAge(){ return age; }
    }
    static class Bart extends Homer {
        static int age = 8;

        public static int getAge(){
            return age;
        }
    }
}
