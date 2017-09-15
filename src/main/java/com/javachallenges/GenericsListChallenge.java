package com.javachallenges;

import java.util.ArrayList;
import java.util.List;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class GenericsListChallenge {
	// What is the output?
	public static void main(String... doYourBest) {
		printList(new ArrayList<>());
	}
	
	static void printList(List <? extends Object> list) {
		// list.add(3);
		// list.add(7);
		// list.add(27);
	}
}
