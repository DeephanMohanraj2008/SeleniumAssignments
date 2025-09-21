package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.launchBrowser("Edge");
		String text1=browser.loadUrl();
		System.out.println(text1);
	}

}
