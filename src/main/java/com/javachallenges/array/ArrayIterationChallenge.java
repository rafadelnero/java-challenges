package com.javachallenges.array;

import java.util.ArrayList;
import java.util.List;

/** Soon you will the answers on 
 *   nobugsproject.com */
public class ArrayIterationChallenge {
	public static void main(String... doYourBest) {
		List<String> list = new ArrayList<>();

		list.add("var1");
		list.add("var2");
		list.add("var3");
		list.add("var4");
		list.add("var5");

		for (String var : list) {
			if (var.equals("var2")) {
				list.remove(var);
			}
		}

		System.out.println(list);
	}
}
