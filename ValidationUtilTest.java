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

		  final String pattern4="^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$";
		  final  Pattern S=Pattern.compile(pattern4);
		  final  Matcher p=S.matcher(pNumb);
		    return p.matches();
	      }

	     public static boolean isValidPassworD(String password) {

	         final String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";
	         final  Pattern T=Pattern.compile(pattern5);
	    	 final  Matcher q=T.matcher(password);
	           return q.matches();
	     }
}

package com.demo.junit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.demo.junit.utils.ValidationUtil;

  public class ValidationUtilTest {
	
	@Test
	public void testFirstName_shouldReturnTrue() {
	    String firstName="Davina";
		boolean result=ValidationUtil.isValidIname(firstName);
		assertTrue(result);
        }
	
	@Test
	public void testFirstNameI_shouldReturnFalse() {
	    String firstName="damon23";
		boolean result=ValidationUtil.isValidIname(firstName);
		assertFalse(result);
       }
	
	@Test
	public void testFirstNameII_shouldReturnFalse() {
	    String firstName="deLena@123";
		boolean result=ValidationUtil.isValidIname(firstName);
		assertFalse(result);
       }
	
	@Test
	public void testLastName_shouldReturnTrue() {
	    String lastName="Stark";
		boolean result=ValidationUtil.isValidIIname(lastName);
		assertTrue(result);
       }
	
	@Test
	public void testLastNameI_shouldReturnFalse() {
	    String lastName="s!200arkS";
		boolean result=ValidationUtil.isValidIIname(lastName);
 		assertFalse(result);
       }
 	
	@Test
	public void testLastNameII_shouldReturnFalse() {
	    String lastName="STARk1";
		boolean result=ValidationUtil.isValidIIname(lastName);
		assertFalse(result);
       }
	
	@Test
	public void testEmailId_shouldReturnTrue() {
	    String emailId="abc.xyzq1546@gmail.com";
		boolean result=ValidationUtil.isValidEmailID(emailId);
		assertTrue(result);
        }
	
	@Test
	public void testEmailIdI_shouldReturnFalse() {
	    String emailId="abc@xyz@1234.co.in";
		boolean result=ValidationUtil.isValidEmailID(emailId);
		assertFalse(result);
        }
	
	@Test
	public void testEmailIdII_shouldReturnFalse() {
	    String emailId="abc#!.xy$.Summer@OutLook.com";
		boolean result=ValidationUtil.isValidEmailID(emailId);
		assertFalse(result);
       }
	
	@Test
	public void testPhoneNumber_shouldReturnTrue() {
	    String Pnumb="+91 9834256784";
		boolean result=ValidationUtil.isValidPhoneNumb(Pnumb);
		assertTrue(result);
        }
	
	@Test
	public void testPhoneNumberI_shouldReturnFalse() {
	    String Pnumb="089 76894556476";
		boolean result=ValidationUtil.isValidPhoneNumb(Pnumb);
		assertFalse(result);
        }
	
	@Test
	public void testPhoneNumberII_shouldReturnFalse() {
	    String Pnumb="+986 7A4567890x";
		boolean result=ValidationUtil.isValidPhoneNumb(Pnumb);
		assertFalse(result);
        }
	
	@Test
	public void testPassword_shouldReturnTrue() {
	    String PWord="aBcX@#5567";
		boolean result=ValidationUtil.isValidPassworD(PWord);
		assertTrue(result);
        }
	
	@Test
	public void testPasswordI_shouldReturnTrue() {
	    String PWord="abcxyz!%6677";
		boolean result=ValidationUtil.isValidPassworD(PWord);
		assertFalse(result);
        }
	
	@Test
	public void testPasswordII_shouldReturnTrue() {
	    String PWord="ABCxyz@yyQ";
		boolean result=ValidationUtil.isValidPassworD(PWord);
		assertFalse(result);
        }
  }
