package com.javachallenges.thread;

public class DaemonThreadChallenge implements Runnable {

		public static void main(String... doYourBest) {
			Thread thread = new Thread(new DaemonThreadChallenge());
			thread.setDaemon(true);
			thread.start();
		}

		@Override
		public void run() {
			for (;;) {
				System.out.println("For ever");
			}
		}
}
