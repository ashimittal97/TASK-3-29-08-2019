package com.worldpay.StringTask;

import java.util.Scanner;

public class Ques8 {
	

	// Pallindrom using stringbuffer
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String original = sc.nextLine();
		StringBuffer sb = new StringBuffer(original);
		sb.reverse();
		String Reverse = sb.toString();
		if (original.equals(Reverse)) {
			System.out.println(original + " " + "Is a Pallindrom");
		} else {
			System.out.println(original + " " + "Is not a Pallidrom");
		}
	}

}
