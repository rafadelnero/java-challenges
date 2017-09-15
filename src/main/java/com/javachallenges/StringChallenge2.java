package com.javachallenges;

/** Soon you will see the answers on 
 *   nobugsproject.com */
public class StringChallenge2 {
	public static void main(String... doYourBest) {
		String result = "";
		result += " powerfulCode ".trim() == "powerfulCode"
			? "1" : "2";
		result += "flexibleCode" == "flexibleCode" 
				? "3" : "4";
		result += new String("doYourBest") == new String("doYourBest") ?
				"5" : "6";
		
		result += new String("noBugsNoStress")
				.equals("noBugsNoStress") ? "7" :
					"8";
		
		System.out.println(result);
	}
}
