package com.javachallenges;

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
    //// Do it!\n In the end!
    ///  Do it!
    ///  Exception in thread "main" java.lang.IllegalMonitorStateException
    ///     at java.lang.Object.notify(Native Method)
    ///     at com.javachallenges.SynchronizedChallenge.main(SynchronizedChallenge.java:17)
    ///wtf: current thread must own that object's monitor

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
