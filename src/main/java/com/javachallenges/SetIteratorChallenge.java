package com.javachallenges;

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
    //// 2 1 1
    ///  Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
    ///     at java.lang.Integer.compareTo(Integer.java:52)
    ///     at java.util.TreeMap.put(TreeMap.java:568)
    ///     at java.util.TreeSet.add(TreeSet.java:255)
    ///     at com.javachallenges.SetIteratorChallenge.main(SetIteratorChallenge.java:14)
    ///x
}
