package com.javachallenges;

import java.util.ArrayList;
import java.util.List;

/** Soon you will see the answers on nobugsproject.com */
public class GenericsChallenge {
	public static void main(String ... args) {
		SimpsonFactory<Simpson> simpsonFactory = 
				new SimpsonFactory<Simpson>(new Simpson("Homer"));
		
		System.out.println(simpsonFactory.
				addToList(new ArrayList<Simpson>()).get(0).name);
	}
	static class Simpson {
		String name;
		public Simpson(String name) {
			this.name = name;
		}
	}
	static class SimpsonFactory<T> {
		T t;

		public SimpsonFactory(T t) {
			this.t = t;
		}

		public List<T> addToList(List<T> lol) {
			lol.add(t);

			return lol;
		}
	}
    //// Homer
    ///  Homer
    ///y
}
