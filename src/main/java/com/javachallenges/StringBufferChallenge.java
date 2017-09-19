package com.javachallenges;

/** See the answer and the concepts behind the scenes 
 *  on nobugsproject.com */
public class StringBufferChallenge {

	public static void main(String... doYourBest) {
		Object nullObj = null;
		StringBuffer buffer = new StringBuffer(10);
		buffer.append("nobugs ");
		buffer.append("project ");
		buffer.append(nullObj);
		buffer.insert(14, '!');
		System.out.println(buffer);
	}
    //// nobugs project!ull
    ///  nobugs project! null
    ///x
}
