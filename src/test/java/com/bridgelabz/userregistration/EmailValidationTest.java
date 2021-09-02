package com.bridgelabz.userregistration;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidationTest 
{
	String email;
    Boolean result;
    UserRegistrationTest reg;

    public EmailValidationTest(String email, boolean result){
        this.email = email;
        this.result= result;
    }

    @Before
    public void initialize(){
        reg = new UserRegistrationTest();
    }

    @Parameterized.Parameters
    public static Collection validateEmails(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@gmail.com",true},
                {"abc.100@gmail.com",true},
                {"abc1215@gmail.com",true},
                {"abc-100@gmail.com",true},
                {"abc.100@gmail.com",true},
                {"abc@1.com",true},
                {"abc@abc@gmail.com",false},
                {"abc.+100@gmail.com",false},
                {"abc",false},
                {".abc.com",false},
                {"abcd@12.com",false},
                {"abc.10000@com",false},
                {"abc@abc.in.com",false},
                {"abc@abc.com.1x",false},
                {"abc@$%abc.com.1x",false}
        });
    }

    @Test
    public void email_ValidationWill_returnResult() {
        System.out.println("Email = " +email+ " is valid = " +result);
        Assert.assertEquals(result, reg.email_ValidationWill_ReturnTrue(email));
    }
}
