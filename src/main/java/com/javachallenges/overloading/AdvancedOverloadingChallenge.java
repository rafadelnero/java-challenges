package com.javachallenges.overloading;

public class AdvancedOverloadingChallenge {
	public static void main(String... doYourBest) {
		slash(1L,  Float.valueOf(1));
	}
	
	public static void slash(long val1, Double val2) {
		System.out.println("Long, int");
	}

	public static void slash(long val1, int val2) {
		System.out.println("long, int");
	}
	
	public static void slash(Long val1, Object val2) {
		System.out.println("Long, Object");
	}
}
