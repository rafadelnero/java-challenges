package com.javachallenges.optional;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalStreamChallenge {

    public static void main(String[] args) {
        List<Optional<Integer>> numbers = new ArrayList<>();

        numbers.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

}
