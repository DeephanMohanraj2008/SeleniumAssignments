package week2.day1;

public class Browser {

	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
	}
    public String loadUrl()
    {
    	String text="Url Loaded Successfully";
    	return text ;
    }
	public static void main(String[] args) {
     
		Browser browser=new Browser();
		browser.launchBrowser("Chrome");
		String text1=browser.loadUrl();
		System.out.println(text1);
		

	}

}
