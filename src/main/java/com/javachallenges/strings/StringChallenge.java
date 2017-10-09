package com.javachallenges.strings;

/** Soon you will see the answers on
 *   nobugsproject.com*/
public class StringChallenge {
	
	public static void main(String... doYourBest) {
		String jedi = "masterYoda";
		
		changeString(jedi);
		
		System.out.println(jedi);
	}
	
	static String changeString(String jedi) {
		jedi.replace(jedi, "darthVader");
		
		return jedi;
	}
	
}
