package com.kidsjavachallenges.array;

import java.util.Arrays;

public class DinosaurChallenge {
	public static void main(String... doYourBest) {
		int[] dinosaurs = new int[5];
		dinosaurs[0] = 0;

		int[] robotDinosaurs = dinosaurs;
		addDinosaurPower(dinosaurs);
        addDinosaurPower(robotDinosaurs);

        Arrays.stream(dinosaurs).forEach(System.out::println);
    }
	private static void addDinosaurPower(int[] anyDinosaur) {
        for (int i = 0; i < anyDinosaur.length; i++) {
            anyDinosaur[i] = anyDinosaur[i] + 2;
        }
    }
}


