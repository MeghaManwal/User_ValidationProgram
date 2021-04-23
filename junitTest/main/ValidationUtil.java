package com.demo.junit.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidationUtil {

	private ValidationUtil() {}
	
	    public static boolean isValidIname(String firstname) {

           final  String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";
           final  Pattern P=Pattern.compile(pattern1);
           final  Matcher m=P.matcher(firstname);
            return m.matches();
        }

	    public static boolean isValidIIname(String lastname) {

	        final String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";
	        final  Pattern Q=Pattern.compile(pattern2);
	        final Matcher n=Q.matcher(lastname);
	         return n.matches();
	    }

	     public static boolean isValidEmailID(String emailId) {

	    	 final String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
	    	 final Pattern R=Pattern.compile(pattern3);
	    	 final  Matcher o=R.matcher(emailId);
	    	   return o.matches();
	     }


	     public static boolean isValidPhoneNumb(String pNumb) {

		     final String pattern4="^[+][0-9]{1,}[ ][1-9]{1}[0-9]{9}$";
		     final  Pattern S=Pattern.compile(pattern4);
		     final  Matcher p=S.matcher(pNumb);
		       return p.matches();
	      }

	     public static boolean isValidPassworD(String password) {

	         final String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,})(?=.*[A-Z]{1,})(?=.*[0-9]{1,})(?=.*[!@#$%^&*();:]{1,}).*$";
	         final  Pattern T=Pattern.compile(pattern5);
	    	 final  Matcher q=T.matcher(password);
	           return q.matches();
	     }
}

