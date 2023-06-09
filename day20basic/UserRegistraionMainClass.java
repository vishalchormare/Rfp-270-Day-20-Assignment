package day20basic;

import java.util.Scanner;

public class UserRegistraionMainClass {

	public static void userValidationFunction() {

		JuitTest juitTest = new JuitTest();
		Scanner sc = new Scanner(System.in);
		String fName = null, lName = null, emailId = null, mobileNumber = null, password = null;

		int temp = -1;
		while (temp != 0) {

			System.out.println("1.FirstName 2.LastName 3.EmailID 4.MobileNumber 5.Password 7.Exit");
			System.out.print("Enter the option:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				boolean flagFname = false;
				while (flagFname != true) {
					System.out.print("Enter first name:");
					fName = sc.next();

					if (juitTest.givenFirstName_WhenShort_ShouldReturnFalse(fName)) {
						flagFname = true;

						System.out.println(juitTest.givenFirstName_WhenShort_ShouldReturnFalse(fName));
					} else {
						System.out.println("!first name not valid!");
					}
				}
				break;
			case 2:
				boolean flagLname = false;
				while (flagLname != true) {
					System.out.print("Enter last name:");
					lName = sc.next();
					if (juitTest.givenLastName_WhenProper_ShouldReturnTrue(lName)) {
						flagLname = true;
						System.out.println(juitTest.givenLastName_WhenProper_ShouldReturnTrue(lName));
					} else {
						System.out.println("!last name not valid!");
					}
				}
				break;
			case 3:
				boolean flagEmail = false;
				while (flagEmail != true) {
					System.out.print("Enter email Id:");
					emailId = sc.next();
					if (juitTest.givenEmail_WhenValid_ShouldReturnTrue(emailId)) {
						flagEmail = true;
						System.out.println(juitTest.givenEmail_WhenValid_ShouldReturnTrue(emailId));
					} else {
						System.out.println("!emailID not valid!");
					}
				}
				break;
			case 4:
				boolean flagMobile = false;
				while (flagMobile != true) {
					System.out.print("Enter mobile number:");
					mobileNumber = sc.next();
					if (juitTest.givenMobileNumber_WhenProper_ShouldReturnTrue(mobileNumber)) {
						flagMobile = true;
						System.out.println(juitTest.givenMobileNumber_WhenProper_ShouldReturnTrue(mobileNumber));
					} else {
						System.out.println("!mobile number not valid!");
					}
				}
				break;
			case 5:
				boolean flagPassword = false;
				while (flagPassword != true) {
					System.out.print("Enter password:");
					password = sc.next();
					if (juitTest.givenPassword_WhenValid_ShouldReturnTrue(password)) {
						flagPassword = true;
						System.out.println(juitTest.givenPassword_WhenValid_ShouldReturnTrue(password));
					} else {
						System.out.println("!password not valid!");
					}
				}
				break;
			case 7:
				temp = 0;
				break;
			default:
				System.out.println("!!! Enter valid option !!!");
				break;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("USER REGISTRATION WITH Test");
		userValidationFunction();
	}
}
