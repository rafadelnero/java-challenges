package com.javachallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/** Soon you will see the answers on 
 *   nobugsproject.com   */
public class ReflectionChallenge {
	public static void main(String... doYourBest) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = ArrayList.class;
		Class c3 = new ArrayList<HashSet<HashMap<
				List, String>>>().getClass();
		System.out.println(c1 == c2 | c3 == c2);
	}
    //// true
    ///  true
    ///x
}
