package com.bridgelabz.userregistrationjava;

import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class Regex 
{
	public boolean validFirstName(String firstName) 
	{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(firstName).matches();
	}

	public boolean validLastName(String lastName) 
	{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(lastName).matches();
	}
	public boolean validMobileNo(String number)
	{
		String reg="[0-9]{2}\\s[0-9]{10}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(number).matches();
	}
	public static boolean validEmail(String email)
	{
		String reg=("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
		Pattern p=Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
		return p.matcher(email).matches();
	}

}
