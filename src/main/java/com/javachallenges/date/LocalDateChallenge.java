package com.javachallenges.date;

import java.time.LocalDate;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class LocalDateChallenge {
	public static void main(String... doYourBest) {
		LocalDate localDate = LocalDate.of(2017, 9, 19);
		
		localDate.plusYears(2);
		localDate.plusDays(2);
		localDate.plusMonths(2);
		
		System.out.println(localDate);
	}
}
