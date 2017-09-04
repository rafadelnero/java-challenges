package com.javachallenges;

/** Soon you will see the answers
 *   on nobugsproject.com */
public class ExceptionThrowsChallenge {
	public static void main(String... doYourBest) {
		try {
			doOStuff();
		} catch (Throwable /*| RuntimeException */ e) {
			try {
				throw new RuntimeException(e);
			} catch(RuntimeException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	static void doOStuff() throws Throwable {
		throw new Throwable("Error");
	}
}
