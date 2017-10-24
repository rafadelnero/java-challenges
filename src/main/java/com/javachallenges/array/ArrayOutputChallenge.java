package com.javachallenges.array;

import java.util.ArrayList;
import java.util.List;

/** Soon you will see the concepts behind
 *  the scenes on nobugsproject.com */
public class ArrayOutputChallenge {
	 
	public static void main(String... doYourBest) {
		List<String> list = new ArrayList<>();
		
		list.add("Arya");
		list.add("Tyrion");
		list.add("Cersei");
		list.add("Daenerys");
		list.add("Jaime");
		
		doProcess(list);
		
		System.out.println(list.size());
	}
	
	static void doProcess(List<String> list) {
		for (String character : list) {
			if(character.equals("Cersei")) {
				list.remove(character);
			}
		}
	}
	
}
