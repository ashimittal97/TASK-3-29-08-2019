package com.worldpay.StringTask;

import java.util.StringTokenizer;

public class ques10 {
	// creating tokens of string
	public static void main(String args[]) {
		String str = "1.java,2.oracle,3.python,4.php,5.linux....";
		StringTokenizer st = new StringTokenizer(str, "1.,2.,3.,4.,5.,....");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
