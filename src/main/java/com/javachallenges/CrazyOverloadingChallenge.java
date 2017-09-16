package com.javachallenges;

/** Soon you will see the answers on 
 *   nobugsproject.com  */
public class CrazyOverloadingChallenge {
		public void method(Object o) {
			System.out.println("Object!");
		}

		public void method(Exception s) {
			System.out.println("Exception!");
		}

		public void method(RuntimeException s) {
			System.out.println("RuntimeException!");
		}

		public static void main(String ...doYourBest) {
			CrazyOverloadingChallenge challenge = 
					new CrazyOverloadingChallenge();
			challenge.method(null);
		}

		//// Object
        ///  RuntimeException!
        ///wtf
}
