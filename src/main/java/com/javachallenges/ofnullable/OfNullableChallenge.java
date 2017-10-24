package com.javachallenges.ofnullable;

import java.util.List;
import java.util.stream.Stream;

/** Soon you will see the explanations. */
public class OfNullableChallenge {

	public static void main(String... args) {
		Soprano soprano = null;

		Stream.ofNullable(soprano)
		.filter(s -> s.guns.get(0) == null)
		.forEach(s -> System.out.println(s.guns.size()));
	}

	static class Soprano {
		List<String> guns;

		public Soprano(List<String> guns) {
			this.guns = guns;
		}
	}

}
