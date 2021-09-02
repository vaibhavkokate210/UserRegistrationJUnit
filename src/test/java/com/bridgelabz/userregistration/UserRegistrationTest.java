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
	@Test
	public void lastName_ValidationWill_ReturnFalse()
	{
		Regex regex=new Regex();
		boolean result=regex.validLastName("kokate");
		Assert.assertEquals(false, result);
	}
	@Test
	public void lastName_ValidationWill_ReturnFalse_IfNameLessThanThreeChar()
	{
		Regex regex=new Regex();
		boolean result=regex.validLastName("kte");
		Assert.assertEquals(false, result);
	}
	@Test
	public void mobileNo_ValidationWill_ReturnTrue()
	{
		Regex regex=new Regex();
		boolean result=regex.validMobileNo("91 9978345234");
		Assert.assertEquals(true, result);
	}
	@Test
	public void mobileNo_ValidationWill_ReturnFalse()
	{
		Regex regex=new Regex();
		boolean result=regex.validMobileNo("91 997345234");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void mobileNo_ValidationWill_ReturnFalse_IfNumberIncrese()
	{
		Regex regex=new Regex();
		boolean result=regex.validMobileNo("91 99734529834");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void email_ValidationWill_ReturnTrue()
	{
		Regex regex=new Regex();
		boolean result=regex.validEmail("Vaibhavkokate123@gmail.com");
		Assert.assertEquals(true, result);
	}
	@Test
	public void email_ValidationWill_ReturnFalse_IfContainsOnlyAlphabet()
	{
		Regex regex=new Regex();
		boolean result=regex.validEmail("vaibhav");
		Assert.assertEquals(false, result);
	}
	@Test
	public void email_ValidationWill_ReturnFalse_IfEmailStartsWithDot()
	{
		Regex regex=new Regex();
		boolean result=regex.validEmail(".vaibhav@gmail.com");
		Assert.assertEquals(false, result);
	}
	@Test
	public void password_ValidationWill_ReturnTrue()
	{
		Regex regex=new Regex();
		boolean result=regex.validPassword("Ajay#8972");
		Assert.assertEquals(true, result);
	}
	@Test
	public void password_ValidationWill_ReturnFalse_IfNotContainOneCaps()
	{
		Regex regex=new Regex();
		boolean result=regex.validPassword("ajayy");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void password_ValidationWill_ReturnFalse_IfNotContainsSmallLetter()
	{
		Regex regex=new Regex();
		boolean result=regex.validPassword("AJAY");
		Assert.assertEquals(false, result);
	}
	@Test
	public void password_ValidationWill_ReturnFalse_IfNotContainNumber()
	{
		Regex regex=new Regex();
		boolean result=regex.validPassword("Ajay");
		Assert.assertEquals(false, result);
	}
	
	@Test
    public boolean email_ValidationWill_ReturnTrue(String email){
        Regex reg = new Regex();
        boolean result = reg.validEmail(email);
        if (result)
            return true;
        else
            return false;
    }
}
