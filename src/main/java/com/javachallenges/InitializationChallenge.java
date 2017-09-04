package com.javachallenges;

/** Soon you will see the answers on
 *   nobugsproject.com*/
public class InitializationChallenge {

		int stallone = getChan();
		static int chuckNorris = 20; 
		int jackieChan = 20;
		int bruceLee = getNorris();

		public int getChan() {
			return jackieChan + 1;
		}
		
		int getNorris() {
			return chuckNorris + 1;
		}

		public static void main(String... doYourBest) {
			InitializationChallenge i = new InitializationChallenge();
			System.out.println(i.stallone + "  " + i.jackieChan
					+ " " + i.bruceLee);
		}
}
