package day20basic;

import org.junit.Assert;
import org.junit.Test;

public class JuitTest {

	@Test
	public boolean givenFirstName_WhenShort_ShouldReturnFalse(String str) {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateFirstName(str);
		Assert.assertTrue(result);
		return true;
	}

	@Test
	public boolean givenLastName_WhenProper_ShouldReturnTrue(String str) {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateLastName(str);
		Assert.assertTrue(result);
		
		return true;
	}

	@Test
	public boolean givenMobileNumber_WhenProper_ShouldReturnTrue(String str) {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateMobileNumber(str);
		Assert.assertTrue(result);
		
		return true;
	}
	

	@Test
	public boolean givenEmail_WhenValid_ShouldReturnTrue(String str) {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmailAddress(str);
		Assert.assertTrue(result);
		return true;
	}

	@Test
	public boolean givenPassword_WhenValid_ShouldReturnTrue(String str) {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePassword(str);
		Assert.assertTrue(result);
		return true;
	}

}
