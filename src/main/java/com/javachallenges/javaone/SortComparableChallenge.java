package com.javachallenges.javaone;

import java.util.*;

public class SortComparableChallenge {
    public static void main(String... doYourBest) {
        Set<Simpson> set = new TreeSet<>();
        set.add(new Simpson("Homer"));
        set.add(new Simpson("Marge"));
        set.add(new Simpson("Lisa"));
        set.add(new Simpson("Bart"));
        set.add(new Simpson("Maggie"));

        List<Simpson> list = new ArrayList<>();
        list.addAll(set);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    static class Simpson implements Comparable<Simpson> {
        String name;
        public Simpson(String name) { this.name = name; }

        @Override
        public int compareTo(Simpson simpson) {
            return simpson.name.compareTo(this.name);
        }

        @Override
        public String toString() { return this.name; }

        @Override
        public boolean equals(Object obj) {
            return ((Simpson) obj).name.equals(this.name);
        }
    }
}
