package com.javachallenges.polymorphism;

@SuppressWarnings(value = "all")
public class PolymorphismChallenge6 {
    public static void main(String... doYourBest) {
        Alucard alucard = new Alucard();

        System.out.println(((Dracula)alucard).getName() + alucard.getName());

        Dracula dracula = new Alucard();
        System.out.println(((Dracula)dracula).name + ((Dracula)dracula).getName());
    }
    static class Dracula {
        String name = "Dracula";

        String getName(){ return this.name; }
    }
    static class Alucard extends Dracula {
        String name = "Alucard";
        String getName(){
            return this.name;
        }
    }
}

