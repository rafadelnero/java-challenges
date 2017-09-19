package com.javachallenges;

import java.util.PriorityQueue;

/** Soon you will see the answers 
 *   on nobugsproject.com */
public class PriorityQueueChallenge {

	public static void main(String... doYourBest) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();

		priorityQueue.offer("Homer");
		priorityQueue.offer("Margie");
		priorityQueue.offer("Bart");

		priorityQueue.peek();

		priorityQueue.poll();
		priorityQueue.poll();
		
		System.out.println(priorityQueue.stream()
				.filter(s -> s.toString().toString()
				.startsWith("Ho")).findFirst().get());
	}
    //// null
    ///  Exception in thread "main" java.util.NoSuchElementException: No value present
    ///  at java.util.Optional.get(Optional.java:135)
    ///  at com.javachallenges.PriorityQueueChallenge.main(PriorityQueueChallenge.java:23)
    ///x
}
