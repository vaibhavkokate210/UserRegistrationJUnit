package com.bridgelabz.userregistrationjava;

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

}
