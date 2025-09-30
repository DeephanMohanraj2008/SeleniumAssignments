package week3.day2;

public class Safari extends Browser{
	
//Defining class methods	
public void readerMode()
{
System.out.println("Reader Mode");	
}
public void fullScreenMode()
{
	System.out.println("Full Screen Mode");
}
public static void main(String[] args) {
//Creating Child class object	
Safari safari=new Safari();

//Creating Parent class object
Browser browser=new Browser();

//Calling Child class methods and parent class methods using Child objects
safari.readerMode();
safari.fullScreenMode();
safari.openURL();
safari.closeBrowser();
safari.navigateBack();

//Calling Parent class methods using parent objects
browser.openURL();
browser.closeBrowser();
browser.navigateBack();
}
}

