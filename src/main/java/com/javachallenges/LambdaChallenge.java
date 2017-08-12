package com.javachallenges;

/** Soon you will see the answers on 
 * 		nobugsproject.com*/
public class LambdaChallenge {

	public static void main(String ... doYourBest) {
		String gokuPower = use(() -> "Kame-ha-me-ha!");
		String vegetaPower = use(() -> {return "Kame-ha!!";});
		
		System.out.println(gokuPower + vegetaPower);
	}
	
	static String use(SpecialPower specialPower) {
		return specialPower.kamehameha();
	}

	public interface SpecialPower {
		String kamehameha();
	}
}
