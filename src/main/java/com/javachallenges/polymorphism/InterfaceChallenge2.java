package com.javachallenges.polymorphism;

/** Soon you will see the answers on
 *   nobugsproject.com  */
public class InterfaceChallenge2 {
	public static void main(String... doYourBest) {
		System.out.println(new Java9() {
			@Override
			public int execute() {
				return Java9.super.execute();
			}
		}.execute());
	}
	interface Java9 extends ParentInterface {
		default int execute() {
			return execute(10);
		}
		private int execute(int num) {
			return num;
		}
	}
	interface ParentInterface {
		private int execute(int num) {
		return 20;}}
}
