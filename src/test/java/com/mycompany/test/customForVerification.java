package com.mycompany.test;

import org.testng.Assert;
import org.testng.Reporter;

public class customForVerification {
	
	StringBuffer verificationerrors;
	
	public customForVerification()
	{
		verificationerrors=new StringBuffer();
	}

	public void assertTrue(Boolean b, String message)
	{
		try
		{
	    Assert.assertTrue(b.booleanValue(), message);	
		}
		catch(Error e)
		{
			verificationerrors.append(e);
			Reporter.log(message +"<br>");
		}
	}
	
	public void CheckForVerificationError()
	{
		String frounderror=verificationerrors.toString();
		clearverificationerrors(verificationerrors);
		if(!"".equalsIgnoreCase(frounderror))
		{
			org.testng.Assert.fail(" Marking as fail as deviated from the expectation"); 
		}
		
	}

	private void clearverificationerrors(StringBuffer verificationerrors2) {
		verificationerrors=new StringBuffer();
	}

}
