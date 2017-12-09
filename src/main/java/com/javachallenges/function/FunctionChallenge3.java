package com.javachallenges.function;

import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionChallenge3 {

    public static void main(String ... doYourBest) {
        String starWars = "Luke,DarthVader";

        Function<String, Stream<String>> lineSplitter =
                l -> Pattern.compile("\\w").splitAsStream(l);

        List<String> list = Stream.of(starWars)
                .flatMap(lineSplitter)
                .collect(Collectors.toList());

        System.out.println(list.size());
    }

}
