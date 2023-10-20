package com.javachallenges.generics;

/** Soon you will see the answers on
 *   nobugsproject.com   */
public class WildCardsChallenge {
	
		interface Zeus {}
		interface Kratos extends Zeus { }
		interface Atreus extends Kratos { }
		static class Sparta<T> {}
		static void foo(Sparta<? super Kratos> arg) {}

		public static void main(String ... doYourBest) {
			foo(new Sparta<Zeus>()); 
			
			foo(new Sparta<Kratos>()); 
			//foo(new C<Atreus>());
			foo(new Sparta()); 
			
			System.out.println("Everything went fine!");
		}

}
