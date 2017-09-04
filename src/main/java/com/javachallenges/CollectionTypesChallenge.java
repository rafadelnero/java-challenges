package com.javachallenges;

import java.util.SortedSet;
import java.util.TreeSet;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class CollectionTypesChallenge {

	public static void main(String... doYourBest) {
		SortedSet<String> set = new TreeSet<String>();

		set.add("b");
		set.add("c");
		set.add("a");

		System.out.println(set.headSet("c"));
		System.out.println(set.tailSet("b"));
	}

}
