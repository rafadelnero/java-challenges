package com.javachallenges.lambda;

import java.util.function.Supplier;

public class SupplierChallenge {

    public static Simpson produce(Supplier<Simpson> supp) {
        return supp.get();
    }
    public static void main(String... doYourBest) {
        Simpson simpson = new Simpson();

        Simpson s1 = produce(() -> simpson);
        Simpson s2 = produce(() -> simpson);

        System.out.println(s1.equals(s2));
    }
    static class Simpson { }
}
