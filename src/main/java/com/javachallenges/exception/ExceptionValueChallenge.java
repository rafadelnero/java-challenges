package com.javachallenges.exception;

/** Soon you will see the answers
 *    on nobugsproject.com */
public class ExceptionValueChallenge {
		static int kratos, zeus, hades;

		public static void main(String... doYourBest) {
			try {
				test(kratos = 1, lightningOfZeus(zeus = 2), hades = 3);
			} catch (Exception e) {
				System.out.println(kratos + " " + zeus + " " + hades);
			}
		}

		static int lightningOfZeus(int i) throws Exception {
			throw new StackOverflowError("Wowww!");
		}

		static int test(int a, int b, int c) {
			return a + b + c;
		}
}
