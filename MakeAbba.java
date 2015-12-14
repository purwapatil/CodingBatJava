package codingbatjava;

/**
 * Given two strings, a and b, return the result of putting them together in the order abba, 
 * e.g. "Hi" and "Bye" returns "HiByeByeHi". 
 * 
 * makeAbba("Hi", "Bye") "HiByeByeHi"
 * makeAbba("Yo", "Alice") "YoAliceAliceYo"
 * makeAbba("What", "Up") "WhatUpUpWhat"
 * 
 */

public class MakeAbba {

	public static void main(String[] args) {

		String a = "Hi";
		String b = "Bye";
		
		System.out.println("functionMakeAbba: " + functionMakeAbba(a,b));
	}
	
	public static String functionMakeAbba(String a, String b) {

		return a+b+b+a;
	}
}
