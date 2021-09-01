package com.bridgelabz.userregistrationjava;

import java.util.regex.Pattern;

public class Regex 
{
	public boolean validUserName(String firstName) 
	{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(firstName).matches();
	}

}
