package com.javachallenges.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Soon you will see the answers on
*  nobugsproject.com*/
public class RegexChallenge2 {
 
    public static void main(final String... doYourBest) {
        testRegex("test123");
        testRegex("lisa@gmail.com");
        testRegex("misterburns$gmail.com");
        testRegex("homer_simpson@hotmail<com");
        testRegex("elbarto_prankster@gmail>com");
        testRegex("margie*gmail>com");
    }
 
    public static void testRegex(final String msg) {
        final String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*[@|$]"
        + "[A-Za-z0-9-]+([\\.|<][A-Za-z0-9]+)*([\\.|<][A-Za-z]{2,})$";
 
        final Pattern r = Pattern.compile(pattern);
 
        final Matcher m = r.matcher(msg);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
