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
public class PhoneNoValidationTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"+91 9456345621",true}, {"+917645378945",false}, {"789 0567845698",false}
		});
	}
	
	private final String PhoneNo;
	private final boolean expected;
	
	public PhoneNoValidationTest(String PhoneNo, boolean expected) {
		this.PhoneNo=PhoneNo;
		this.expected=expected;
		
	}
  
	@Test
	public void testPhoneNumb_ShouldReturnExpected() {
		boolean isValidPhoneNumb=ValidationUtil.isValidPhoneNumb(PhoneNo);
	    assertEquals(expected, isValidPhoneNumb);
	}

}
