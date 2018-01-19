package com.javachallenges.function;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionChallenge5 {

    public static void main(String... doYourBest) {
        Function<String,String> con = Util::concat;
        BiConsumer<String, String> biConsumer = (x, y)
                -> System.out.println(x + y);

        biConsumer.accept(con.apply("x"), con.apply("y"));
    }

    static class Util {
        static String concat(String x) {
            return "con".concat(x);
        }
    }

}
