package com.bridgelabz.userregistrationjava;

import java.util.regex.Pattern;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation
{
	boolean validateUserEntry(String entry);
}
public class Regex
{
	public static void main(String args[])
	{
	Validation validFirstName=(String firstName)->{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(firstName).matches();
	};
	boolean result = validFirstName.validateUserEntry("Vaibhav");
	System.out.println("First name is valid = "+result);
	
	Validation validLastName=(lastName)->{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(lastName).matches();
	};
	result = validLastName.validateUserEntry("Kokate");
	System.out.println("Last name is valid = "+result);
	
	Validation validMobileNo=(String mobileNo)->{
		String reg="[0-9]{2}\\s[0-9]{10}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(mobileNo).matches();
	};
	result = validMobileNo.validateUserEntry("91 9987345234");
	System.out.println("Mobile number is valid = "+result);
	
	Validation validEmail=(String email)->{
		String reg="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern p=Pattern.compile(reg);
		return p.matcher(email).matches();
	};
	result = validEmail.validateUserEntry("Vaibhavkokate123@gmail.com");
	System.out.println("Email is valid = "+result);
	
	Validation validPassword=(String password)->{
		String reg="[a-z[0-9]+[A-Z]+[@#$]{1}+]{8,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(password).matches();
	};
	result = validPassword.validateUserEntry("Ajay@345");
	System.out.println("Password is valid = "+result);


}}
