package com.javachallenges;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableChallenge {
	public static void main(String... doYourBest) {
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("1", "Tyrion");
		map.put("2", "Jaime");
		map.put("3", "Arya");
		map.put("100", "Jon Snow");
		map.put("101", "Cersei");

		System.out.println(map.ceilingKey("20"));
		System.out.println(map.floorKey("260"));

		System.out.println(map);
	}
	//// 3\n null
    ///  3
    ///  2
    ///  {1=Tyrion, 100=Jon Snow, 101=Cersei, 2=Jaime, 3=Arya}
    ///x
}
