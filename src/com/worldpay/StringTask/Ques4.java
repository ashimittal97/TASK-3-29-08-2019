package com.worldpay.StringTask;

public class Ques4 {
	// finding all occurrence of java ,count how many times java appers in the
	// string
	static void countOccurence(String s, String word) {
		String a[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i])) {
				count++;
			}

		}
		System.out.println("Java is " + " " + count + " " + "times in a string");

	}

	// index of occurrence
	static void index(String s, String word) {
		int fromIndex = 0;
		while ((fromIndex = s.indexOf(word, fromIndex)) != -1) {
			System.out.println("Found at Index  :" + fromIndex);
			fromIndex++;
		}
	}

	public static void main(String args[]) {
		String s = "this is java and java is object oriented and java is powerful .I lover java language";
		String word = "java";
		countOccurence(s, word);
		index(s, word);
	}
}
