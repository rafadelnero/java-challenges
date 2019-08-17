package com.javachallenges.exception;

public class Exception_2_Challenge {
    public static void main(String... beACompiler) {

        try {
            throw new Error();

        } finally {
            System.out.println("Finally?");
        }
    }
}
