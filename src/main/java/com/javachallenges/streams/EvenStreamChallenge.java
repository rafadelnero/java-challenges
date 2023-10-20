package com.javachallenges.streams;

import java.util.List;
import java.util.Optional;

public class EvenStreamChallenge {

    public static void main(String ...doYourBest) {
        List<Integer> numbers = List.of(1, 2,3,4,5,6);

        Optional<Integer> number = numbers.stream()
                .filter(e -> e % 2 == 0)
                .filter(e -> e >= 6)
                .filter(e -> e > 6)
                .map(e -> e * 2)
                .findFirst();

        System.out.println(number);
    }

}


