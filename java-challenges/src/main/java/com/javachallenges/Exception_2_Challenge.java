package com.javachallenges;

import java.io.Closeable;
import java.io.IOException;

/**
 * Soon you will see the answers on nobugsproject.com
 */
public class Exception_2_Challenge {
	public static void main(String ... beACompiler) {
		
		try  { 
			throw new Error();
			
		} finally {
			System.out.println("Finally?");
		}
	}
}
