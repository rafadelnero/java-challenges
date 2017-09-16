package com.javachallenges;

/** Soon you will see the answers on
 *   nobugsproject.com */
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
				try {
					wait();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		//// For ever
        ///  Sometimes it outputs
        ///  Sometimes it does not
        ///  Sometimes it throws Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
        ///wtf
}
