package com.javachallenges.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionChallenge4 {
    public static void main(String... doYourBest) throws Exception {
        Constructor<Knight> constructor = Knight.class.getConstructor(String.class);

        Knight knight = constructor.newInstance("katana");
        Method method = knight.getClass().getDeclaredMethod("slash");

        method.invoke(knight, "slash");
    }
    static class Knight {
        private String sword;

        public Knight(String sword) {
            this.sword = sword;
        }
        void slash() { System.out.println(sword + ":slash"); }
        void slash(String slashType) { System.out.println(
                sword + ":" + slashType); }
    }
}
