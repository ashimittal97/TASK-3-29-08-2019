package com.worldpay.StringTask;

public class Ques6 {
 //count no. of alphabates,symbols,digits,spaces
	public static void countNumber(String s) {
		 int countAlphabates = 0;
		 int  countDigits = 0;
		 int countSymbols = 0;
		 int countSpaces = 0;
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(ch[i])) {
				countAlphabates++;

			}else if(Character.isDigit(ch[i])){
				countDigits++;
			}else if(Character.isWhitespace(ch[i])){
				countSpaces++;
			}else {
				countSymbols++;
			}
			
		}
		System.out.println("ALPHABATES PRESENT IN THE STRING ARE  :"+countAlphabates);
		System.out.println("DIGITS PRESENT IN THE STRING ARE  :"+countDigits);
		System.out.println("SPACES PRESENT IN THE STRING ARE  :"+countSpaces);
		System.out.println("SYMBOLS PRESENT IN THE STRING ARE  :"+countSymbols);
	}

	public static void main(String[] args) {
		String s = "hello user123,you can mail me @xyz4343@gmail.comwith # tag java!";
		countNumber(s);

	}

}
