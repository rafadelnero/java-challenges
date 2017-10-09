package com.javachallenges.processhandle;

/** Soon you will see the answers on
 *   nobugsproject. */
public class ProcessChallenge {
	public static void main(String... doYourBest) 
			throws IllegalAccessException {
		ProcessHandle handle = ProcessHandle.current();

		if (handle.isAlive()) {
			System.out.println(handle.destroyForcibly());
		} else {
			System.out.println(handle.destroy());
		}
	}
}
