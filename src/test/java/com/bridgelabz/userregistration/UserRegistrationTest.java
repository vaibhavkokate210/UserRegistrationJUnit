package com.bridgelabz.userregistration;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.userregistrationjava.Regex;

public class UserRegistrationTest 
{
	@Test
	public void firstName_ValidationWill_ReturnTrue()
	{
		Regex regex=new Regex();
		boolean result=regex.validUserName("Vaibhav");
		Assert.assertEquals(true, result);
	}
}
