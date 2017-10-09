package com.javachallenges.overloading;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class VarArgsChallenge {
	public static void main(String... doYourBest) {
		String result = doStuff("no", "bugs", "project");
//		result += doStuff(null, 30);
		
		System.out.println(result);
	}
//	static String doStuff(String...varArgs, Integer number) {
//		return number.toString();
//	} It's not possible to use varArgs before any parameter.
	
	static String doStuff(String ...varArgs) {
		String noBugs = "";
		
		for (String var : varArgs) {
			noBugs += var;
		}
		return noBugs;
	}
}
