package com.javachallenges.thread;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class ThreadChallenge2 {
		static int i;

		public static void main(String... doYourBest) throws InterruptedException {
			Thread thread1 = new Thread(() -> i++);
			thread1.setDaemon(true);
			thread1.start();

			Thread thread2 = new Thread(() -> i++);
			thread2.setDaemon(true);
			thread2.start();

			thread1.join();
			thread2.join();

			Thread thread3 = new Thread(() -> {
				for (;;) {
					i++;
				}
			});

			thread3.setDaemon(false);
			thread3.start();

			System.out.println(i);
		}
}
