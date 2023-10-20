package com.javachallenges.thread;

public class SynchronizedChallenge implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		SynchronizedChallenge synchronizeChallenge = 
				new SynchronizedChallenge();
		Thread thread = new Thread(synchronizeChallenge);
		thread.start();
		
		while (!thread.isAlive()) {
			if (thread.isInterrupted()) {
				break;
			}
		}
		
		thread.notify();
	}

	@Override
	public synchronized void run() {
		System.out.println("Do it!");

		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("In the end!");
	}

}
