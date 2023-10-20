package com.javachallenges.generics;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GenericsChallenge4 {

    public static void main(String... doYourBest) {
        Map<Object, Object> map = new HashMap<>();
        map.putAll(attack(1, "Luke"));
        map.putAll(attack("Luke", new BigDecimal("7")));

        map.forEach((k, v) -> System.out.println(k +""+ v));
    }

    static <K, V> Map attack(K k, V v) {
        Map<K, V> map = new HashMap<>();
        map.put(k, v);
        return map;
    }

}

