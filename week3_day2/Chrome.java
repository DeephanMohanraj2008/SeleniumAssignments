package week3.day2;

public class Chrome extends Browser {
	
	//Defining class methods

	public void inCognito()
	{
		System.out.println("Incognito");
	}
	public void clearCache()
	{
		System.out.println("ClearCache");
	}
	public static void main(String[] args) {
		//Creating Child class object
		Chrome chrome=new Chrome();
		
		//Creating Parent class object
		Browser browser=new Browser();
		
		//Calling Child class methods and parent class methods using Child objects
		chrome.inCognito();
		chrome.clearCache();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		
		//Calling Parent class methods using parent objects
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();
	}
}
