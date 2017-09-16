package com.javachallenges;

/** Soon you will the answers on
 *   nobugsproject.com   */
public class AdvancedOverloadingChallenge3 {
	static String x = "";
	public static void main(String... doYourBest) {
		executeAction(1);
		executeAction(1.0);
		executeAction(new Double("5"));
		executeAction(1L);
		
		System.out.println(x);

		//// 6733
		///  6736
        ///x
	}
	static void executeAction(int ... var) {x += "1"; }
	static void executeAction(Integer var) {x += "2"; }
	static void executeAction(Object var) {x += "3"; }
	static void executeAction(short var) {x += "5"; }
	static void executeAction(float var) {x += "6"; }
	static void executeAction(double var) {x += "7"; }
}
