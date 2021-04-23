package com.demo.junit;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.demo.junit.utils.ValidationUtil;

@RunWith(Parameterized.class)
public class EmailValidationTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"abc.xyz@bridgelabz.co.in",true}, {"abc@xyz#@.234@hotmail.com",false}, {"abc#1!@bridge@archieve.com.",false}
		});
	}
	
	private final String emailId;
	private final boolean expected;
	
	public EmailValidationTest(String emailId, boolean expected) {
		this.emailId=emailId;
		this.expected=expected;
		
	}
  
	@Test
	public void testEmailId_ShouldReturnExpected() {
		boolean isValidEmailID=ValidationUtil.isValidEmailID(emailId);
	    assertEquals(expected, isValidEmailID);
	}
}
