package com.javachallenges;

import java.io.Closeable;
import java.io.IOException;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class TryWithResourcesChallenge {

	public static void main(String... doYourBest) {
		try (Closeable closeableImpl = new CloseableImpl(); 
				AutoCloseable autoCloseableImpl = new AutoCloseableImpl()) {
		} catch (Exception ignore) { } 
	}

	static class CloseableImpl implements Closeable {
		public void close() throws IOException {
			System.out.println("CloseableImpl.close()");
		}
	}

	static class AutoCloseableImpl implements AutoCloseable {
		public void close() throws Exception {
			System.out.println("AutoCloseableImpl.close()");
		}
	}
    //// AutoCloseableImpl.close()\n CloseableImpl.close()
    ///  AutoCloseableImpl.close()\n CloseableImpl.close()
    ///y
}
