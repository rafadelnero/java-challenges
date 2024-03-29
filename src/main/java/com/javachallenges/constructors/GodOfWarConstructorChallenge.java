package com.javachallenges.constructors;

public class GodOfWarConstructorChallenge {
	String name;

	GodOfWarConstructorChallenge(String name) { this.name = name; }
	
	GodOfWarConstructorChallenge() { this(getName(1)); }

	GodOfWarConstructorChallenge(int i) { this(getName(2)); }
	
	GodOfWarConstructorChallenge(Object i) { this(getName((Integer) i)); }
	
	static String getName(int index) {
		String name = new String [] {"Kratos","Zeus",
			"Poseidon", "Hades", "Athena"} [index];
		return name;
	}
	
	public static void main(String[] args) {
	    	GodOfWarConstructorChallenge firstGod = 
	    		new GodOfWarConstructorChallenge();
		System.out.println(firstGod.name);
		GodOfWarConstructorChallenge secondGod = 
			new GodOfWarConstructorChallenge("Kratos");
		System.out.println(secondGod.name);
		GodOfWarConstructorChallenge thirdGod = 
			new GodOfWarConstructorChallenge(new Integer(4));
		System.out.println(thirdGod.name);
	}
}
