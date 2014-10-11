package com.mycompany.Pagefactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mycompany.DataObject.*;

public class RegistrationNew {
	WebDriver driver;

	public RegistrationNew(WebDriver driver2) {
		driver=driver2;
	}
	
	@CacheLookup
	@FindBy(name="firstName")
	WebElement firstNameTextBox;
	
	@CacheLookup
	@FindBy(name="lastName")
	WebElement lastNameTextBox;
	
	@CacheLookup
	@FindBy(name="phone")
	WebElement phoneNumberTextBox;
	
	@CacheLookup
	@FindBy(name="country")
	WebElement ourCountry;
	
	@CacheLookup
	@FindBy(name="email")
	WebElement userNameTextBox;
	
	@CacheLookup
	@FindBy(name="password")
	WebElement passwordTextBox;
	
	@CacheLookup
	@FindBy(name="confirmPassword")
	WebElement confirmPasswordTextbox;
	
	public RegistrationNew EnterFirstName(String firstname)
	{
	  	firstNameTextBox.sendKeys(firstname);
	  	return this;
	}
	public RegistrationNew EnterLastName(String lastname)
	{
		lastNameTextBox.sendKeys(lastname);
	  	return this;
	}
	public RegistrationNew EnterPhoneNumber(String phone)
	{
		phoneNumberTextBox.sendKeys(phone);
	  	return this;
	}
	public RegistrationNew Entercountry(String country)
	{
	  	new Select(ourCountry).selectByVisibleText(country);
	  	return this;
	}
	public RegistrationNew EnterUserName(String username)
	{
	  	userNameTextBox.sendKeys(username);
	  	return this;
	}
	public RegistrationNew EnterPassword(String password)
	{
	  	passwordTextBox.sendKeys(password);
	  	return this;
	}
	public RegistrationNew EnterConfirmPassword(String confirmpassword)
	{
	  	confirmPasswordTextbox.sendKeys(confirmpassword);
	  	return this;
	}
	private returnPageObject clickRegister() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("register")).click();
		return PageFactory.initElements(driver,returnPageObject.class);
	}
	
	public returnPageObject createNewUser(RegistrationData regdata) {
		return EnterFirstName(regdata.getFirstName()).EnterLastName(regdata.getLastName()).
				EnterPhoneNumber(regdata.getPhoneNumber()).Entercountry(regdata.getCountry()).
				EnterUserName(regdata.getUserName()).EnterPassword(regdata.getPassword()).
				EnterConfirmPassword(regdata.getConfirmPWassord()).clickRegister();
		
	}
	
}

