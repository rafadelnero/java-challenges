package com.javachallenges.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionChallenge4 {

    public static void main(String... doYourBest) {
        Function<Integer,Integer> add = x -> x + 2;
        Function<Integer,Integer> sub = x -> x - 2;
        Function<Integer,Integer> div = x -> x / 2;

        Function<Integer, Integer> func = add.andThen(sub).andThen(div);

        System.out.println(func.apply(2));
    }

}
