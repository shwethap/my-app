package com.mycompany.test;

import java.util.List;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mycompany.DataObject.*;
import com.mycompany.Pagefactory.*;



@Test
public class WebDriverTest extends SelTestCase  {
	@Test(dataProvider = "regdata", dataProviderClass=RegistrationData.class)
	 public void RegistrationTestNew(RegistrationData RegData)
	 {
		RegistrationNew reg= PageFactory.initElements(driver,RegistrationNew.class);
				driver.get("http://newtours.demoaut.com/mercuryregister.php");
		 reg.createNewUser(RegData);
			assert driver.findElement(By.tagName("body")).getText().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		 
	 }

	@Test
	public void HardAssertion()
	{
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		Assert.assertTrue(driver.findElements(By.name("firstName")).size()==1, "first name is missing");
		//intensionally worng
		
		Assert.assertTrue(driver.findElements(By.name("WrongLastName")).size()==1,"lastname is missing");
	}
@Test
	public void softAssertion()
	{
		driver.get("http://newtours.CustomVerification ver");
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertTrue(driver.findElements(By.name("WrongLastName")).size()==1,"lastname is missing");
		 softAssert.assertTrue(driver.findElements(By.name("firstName")).size()==1, "first name is missing");
		 System.out.println("soft assertion");
		 softAssert.assertTrue(driver.findElements(By.name("Wrongphone")).size()==1, "Phone field is missing");
		 
		//customVerification customverification=new CustomVerification();
		//customverification.verifyTrue("filements(By.name("WrongLastName")).size()==1,"lastname is missing");
		//customverification.checkForVrst name field is missing",driver.findElements(By.name("firstName")).size()==1);
		//Assert.assertTrue(driver.findEeificationErrors();
	}

@Test 
public void customSoftAssertion()
{
	customForVerification cus= new customForVerification();
	cus.assertTrue(driver.findElements(By.name("WrongLastName")).size()==1,"lastname is missing");
	cus.assertTrue(driver.findElements(By.name("email")).size()==1, "username name is missing");
	cus.assertTrue(driver.findElements(By.name("firstName")).size()==1, "first name is missing");
	cus.assertTrue(driver.findElements(By.name("Wrongphone")).size()==1, "Phone field is missing");
}
	}



	


