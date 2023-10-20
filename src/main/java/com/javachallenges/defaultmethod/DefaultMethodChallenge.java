package com.javachallenges.defaultmethod;

public class DefaultMethodChallenge {

    public static void main(String... doYourBest) {
        Jofrey jofrey = new Jofrey() {
            @Override
            public void kill() {
                Jofrey.super.kill();
            }
        };

        jofrey.kill();
    }

    interface Cersei {
        default void kill() {
            System.out.println("When you play the Game of Thrones, you win or die");
        }
    }

    interface Jofrey extends Cersei {
        default void kill() {
            System.out.println("Kill them all!");
        }
    }
}


