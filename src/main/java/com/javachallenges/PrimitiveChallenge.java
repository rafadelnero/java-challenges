package com.javachallenges;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class PrimitiveChallenge {
	public static void main(String... doYourBest) {
		switch ((byte) 97) {
		case 'B':
			System.out.println("127");
		case 'A':
			System.out.println('A');
		case (byte)(97 + 1):
			System.out.println(97 + 1);
		case 'a':
			System.out.println('a');
		}
	}
}
