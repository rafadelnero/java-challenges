package com.javachallenges.logicaloperators;

public class LogicalOperatorsChallenge {

    public static void main(String[] args) {
        int spiderMan = 10;
        int venom = 5;

        int carnage = 50;

        if (spiderMan == 11 & venom++ == 5) {
            venom++;
        }

        if (++carnage == 50 | spiderMan++ == 11 | spiderMan++ == 12
                | spiderMan++ == 13 | spiderMan++ == 14) {
            venom++;
        }

        if (++spiderMan == 14 | spiderMan++ == 15 & venom++ == 6 & spiderMan == 13) {
            spiderMan++;
        }

        System.out.println(spiderMan + venom + carnage);
    }

}	
