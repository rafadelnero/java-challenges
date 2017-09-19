package com.javachallenges;

import java.math.BigDecimal;

/** Soon you will see the answers on 
 *   nobugsproject.com */
public class PrimitivesChallenge {
	public static void main(String... doYourBest) {
		Integer intNumber = null;
		Double doubleNumber = 0.2D;
		BigDecimal bigDecimalNumber = BigDecimal.ONE;
		
		System.out.println(execute(intNumber, doubleNumber, 
				bigDecimalNumber));
	}
	
	static double execute(int intNumber, Double doubleNumber, 
			BigDecimal bigDecimalNumber) {
		return intNumber + doubleNumber + bigDecimalNumber.intValue();
	}
    //// NPE
    ///  NPE
    ///y
}
