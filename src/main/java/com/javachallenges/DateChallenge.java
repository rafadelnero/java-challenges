package com.javachallenges;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

/**Soon check out the concepts 
 * of this challenge on nobugsproject.com */
public class DateChallenge {

	public static void main(String... doYourBest) {
		List<SpiderMan> spiderManList = Arrays.asList(
				new SpiderMan("The Spider Man", LocalDate.of(1962, Month.SEPTEMBER, 8)),
				new SpiderMan("The Black Suit", LocalDate.of(1984, Month.SEPTEMBER, 8)),
				new SpiderMan("Spider-Man 2099", LocalDate.of(1992, Month.SEPTEMBER, 8)));
			
		LocalDate now = LocalDate.of(2017, Month.SEPTEMBER, 18);
		
		spiderManList.stream().forEach(
				s -> { Period period = Period.between(s.creationDate, now);
					System.out.println(s.costume + " " +
					period.get(ChronoUnit.YEARS) + " years ");
				}
		);

		//// The Spider Man 55 years
		//// The Black Suit 33 years
		//// Spider-Man 2099 25 years
        ///  The Spider Man 55 years
        ///  The Black Suit 33 years
        ///  Spider-Man 2099 25 years
        ///y
	}

	static class SpiderMan { String costume;
		LocalDate creationDate; public SpiderMan(String costume, LocalDate dateOfBirth) { 
			this.costume = costume; this.creationDate = dateOfBirth; } }
}
