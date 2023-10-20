package com.javachallenges.trywithresources;

import java.io.Closeable;
import java.io.IOException;

/** Soon you will see the answers on
 *   nobugsproject.com */
@SuppressWarnings(value = "all")
public class ResourcesJava9Challenge2 {

	public static void main(String... doYourBest) throws Throwable {
		ResourcesJava9Challenge2.<AutoCloseable>invoke(new Juggy());
	}

	static<T extends AutoCloseable> void invoke(T t) throws Exception {
		try (t) {
			System.out.println("2");
		}
	}

	static class Juggy implements Closeable {
		public void close() throws IOException {
			System.out.println("1");
		}
	}
}
