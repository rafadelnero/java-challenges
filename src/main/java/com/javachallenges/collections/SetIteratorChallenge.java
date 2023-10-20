package com.javachallenges.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/** Soon you will see the answers on
 *    nobugsproject.com  */
public class SetIteratorChallenge {

	public static void main(String... doYourBest) {
		Set set = new TreeSet();
		set.add("2");
		set.add(1); 
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "");
		}
	}

}
