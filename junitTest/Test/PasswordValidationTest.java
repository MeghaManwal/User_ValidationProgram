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
public class PasswordValidationTest {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"SuPPort@45!6",true}, {"@!ryzen9se",false}, {"sEriEs23d45",false}
		});
	}
	
	private final String Password;
	private final boolean expected;
	
	public PasswordValidationTest(String Password, boolean expected) {
		this.Password=Password;
		this.expected=expected;
		
	}
	
	@Test
	public void testPassword_ShouldReturnExpected() {
		boolean isValidPassword=ValidationUtil.isValidPassworD(Password);
	    assertEquals(expected, isValidPassword);
	}
}