package com.javachallenges;

import java.util.Arrays;
import java.util.List;

/** Soon you will see the answers on
*    nobugsproject.com */
public class ListChallenge {
 
    public static void main(final String... doYourBest) {
        final List<String> soldiers = Arrays.asList("Tyrion", "Arya", "John");
 
        if (soldiers.size() > 3) {
            soldiers.add("Cersei");
        } else {
            soldiers.add("Bran");
        }
 
        System.out.println(soldiers);
    }
    //// ArrayList@17899
    ///  Exception in thread "main" java.lang.UnsupportedOperationException
    ///     at java.util.AbstractList.add(AbstractList.java:148)
    ///     at java.util.AbstractList.add(AbstractList.java:108)
    ///     at com.javachallenges.ListChallenge.main(ListChallenge.java:16)
    ///x
}
