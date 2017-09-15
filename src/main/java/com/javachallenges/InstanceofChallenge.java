package com.javachallenges;

import java.util.concurrent.atomic.AtomicInteger;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class InstanceofChallenge {
	
	public static void main(String... doYourBest) {
		if (null instanceof Object)
			System.out.println("null is instance of Object");
		if (null instanceof AtomicInteger)
			System.out.println("null is instance of AtomicInteger");
		if (null instanceof StackOverflowError)
			System.out.println("null is instance of StackOverflowError");
	}
	
}
