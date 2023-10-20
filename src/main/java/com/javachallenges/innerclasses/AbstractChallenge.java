package com.javachallenges.innerclasses;

public class AbstractChallenge {
    static final int FORCE = 10;

    public static void main(String... doYourBest) {
        DarthVader darthVader = new DarthVader() {
            public int getNumber(int number) {
                return number;
            }
        };

        MasterYoda masterYoda = new AbstractChallenge().new MasterYoda() {
            public int getNumber(int number) {
                return number;
            }
        };

        System.out.println(darthVader.getNumber(FORCE) +
                masterYoda.getNumber(Integer.valueOf(FORCE)));

        System.out.println("The stronger Jedi is: " + (darthVader.getNumber(FORCE) >
                masterYoda.getNumber(FORCE) ? "Darth Vader" : "Master Yoda"));
    }

    abstract class MasterYoda implements LukeSkywalker {
        int getNumber(Integer force) {
            return force + 10;
        }
    }

    interface LukeSkywalker extends DarthVader {
        int getNumber(int force);
    }

    interface DarthVader {
        int getNumber(int force);
    }
}
