package com.javachallenges.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * a - It will not compile | b - Maggie c - RuntimeException at line 30 | d -
 * Homer
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class GenericsChallenge {
	public static void main(String... doYourBest) {
		SimpsonFactory<Simpson> simpsonFactory = 
				new SimpsonFactory<Simpson>(new Simpson("Homer"));
		List list = simpsonFactory.addToList(
				new ArrayList<Simpson>(), new ArrayList());
		System.out.println(((List<Simpson>) list).get(0).name);
	}
	static class Simpson {
		String name;

		public Simpson(String name) { this.name = name; }
	}
	static class SimpsonFactory<T> {
		T t;

		public SimpsonFactory(T t) { this.t = t; }

		public List<T> addToList(List<T> simpson1, 
				List<? super Simpson> simpson2) {
			simpson1.add(t);  
			simpson2.add(new Simpson("Maggie"));
			return simpson1;
		}
	}
}
