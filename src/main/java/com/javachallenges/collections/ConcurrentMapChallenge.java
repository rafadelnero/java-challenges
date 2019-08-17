package com.javachallenges.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapChallenge {

	public static void main(String... doYourBest) {
		ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
		cache.put("111", new Object());
		cache.putIfAbsent("111", "LOL");
		cache.put("111", new Integer(4));
		cache.put("222", new Integer(4));
		
		System.out.println(cache);
	}
}
