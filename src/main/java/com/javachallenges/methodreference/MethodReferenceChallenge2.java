package com.javachallenges.methodreference;

public class MethodReferenceChallenge2 {

    public static void main(String... doYourBest) {
        String shoot = shoot(Soprano::useRevolver);

        System.out.println(shoot + new Gun() {
            public String shoot() { return null; }
        }.reload());
    }

    static String shoot(Gun gun) {
        return gun.shoot() + gun.shoot();
    }

    interface Gun {
        String shoot();
        default String reload() {
           return "reload";
        }
    }

    static class Soprano {
        static String useRevolver() {return "shot";}
    }
}
