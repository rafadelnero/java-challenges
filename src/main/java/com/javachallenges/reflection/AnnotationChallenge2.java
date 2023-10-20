package com.javachallenges.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationChallenge2 {
    public static void main(String... doYourBest) {
        System.out.println(Jedi.class.getDeclaredFields()[0]
                .getAnnotation(Column.class).name());
        System.out.println(Jedi.class.getDeclaredFields()[1]
                .getAnnotation(Column.class).name());
        System.out.println(Jedi.class.getDeclaredFields()[2]
                .getAnnotation(Column.class).name());
    }

    static class Jedi {
        @Column(name="attack_type")
        protected String attackType;
        @Column(name="age")
        private String age;
        @Column(name="saber")
        String saber;
    }
    @Retention(RetentionPolicy.RUNTIME)
    @interface Column { String name(); }
}
