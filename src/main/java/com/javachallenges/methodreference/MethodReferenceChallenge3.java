package com.javachallenges.methodreference;

public class MethodReferenceChallenge3 {
    public static void main(String... doYourBest) {
        attack(MethodReferenceChallenge3::printAttack);
        jump(MethodReferenceChallenge3::printJump);
    }

    interface Luke { void attack();}
    interface Anakin { void jump();}
    static void jump(Anakin anakin) { anakin.jump(); }
    static void printAttack() { System.out.println("attack"); }
    static String printJump() {
        String jump = "jump";
        System.out.println(jump);
        return jump;
    }
    static void attack(Luke luke) { luke.attack(); }
}


