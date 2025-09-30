package week3.day2;

public class Edge extends Browser {
	
//Defining class methods	
public void takeSnap()
{
	System.out.println("Take Snap");
}
public void clearCookies()
{
	System.out.println("Clear Cookies");
}
public static void main(String[] args) {
	//Creating Child class object
	Edge edge=new Edge();
	
	//Creating Parent class object
	Browser browser=new Browser();
	
	//Calling Child class methods and parent class methods using Child objects
	edge.takeSnap();
	edge.clearCookies();
	edge.openURL();
	edge.closeBrowser();
	edge.navigateBack();
	
	//Calling Parent class methods using parent objects
	browser.openURL();
	browser.closeBrowser();
	browser.navigateBack();
}
}
