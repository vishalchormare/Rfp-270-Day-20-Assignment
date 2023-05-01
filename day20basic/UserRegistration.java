package day20basic;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String MOBILE_NUMBER_PATTERN = "(0/91)?[7-9][0-9]{9}";
	private static final String Email_PATTERN = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
	private static final String PASSWORD = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}

	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(lname).matches();
	}

	public boolean validateMobileNumber(String num) {
		Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
		return pattern.matcher(num).matches();
	}

	public boolean validateEmailAddress(String email) {
		Pattern pattern = Pattern.compile(Email_PATTERN);
		return pattern.matcher(email).matches();
	}

	
	public boolean validatePassword(String passwordrule1) {
		Pattern pattern = Pattern.compile(PASSWORD);
		return pattern.matcher(passwordrule1).matches();
	}

}
