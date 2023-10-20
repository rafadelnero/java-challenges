package com.javachallenges.optional;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class OptionalChallenge3 {

    public static void main(String... doYourBest) {
        Optional<String> value = Optional.of("d'oh");

        AtomicInteger dohQtd = new AtomicInteger(999);
        AtomicInteger eatMyShortsQtd = new AtomicInteger(500);

        value.ifPresentOrElse(
                v -> dohQtd.incrementAndGet(),
                eatMyShortsQtd::incrementAndGet);

        System.out.println(value.get() + (dohQtd.get() + eatMyShortsQtd.get()));
    }

}
