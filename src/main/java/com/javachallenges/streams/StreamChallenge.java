package com.javachallenges.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamChallenge {
	public static void main(String[] doYourBest) {
		List<Simpson> simpsons = Arrays.asList(new Simpson("Homer", 35), 
				new Simpson("Margie", 30), new Simpson("Bart", 10), 
				new Simpson("Lisa", 8));

		Integer simpsonAge = simpsons.stream().map(e -> e.age)
				.filter(age -> age >= 20)
				.min(Comparator.naturalOrder()).get();
		
		System.out.println(Optional.of(simpsonAge).orElse(2));
	}

	static class Simpson {
		String name;
		int age;

		Simpson(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
