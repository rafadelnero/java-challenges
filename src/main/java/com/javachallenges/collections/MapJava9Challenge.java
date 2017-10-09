package com.javachallenges.collections;

import java.util.Map;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class MapJava9Challenge {
	public static void main(String... doYourBest) {
		Map<String, String> map = Map.of("no", "bugs", "no", "stress");
		
		map.put("Do", "YourBest");
		
		map.forEach((k, v) -> {if (k == "no") map.remove(k);});
		
		System.out.println(map);
	}
}
