package com.mycompany.DataObject;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.DataProvider;

	public class RegistrationData {
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		private String country;
		private String password;
		private String confirmPassword;
		
		
		public String getFirstName()
		{
			return this.firstName;
		}
	 public void setFirstName(String firstname)
	 {
		 this.firstName=firstname;
	 }
	 public String getLastName()
		{
			return this.lastName;
		}
	public void setLastName(String lastname)
	{
		 this.lastName=lastname;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phonenumber)
	{
	 this.phoneNumber=phonenumber;
	}
	public String getCountry()
	{
		return this.country;
	}
	public void setcountry(String country)
	{
	 this.country=country;
	}
	public String getUserName()
	{
		return this.country;
	}
	public void setUserName(String username)
	{
	 this.email=username;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String password)
	{
	 this.password=password;
	}
	public String getConfirmPWassord()
	{
		return this.confirmPassword;
	}
	public void setConfirmPassword(String confirmpassord)
	{
	 this.confirmPassword=confirmpassord;
	}

	@DataProvider(name="regdata")
	public static Object[][] getregistrationData()
	{
		RegistrationData regdata1= new RegistrationData();
		regdata1.setFirstName("name1");
		regdata1.setLastName("gowda");
		regdata1.setPhoneNumber("1234");
		regdata1.setcountry("INDIA");
		regdata1.setUserName("user1");
		regdata1.setPassword("password");
		regdata1.setConfirmPassword("password");
		
		RegistrationData regdata2= new RegistrationData();
		regdata2.setFirstName("name1");
		regdata2.setLastName("gowda");
		regdata2.setPhoneNumber("1234");
		regdata2.setcountry("INDIA");
		regdata2.setUserName("user1");
		regdata2.setPassword("password");
		regdata2.setConfirmPassword("password");
		
			return new Object[][]{{regdata1},{regdata2}};
					
		}
	}





