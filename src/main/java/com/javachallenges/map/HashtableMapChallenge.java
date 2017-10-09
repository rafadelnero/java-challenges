package com.javachallenges.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class HashtableMapChallenge {
	
	public static void main(String... doYourBest) {
		Map<String, String> map = new HashMap<>();
		map.put(null, "Dracarys");
		map.put(null, "Slash");
		
		Map<String, String> hashtable = 
				new Hashtable<String, String>();
		
		hashtable.putAll(map);
		
		System.out.println(hashtable);
	}
	
}
