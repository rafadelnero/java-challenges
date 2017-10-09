package com.javachallenges.innerclasses;

/** Soon you will see the answers on 
 *   nobugsproject.com */
public class InnerClassChallenge {
	String a;
	class A {
		String a = "noBugs";
		String get() {return a;} class B extends A {
			String b = "noStress"; String get() {return b;}
			class C extends A { String c = "doYourBest";
				String get() {return c;} }
		}}

	public static void main(String... doYourBest) {
		A a = new InnerClassChallenge().new A().new B();
		A.B.C c = new InnerClassChallenge().new A().new B().new C();
		A a2 = new InnerClassChallenge().new A();
		
		System.out.println(a.get() + c.get() + a2.get());
	}
}

