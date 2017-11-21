package com.javachallenges.lambda;

import java.util.function.Consumer;

public class ConsumerChallenge {

    public static void main(String... doYourBest) {
        Consumer<String> printer = System.out::println;

        printer.accept("Testing");
        Consumer<String> consumer2 = printer.andThen(printer);

        consumer2.accept("Testing2");
    }

}
