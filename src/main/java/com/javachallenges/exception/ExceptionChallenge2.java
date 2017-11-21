package com.javachallenges.exception;

import java.io.Closeable;
import java.io.IOException;

public class ExceptionChallenge2 {
    public static void main(String... doYourBest) {
        String soprano = null;

        CloseIt closeIt = new CloseIt();

        try(closeIt) {
            System.out.println(soprano.matches(null));
        } catch (Exception exception) {
            System.out.println("exception");
        } catch (Throwable throwable) {
            System.out.println("throwable");
        }
    }
    static class CloseIt implements Closeable {

        public void close() throws IOException {
            System.out.println("close");
        }
    }
}
