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
public class LastNameValidationTest {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"Sharma",true}, {"Sh@$arMa",false}, {"!Sharma",false}
		});
	}
	
	private final String lastname;
	private final boolean expected;
	
	public LastNameValidationTest(String lastname, boolean expected) {
		this.lastname=lastname;
		this.expected=expected;
		
	}
  
	@Test
	public void testLastname_ShouldReturnExpected() {
		boolean isValidIIname=ValidationUtil.isValidIIname(lastname);
	    assertEquals(expected, isValidIIname);
	}

}
