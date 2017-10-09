package com.javachallenges.overloading;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class AdvancedOverloadingChallenge2 {
	static String s = "";
	public static void main(String... doYourBest) {
		int x = 4;
		Boolean y = true;
		short[] sa = { 1, 2, 3 };
		doStuff(x, y);
		doStuff(x);
		doStuff(sa, sa);
		doStuff(4L);
		System.out.println(s);
	}
	
	static void doStuff(Object o) { s += "1"; }
	static void doStuff(Object... o) { s += "2";}
	static void doStuff(Integer... i) { s += "3";}
	static void doStuff(Long l) { s += "4";}
	
}
