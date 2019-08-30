package com.worldpay.StringTask;

import java.util.Scanner;

public class Ques8 {
	private static Scanner sc;

	// Pallindrom using stringbuffer
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String original = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.reverse();
		String Reverse = sb.toString();
		if (original.equals(Reverse)) {
			System.out.println(original + " " + "Is a Pallindrom");
		} else {
			System.out.println(original + " " + "Is not a Pallidrom");
		}
	}

}
