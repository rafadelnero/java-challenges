package com.javachallenges;

import java.io.Closeable;
import java.io.IOException;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class ResourcesJava9Challenge {
	public static void main(String... doYourBest) {
		Java java = new Java();
		
		try (java) {
			System.out.println("NoBugs");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static class Java implements Closeable {
		public void close() throws IOException {
			System.out.println("NoStress");
		}
	}
}
