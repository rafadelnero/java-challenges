package com.javachallenges;

/** Soon you will see the answers on
 *  nobugsproject.com*/
public class ThreadStartChallenge {
	
	public static void main(String... doYourBest) 
			throws InterruptedException {
		Thread heisenberg = new Heisenberg();
		
		heisenberg.start();
		heisenberg.join();
		heisenberg.start();
		heisenberg.join();
	}
	
	static class Heisenberg extends Thread {
		
		public void run() {
			System.out.println("I am the danger!");
		}
		
	}
    //// I am the danger!
    ///  I am the danger!
    ///  Exception in thread "main" java.lang.IllegalThreadStateException
    ///     at java.lang.Thread.start(Thread.java:708)
    ///     at com.javachallenges.ThreadStartChallenge.main(ThreadStartChallenge.java:14)
    ///x - can you restart threads after they are TERMINATED
}
