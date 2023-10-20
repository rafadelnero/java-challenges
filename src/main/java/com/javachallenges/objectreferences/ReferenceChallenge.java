package com.javachallenges.objectreferences;

public class ReferenceChallenge {

	public static void testRefs(String str, StringBuffer sb) {
		str = str + sb.toString();
		sb.append(str);

		str = null;
		sb = null;
	}

	public static void main(String... doYourBest) {
		String s = "knight";
		StringBuffer sb = new StringBuffer("sword");
		testRefs(s, sb);
		// sb -> StringBuffer Memory Heap

		System.out.println("s=" + s + " sb=" + sb);
	}
	
}
