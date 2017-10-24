package com.javachallenges.streamwhile;

import java.util.stream.Stream;

/** Soon you will check the answers on 
 *   nobugsproject.com
 */
public class StreamWhileChallenge {
	
	public static void main(String... doYourBest) {
		String sopranos = "<Tony,Junior,Christopher>";
		
		Stream.of(sopranos).dropWhile(s -> !s.contains("<"))
			.takeWhile(s -> !s.contains(">"))
			.forEach(s -> System.out.println(s));
	}
	
}
