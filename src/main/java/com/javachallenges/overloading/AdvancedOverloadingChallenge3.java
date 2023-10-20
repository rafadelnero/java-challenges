package com.javachallenges.overloading;

@SuppressWarnings(value = "all")
/*public class AdvancedOverloadingChallenge3 {
	static String x = "";
	public static void main(String... doYourBest) {
		executeAction(1);
		executeAction(1.0);
		executeAction(Double.valueOf("5"));
		executeAction(1L);

		System.out.println(x);
	}

	static void executeAction(int ... var) {x += "a"; }
	static void executeAction(Integer var) {x += "b"; }
	static void executeAction(Object var)  {x += "c"; }
	static void executeAction(short var)   {x += "d"; }
	static void executeAction(float var)   {x += "e"; }
	static void executeAction(double var)  {x += "f"; }

}*/


public class AdvancedOverloadingChallenge3 {
    static String x = "";
    public static void main(String... doYourBest) {
        var firstValue = (int)(short)(char) 1;
        var secondValue = (double)(Double) 1.0;
        var thirdValue = new int[]{4,3,5};
        var fourthValue = (float)(double) 1.0f;

        executeAction(firstValue);
        executeAction(secondValue);
        executeAction(thirdValue);
        executeAction(fourthValue);

        System.out.println(x);
    }

    static void executeAction(int ... var) {x += "a"; }
    static void executeAction(Integer var) {x += "b"; }
    static void executeAction(Object var)  {x += "c"; }
    static void executeAction(short var)   {x += "d"; }
    static void executeAction(float var)   {x += "e"; }
    static void executeAction(double var)  {x += "f"; }

}

