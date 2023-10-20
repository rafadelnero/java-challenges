package com.javachallenges.declaration;

/** Soon you will see the answers on
 *  nobugsproject.com  */
public class DeclarationChallenge {
	
	int nobugs = getInt();
	int noStress = 50;

	public int getInt() {
		return noStress + 1;
	}

	public static void main(String... doYourBest) {
		DeclarationChallenge d = new DeclarationChallenge();
		System.out.println(d.nobugs + "  " + d.noStress);
	}
}
