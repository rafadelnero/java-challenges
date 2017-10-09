package com.javachallenges.bitwise;

/** Soon you will see the answers on
     nobugsproject.com */
public class BitWiseChallenge {
	
	public static final int BIT_NUMBER = 6;
	
	public static void main(String... doYourBest) {
		int bitwise =  BIT_NUMBER >>> 1;
		
		System.out.println(Integer.toBinaryString(BIT_NUMBER));
		System.out.println(Integer.toBinaryString(bitwise));
	}
	
}
