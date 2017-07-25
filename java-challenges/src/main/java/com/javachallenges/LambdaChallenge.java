package com.javachallenges;

public class LambdaChallenge {

	public static void main(String[] args) {
		
		use(() -> {
			System.out.println("Kame-ha-me-ha!");
		});
		
	}
	
	static void use(SpecialPower specialPower) {
		specialPower.kamehameha();
	}

	public interface SpecialPower {
		void kamehameha();
	}
}
