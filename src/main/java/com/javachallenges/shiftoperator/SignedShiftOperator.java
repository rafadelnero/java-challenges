package com.javachallenges.shiftoperator;

public class SignedShiftOperator {
	
	static final Integer DECIMAL_NUMBER = 20;
	static final String BIT_NUMBER = Integer.toBinaryString(DECIMAL_NUMBER);

	public static void main(String... doYourBest) {
		int signedLeftShiftOperator =  DECIMAL_NUMBER << 2;
		int signedRightShiftOperator =  DECIMAL_NUMBER >> 1;
		int unsignedRightShiftOperator =  DECIMAL_NUMBER >>> 1;

		System.out.printf("Decimal number: %s and binary number: %s \n", DECIMAL_NUMBER, BIT_NUMBER);

		printDecimalAndBinary("Signed Left Shift:", signedLeftShiftOperator);
		printDecimalAndBinary("Signed Right Shift:", signedRightShiftOperator);
		printDecimalAndBinary("Unsigned Right Shift:", unsignedRightShiftOperator);
	}

	static void printDecimalAndBinary(String operator, int decimal) {
		System.out.printf("%s Decimal: %s - Binary: %s \n", operator, decimal, Integer.toBinaryString(decimal));
	}
	
}
