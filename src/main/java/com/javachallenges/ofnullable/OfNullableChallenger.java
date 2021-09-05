package com.javachallenges.ofnullable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OfNullableChallenger {

	public static void main(String... args) {
		Soprano soprano = null;

		Stream.ofNullable(soprano)
		.filter(s -> s.guns.get(0) == null)
		.forEach(s -> System.out.println(s.guns.size()));

		Optional.ofNullable("value").ifPresentOrElse(OfNullableChallenger::processValue,
				() -> System.out.println("Process logic when there is no value..."));

		Optional.of("").orElseGet(String::new);
	}

	private static void action() {
	}

	private static void processValue(String s) {
	}


	static class Soprano {
		List<String> guns;

		public Soprano(List<String> guns) {
			this.guns = guns;
		}
	}

}
