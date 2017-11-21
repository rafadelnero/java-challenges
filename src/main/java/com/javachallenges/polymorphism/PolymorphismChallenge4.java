package com.javachallenges.polymorphism;

public class PolymorphismChallenge4 {
    public static void main(String... doYourBest) {
        Dracula dracula = new Dracula();

        ((Alucard)dracula).slash("draculaSlash");

    }
    static class Dracula implements Slash {
        public void slash(String slash) {
            System.out.println(slash);
        }
    }
    static class Alucard extends Dracula {
        void slash() {
            System.out.println("alucard/");
        }
        public void slash(Slash slash) {
            slash.slash("/");
        }
    }
    interface Slash {
        void slash(String slash);
    }
}
