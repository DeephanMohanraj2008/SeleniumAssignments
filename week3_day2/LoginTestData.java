package week3.day2;

//Defining sub class which extends class TestData

public class LoginTestData extends TestData {
    // Defining methods in sub class
	public void enterUserName()
	{
		System.out.println("Username Entered");
	}
	public void enterPassword()
	{
		System.out.println("Password Entered");
	}
	public static void main(String[] args) {
		//Creating object for sub class
		LoginTestData data=new LoginTestData();
		
		//calling sub class and super class methods
		data.enterCredentials();
		data.navigateToHomePage();
		data.enterUserName();
		data.enterPassword();
		
		//Creating objects for super class
		TestData data1=new TestData();
		
		//Calling super class methods
		data1.enterCredentials();
		data1.navigateToHomePage();
		
	}

}
