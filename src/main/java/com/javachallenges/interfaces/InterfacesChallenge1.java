package com.javachallenges.interfaces;

public class InterfacesChallenge1 {

    interface Jedi {
        default int attack() {
            return jump() + useSaber() + useForce();
        }
        private int useForce() {
            return Integer.valueOf("5");
        }
        private static int useSaber() {
            return Integer.valueOf("3");
        }
        private int jump() {
            return Integer.valueOf("1");
        }
    }

    public static void main(String... doYourBest) {
        System.out.println(new Jedi() {}.attack() + Jedi.useSaber());
    }
}
