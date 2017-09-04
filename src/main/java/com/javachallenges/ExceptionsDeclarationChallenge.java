package com.javachallenges;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDeclarationChallenge {
	
	public static void main(String[] args) throws FileNotFoundException {
		new Scientist() {
			public void talk() throws FileNotFoundException {
				super.talk();
			}
		}.talk();
	}

	static class Scientist {
		public void talk() throws FileNotFoundException {
			System.out.println("Making experiences");
		}
	}
	
	static class Sheldon extends Scientist {
		// We can't throw a broader Exception 
		// in the overrode method
		public void talk() /*throws IOException*/ {
			System.out.println("My spot");
		}
	}
	
}
