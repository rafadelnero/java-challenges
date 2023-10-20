package com.javachallenges.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceChallenge {

	public static void main(String[] args) {
		List<Homer> homers = new ArrayList<>();
		homers.add(new Homer());
		homers.add(new Homer());
		homers.add(new Homer());
		
		homers.removeIf(e -> e.talk.equals("D'oh"));
		
		homers.forEach(System.out::println);
	}
	
	static class Homer {
		String talk = "D'oh!";
		
		public String toString() {
			return talk;
		}
	}
	
}

