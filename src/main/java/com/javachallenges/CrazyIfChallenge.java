package com.javachallenges;

/** Soon you will see the answers on 
 *   nobugsproject.com */
public class CrazyIfChallenge {
	public static void main(String ... doYourBest) {
		boolean testFlag = true;
		
		if (testFlag) 
			if (testFlag) 
				if (testFlag) 
					if (testFlag = false)
						System.out.println("In the first");
					else
						System.out.println("In the second");
				else
					System.out.println("In the third");
			else
				System.out.println("In the fourth");
		
	}

	//// In the first
	///  In the second
    ///x
}
