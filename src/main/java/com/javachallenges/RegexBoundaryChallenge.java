package com.javachallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Soon you will see the answers on 
 *   nobugsproject.com  */
public class RegexBoundaryChallenge {
	
 public static void main(String... doYourBest) {
		String str = "OCPJP 2017 OCPJP8";
		Pattern pattern = Pattern.compile("\\b\\w+\\D\\b");
		Matcher matcher = pattern.matcher(str);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
