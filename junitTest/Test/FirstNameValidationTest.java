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
public class FirstNameValidationTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"Anjali",true}, {"anJAli",false}, {"23#Anjali",false}
		});
	}
	
	private final String firstname;
	private final boolean expected;
	
	public FirstNameValidationTest(String firstname, boolean expected) {
		this.firstname=firstname;
		this.expected=expected;
		
	}
  
	@Test
	public void testFirstname_ShouldReturnExpected() {
		boolean isValidIname=ValidationUtil.isValidIname(firstname);
	    assertEquals(expected, isValidIname);
	}
}
