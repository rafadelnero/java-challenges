package com.javachallenges.optional;

import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A - keyMakerVirus2theOneTRINITY
 * B - Virus1theOneTRINITY
 * C - keyMakerVirusArchitect2theOneTRINITY
 * D - keyMakerVirus1theOne
 */
public class OptionalCodeOneChallenge {

        static String finalZionValue = "";
        static int matrixCount = 0;

        public static void main(String... matrix) {
            Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);

            var agentSmith = "Virus";

            finalZionValue = finalZionValue + Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());
            finalZionValue += optFromMatrix.orElseGet(OptionalCodeOneChallenge::getVisionFromOracle);

            finalZionValue += matrixCount;
            String neo = null;

            try {
                Optional.ofNullable(neo).orElseThrow(IllegalArgumentException::new);
            } catch (Exception exception) {
                finalZionValue += Optional.ofNullable(neo).or(() -> Optional.of("theOne")).get();
            }

            finalZionValue += Optional.of("trinity").stream().map(String::toUpperCase)
                    .filter(trinity -> trinity.equals("TRINITY")).collect(Collectors.joining());

            System.out.println(finalZionValue);
        }

        static String getVisionFromOracle() {
            matrixCount++;
            finalZionValue += "KeyMaker";
            return "Architect";
        }
}
