package com.javachallenges.reflection;

import java.lang.reflect.Method;

public class ReflectionChallenge3 {

    public static void main(String... doYourBest) throws Exception {
        Method method = ReflectionChallenge3.class.getDeclaredMethod("doStuff");
        method.invoke(new ReflectionChallenge3());

        Method method2 = ReflectionChallenge3.class.getMethod("doStuff");
        method2.invoke(new ReflectionChallenge3());
    }

    void doStuff() {
        System.out.println("doStuff");
    }
}
