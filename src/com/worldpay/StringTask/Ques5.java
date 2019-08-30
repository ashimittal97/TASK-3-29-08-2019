package com.worldpay.StringTask;

import java.util.Scanner;

public class Ques5 {
private static Scanner sc;

	//Code For Pallindrom without using string buffer
	public static void main(String[] args) {
		String Reverse = "";
		sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		for (int i = s.length() - 1; i >= 0; i--) {
			Reverse = Reverse + s.charAt(i);
		}
		if (Reverse.equals(s)) {
			System.out.println(s + "   Is a Pallindrom");
		} else {
			System.out.println(s + "   Is not  Pallindrom");
		}

	}

}
