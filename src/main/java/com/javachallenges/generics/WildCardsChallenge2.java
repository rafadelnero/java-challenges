package com.javachallenges.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsChallenge2 {

    public static void main(String... doYourBest) {
        wild(new Generic<String>());
        List<Number>list = wild2(new ArrayList<Number>());

        list.forEach(System.out::println);
    }

    static class Generic<T extends Object> {}

    static<T extends Object> void wild(Generic<T> generic) {
        System.out.println("wild1");
    }

    static<T> List<T> wild2(List<T> list) {
        list.add((T)new Object());
        list.add((T) new String());
        list.add((T) Double.valueOf("3"));

        return list;
    }
}

