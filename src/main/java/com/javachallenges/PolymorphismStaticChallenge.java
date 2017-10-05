package com.javachallenges;

/** Soon you will see the answers on
 *   nobugsproject.com */
public class PolymorphismStaticChallenge {

	static { System.out.println("Static"); }

	public static void main(String... doYourBest) {
		class MichaelCorleone extends VitoCorleone {
			{
				System.out.println("SMichael");
			}
			void execute() {
				System.out.println("IMichael");
			}
		}
		VitoCorleone vito = new MichaelCorleone();
		vito.execute();
	}
	//I'm gonna make him an offer he can't refuse
	static class VitoCorleone {
		static { System.out.println("SVito");}
		void execute() {
			System.out.println("IVito"); } }}
