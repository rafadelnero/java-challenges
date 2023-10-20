package com.javachallenges.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTypesChallenge {

	public static void main(String... doYourBest) {
		SortedSet<String> set = new TreeSet<>();

		set.add("b");
		set.add("c");
		set.add("a");

		System.out.println(set.headSet("c"));
		System.out.println(set.tailSet("b"));
	}

}
