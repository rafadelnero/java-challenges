package com.javachallenges.polymorphism;

public class PolymorphismChallenge5 {
    public static void main(String... doYourBest) {
        Dracula dracula = new Alucard();

        System.out.println(dracula.name + dracula.getName());

    }
    static class Dracula {
        String name = "Dracula";

        String getName(){
            return this.name;
        }
    }
    static class Alucard extends Dracula {
        String name = "Alucard";
        String getName(){
            return this.name;
        }
    }
}
