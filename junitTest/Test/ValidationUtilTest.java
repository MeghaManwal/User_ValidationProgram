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
