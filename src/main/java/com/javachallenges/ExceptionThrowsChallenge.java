package com.javachallenges;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/** Soon you will see the answers
 *   on nobugsproject.com */
public class ExceptionThrowsChallenge {
	public static void main(String... doYourBest) {
		try {
			doOStuff();
		} catch (Throwable /*| RuntimeException */ e) {
			try {
				throw new RuntimeException(e);
			} catch(RuntimeException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	static void doOStuff() throws Throwable {
		throw new Throwable("Error");
	}

    //// compile error on LOC:9
    ///  Error:(14, 38) java: Alternatives in a multi-catch statement cannot be related by subclassing
    ///  Alternative java.lang.RuntimeException is a subclass of alternative java.lang.Throwable
    ///y
}
