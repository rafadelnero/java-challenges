package com.javachallenges.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Soon you will see the concepts 
 *  behind the scenes on nobugsproject.com */
public class RegexChallenge {

	public static void main(String... doYourBest) {
		String str = "The winter is coming";
		String rex = "\\Sn\\S";
		String replace = "X";
		
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(str);
		String val = m.replaceAll(replace);
		System.out.println(val);
	}

}
