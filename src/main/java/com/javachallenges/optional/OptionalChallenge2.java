package com.javachallenges.optional;

import java.util.Optional;

public class OptionalChallenge2 {
    public static void main(String... doYourBest) throws Throwable {
        String finalOpt = "";
        Optional<String> opt = null;

        try {
            opt = Optional.of(null);
        } catch (RuntimeException exception) {
            System.out.println(opt.orElseThrow(() -> new Throwable()));
        } catch (Throwable error) {
            finalOpt = opt.orElse("lol");
        }

        System.out.println(finalOpt);
    }
}
