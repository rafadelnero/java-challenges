package com.javachallenges.objectreferences;

import java.util.concurrent.atomic.AtomicInteger;

public class ReferenceChallenge2 {
	
	static void sumNumber(AtomicInteger atomicInteger) {
		atomicInteger.incrementAndGet();
	}
	
	public static void main(String ... doYourBest) {
		Number number = new AtomicInteger(6);
		
		sumNumber((AtomicInteger) number);
		
		System.out.println(number);
	}
	
}
