package com.worldpay.StringTask;

   
public class domainWiseEmail {
	private static int a;
	private static int countGmail;
	private static int countYahoo;
	
	 public static void main(String args[]){
		 String[] email={"ashi060@gmail.com","info.sadiya@gmail.com","ashi@yahoo.com","ashi@yahoo.com","anjali@gmail.com","pooja@gmail.com"};
		 for(int i=0;i<email.length;i++){
			 String domain="yahoo.com";
			 a=email[i].lastIndexOf("@");
			if (email[i].substring(a + 1).equalsIgnoreCase(domain)){
				 countYahoo++;
			 }
			 else
				 countGmail++;
			 
		 }
		 System.out.println("total gmail account present "+" : "+countGmail);
		 System.out.println("total yahoo account present "+" : "+countYahoo);
			
		 }
	 }

