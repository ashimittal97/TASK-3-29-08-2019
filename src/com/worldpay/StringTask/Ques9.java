package com.worldpay.StringTask;


public class Ques9 {
	public static void removeDigits(String a){
		String withOutDigits=a.replaceAll("[0-9]", "");
		System.out.println("String without digits is : "+withOutDigits);
	}
	public static void main (String args[]){
		String s="abc34unbijf8fcui35ihjb";
		removeDigits(s);
		
	}
}
