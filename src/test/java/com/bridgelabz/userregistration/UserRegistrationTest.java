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
		boolean result=regex.validFirstName("Vaibhav");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void firstName_ValidationWill_ReturnFalse()
	{
		Regex regex=new Regex();
		boolean result=regex.validFirstName("vaibhav");
		Assert.assertEquals(false, result);
	}
	@Test
	public void lastName_ValidationWill_ReturnTrue()
	{
		Regex regex=new Regex();
		boolean result=regex.validLastName("Kokate");
		Assert.assertEquals(true, result);
	}
}
