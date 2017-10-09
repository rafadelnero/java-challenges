package com.javachallenges.collections;

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
}
