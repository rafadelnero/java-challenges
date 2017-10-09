package com.javachallenges.objectreferences;

/** Soon you will see the answers
 *   on nobugsproject.com */
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

		System.out.println("s=" + s + " sb=" + sb);
	}
	
}
