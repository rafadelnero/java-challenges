package com.javachallenges.javaone;

public class PolymorphismChallenge {
    static abstract class Simpson {
        void talk() { System.out.print("Simpson! "); }
    }

    static class Homer extends Simpson {
        void talk() {
            System.out.print("Spider Pig! ");
        }
    }

    static class Bart extends Simpson { protected void talk() {
        System.out.print("Eat my shorts! ");}}

    static class Maggie extends Simpson {
        void talk(String toMe){
            System.out.print("I love Sax! ");}}

    public static void main(String[] args) {
        new Homer().talk();
        Simpson simpson = new Bart();
        simpson.talk();
        new Maggie().talk();
    }
    // A) Simpson! Simpson! Simpson!   // B) Spider Pig! Eat my shorts! I love Sax!
    // C) ???                          // D) Spider Pig! Eat my shorts! Simpson!

    // Explore static blocks to initialise variables

}
