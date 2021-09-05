package com.javachallenges.collections;

import java.util.Arrays;
import java.util.List;

/** Soon you will see the answers on
*    nobugsproject.com */
public class ListChallenge {
 
    public static void main(final String... doYourBest) {
        final List<String> soldiers = List.of("Tyrion", "Arya", "John");

        if (soldiers.size() > 3) {
            soldiers.add("Cersei");
        } else {
            soldiers.add("Bran");
        }

        System.out.println(soldiers);
    }
 
}
