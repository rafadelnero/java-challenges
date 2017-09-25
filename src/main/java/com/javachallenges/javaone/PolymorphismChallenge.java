package com.javachallenges.javaone;

public class PolymorphismChallenge {
    static abstract class Simpson {
        void talk() { System.out.println("Simpson!"); }
    }

    static class Homer extends Simpson { public void talk() {
        System.out.println("Spider Pig!");}}

    static class Bart extends Simpson { protected void talk() {
        System.out.println("Eat my shorts!");}}

    static class Lisa extends Simpson { void talk(String toMe) {
        System.out.println("I love Sax!");}}

    public static void main(String... doYourBest) {
        new Homer().talk();
        Simpson simpson = new Bart();
        simpson.talk();
        new Lisa().talk();
    }
}

// A) Simpson! Simpson! Simpson!    B) Spider Pig! Eat my shorts! I love Sax!
// C) ???                           D) Spider Pig! Eat my shorts! Simpson!

// Explore static blocks to initialise variables
