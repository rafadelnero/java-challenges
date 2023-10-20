package com.javachallenges.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundsGenerics {
	public static void main(String... doYourBest) {
		printList(new ArrayList<>());
	}
	
	static void printList(List <? extends Object> list) {
		// TODO finish this challenge with upperbounds concepts
	}

	public static <T extends String> List<T> get(List<T> list, T t) {
		list.add(t);
		return list;
	}
}
