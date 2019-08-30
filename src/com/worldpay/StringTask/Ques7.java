package com.worldpay.StringTask;

public class Ques7 {
	public static void show(String cities) {
		// PARTATIONG THE STRING WITHOUT USING SPLIT
		String c = "";
		int i;
		System.out.println("List of cities is" + " " + cities);
		{
			for (i = 0; i < cities.length(); i++) {
				if (cities.charAt(i) != ',') {
					c = c + cities.charAt(i);
				} else {
					System.out.println(c);
					c = "";
				}
			}

			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		String S = "India,Australia,England,Canada";
		show(S);
	}

}
