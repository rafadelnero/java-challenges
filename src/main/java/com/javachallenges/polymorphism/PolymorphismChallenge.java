package com.javachallenges.polymorphism;

/** Soon you will see the result on
 *  nobugsproject.com             */
public class PolymorphismChallenge {
	static abstract class Simpson {
		void talk() { System.out.println("Simpson!"); }
	}
	static class Homer extends Simpson {
		void talk() {
			System.out.println("Spider Pig!");
		}
	}
	
	static class Bart extends Simpson { protected void talk() {
		System.out.println("Eat my short!");}}
	
	static class Maggie extends Simpson {}
	public static void main(String... doYourBest) {
		new Homer().talk();
		Simpson simpson = new Bart();
		simpson.talk();
		new Maggie().talk();
	}
}
