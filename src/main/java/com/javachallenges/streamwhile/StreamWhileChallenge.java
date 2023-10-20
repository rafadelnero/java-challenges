package com.javachallenges.streamwhile;

import java.util.stream.Stream;

public class StreamWhileChallenge {
	
	public static void main(String... doYourBest) {
		String sopranos = "<Tony,Junior,Christopher>";
		
		Stream.of(sopranos).dropWhile(s -> !s.contains("<"))
			.takeWhile(s -> !s.contains(">"))
			.forEach(System.out::print);
	}
	
}


