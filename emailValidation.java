package jUnitTest;
import java.util.regex.*;
import org.junit.Test;  
import static org.junit.Assert.*;

public class emailValidation {
	
	   public static boolean isValidIname(String firstname) {

	        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";

	        Pattern P=Pattern.compile(pattern1);
	        Matcher m=P.matcher(firstname);
	        return m.matches();
	    }

	    public static boolean isValidIIname(String lastname) {

	        String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";

	        Pattern Q=Pattern.compile(pattern2);
	        Matcher n=Q.matcher(lastname);
	        return n.matches();
	    }

	    public static boolean isValidEmailID(String emailId) {

	        String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";

	        Pattern R=Pattern.compile(pattern3);
	        Matcher o=R.matcher(emailId);
	        return o.matches();
	    }


	    public static boolean isValidPhoneNumb(String pNumb) {

	        String pattern4="^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$";

	        Pattern S=Pattern.compile(pattern4);
	        Matcher p=S.matcher(pNumb);
	        return p.matches();
	     }

	    public static boolean isValidPassworD(String password) {

	        String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";

	        Pattern T=Pattern.compile(pattern5);
	        Matcher q=T.matcher(password);
	        return q.matches();
	    }

}

public class emailValidationTest {
	
	@Test
	public void testisValidfirstname() {
		System.out.println("Positive Testcase to check first name");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidIname("Neha");
		System.out.println(result);
		assertEquals(true, result);
	}

	@Test
	public void testisValidFirstname() {
		System.out.println("Negative Testcase to check first name");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidIname("neHa");
		System.out.println(result);
		assertEquals(false, result);
	}

	@Test
	public void testisValidlastname() {
		System.out.println("Positive Testcase to check last name");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidIIname("Sharma");
		System.out.println(result);
		assertEquals(true, result);
	}

	@Test
	public void testisValidLastname() {
		System.out.println("Negative Testcase to check last name");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidIIname("sHARma");
		System.out.println(result);
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidEmaiLId() {
		System.out.println("Positive Testcase to check emailId");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidEmailID("abc.xyz@bridgelabz.co.in");
		System.out.println(result);
		assertEquals(true, result);
	}
	
	@Test
	public void testisValidemaiLId() {
		System.out.println("Negative Testcase to check emailId");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidEmailID("abc@345@bridhelabz.hotmail.com");
		System.out.println(result);
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidphoneNumb() {
		System.out.println("Positive Testcase to check phone Number");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidPhoneNumb("+91 9987453342");
		System.out.println(result);
		assertEquals(true, result);
	}
	
	
	@Test
	public void testisValidPhonENumb() {
		System.out.println("Negative Testcase to check phone Number");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidPhoneNumb("091 998745334232");
		System.out.println(result);
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidPassWord() {
		System.out.println("Positive Testcase to check password");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidPassworD("RyzEn@!99443");
		System.out.println(result);
		assertEquals(true, result);
	}
	
	@Test
	public void testisValidpassWord() {
		System.out.println("Negative Testcase to check password");
		emailValidation EmailValidation=new emailValidation();
		boolean result=EmailValidation.isValidPassworD("ryzen@@@@@@tab");
		System.out.println(result);
		assertEquals(false, result);
	}
}
