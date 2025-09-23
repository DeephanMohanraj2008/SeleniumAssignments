package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//initialize driver
		ChromeDriver driver=new ChromeDriver();
		
		//Launch URl
		driver.get("https://facebook.com");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Enter email and password
		driver.findElement(By.id("email")).sendKeys("testleaf2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click Login button
		driver.findElement(By.name("login")).click();
		
		//Print page title
		String title=driver.getTitle();
		System.out.println(title);

	}

}
