package com.javachallenges.declaration;

/** Soon you will see the answers on
 *   nobugsproject.com   */
public class ScopeChallenge {
	
	public static void main(String... doYourBest) {
		int count;
		int another;
		
		if (1 == 1) {
			another = 5;
		}
		
		if (1 != 1) {
			System.out.println(count++);
		}
		
		System.out.println(another++);
	}
	
}
