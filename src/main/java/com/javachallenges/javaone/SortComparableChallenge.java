package com.javachallenges.javaone;

import java.util.*;

public class SortComparableChallenge {
    public static void main(String[] args) {
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
    }
    // A) Bart     B) Maggie      C) Marge    D) Indeterminate
    //    Homer       Bart           Maggie
    //    Lisa        Lisa           Lisa
    //    Maggie      Marge          Bart
    //    Marge       Homer          Homer

    // uses multi list reversal

    // As much as is reasonably practical, the hashCode method defined by class
    // Object does return distinct integers for distinct objects.
    // (This is typically implemented by converting the internal address of the object
    // into an integer, but this implementation technique is not required by the Java™
    // programming language.)
}
