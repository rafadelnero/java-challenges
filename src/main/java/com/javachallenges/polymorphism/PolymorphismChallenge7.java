package com.javachallenges.polymorphism;

@SuppressWarnings(value = "all")
public class PolymorphismChallenge7 {
    public static void main(String... doYourBest) {
        Person santa = new SantaClaus("Jet-Pack");
        santa.givePresent();
        new SantaClaus("Rocket-Launcher").givePresent("Little-Duck");
    }
    abstract static class Person {
        protected String present;
        Person(String present) {
            this.present = present;
        }
        void givePresent() {
            System.out.println("Give " + present);
        }
        void givePresent(String present) {
            System.out.println("Give " + present);
        }
    }
    static class SantaClaus extends Person {
        public SantaClaus(String present) {
            super(present);
        }
        void givePresent() {
            System.out.println("Santa " + present);
        }
    }
}

