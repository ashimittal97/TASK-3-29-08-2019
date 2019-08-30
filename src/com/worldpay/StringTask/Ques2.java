package com.worldpay.StringTask;

public class Ques2 {
	// branch wise number of student
	private static int countCs;
	private static int countIT;
	private static int countMeach;
	private static int countCivil;

	public static void main(String args[]) {
		String rnos[] = { "121", "122", "123", "341", "342", "567", "781", "789", "788" };
		for (int i = 0; i < rnos.length; i++) {
			if (rnos[i].contains("12")) {
				
				countCs++;

			} else if (rnos[i].contains("34")) {
				
				countIT++;

			} else if (rnos[i].contains("56")) {
				
				countMeach++;

			} else if (rnos[i].contains("78")) {
				
				countCivil++;

			}
			
		}
		System.out.println("PERSON BELONGING TO COMPUTER SICENCE ARE :"+countCs);
		System.out.println("PERSON BELONGING TO INFORMATION TECHONOLOGY ARE :"+countIT);
		System.out.println("PERSON BELONGING TO MEACHINICAL ARE :"+countMeach);
		System.out.println("PERSON BELONGING TO CIVIL ARE :"+countCivil);
	}
}
