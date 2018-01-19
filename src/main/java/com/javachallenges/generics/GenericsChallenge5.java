package com.javachallenges.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenericsChallenge5 {

    public static void main(String... doYourBest) {
        List<Integer> finalList;

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        finalList = addInto(integerList);

        List<Long> longList = new ArrayList<>();
        finalList.addAll(addInto(longList));

        List<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(BigDecimal.ZERO);
        finalList.addAll(addInto(bigDecimalList));

        finalList.forEach(System.out::println);
    }

    static List addInto(List<? extends Number> list) {
        List<Number> resultList = new ArrayList<>();
        resultList.addAll(list);
        return resultList;
    }
}

