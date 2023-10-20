package com.javachallenges.reflection;

import java.lang.reflect.Field;

public class ReflectionChallenge5 {
    public static void main(String... doYourBest) throws Exception {
        Knight knight = new Knight();

        for (Field field : Knight.class.getDeclaredFields()) {
            System.out.println(field.get(knight));
        }
    }
    static class Knight {
        public String sword = "masamune";
        int level = 99;
        private String armor = "dragonScaleArmor";
    }
}
