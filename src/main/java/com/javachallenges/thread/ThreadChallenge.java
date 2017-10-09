package com.javachallenges.thread;

public class ThreadChallenge {
	private int wolverineAdrenaline = 10;

	public static void main(String... doYourBest) {
		ThreadChallenge thread = new ThreadChallenge();
		thread.new Motorcycle().start();
		thread.new Motorcycle().start();
		thread.new Motorcycle().start();
		Thread t = thread.new Motorcycle();
		System.out.println(t.isDaemon());
		
		
//		System.out.println(thread.wolverineAdrenaline);
	}

	class Motorcycle extends Thread {

		@Override
		public void run() {
			System.out.println(wolverineAdrenaline++);
		}
	}

}
