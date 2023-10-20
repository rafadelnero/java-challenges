package com.javachallenges.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfChallenger {

    public static void main(String... doYourBest) {
        List<String> strings = List.of("Test", "Test2");
        List<String> newList = List.copyOf(strings);

        newList.add("Test3");
        System.out.println(newList);
    }
}
