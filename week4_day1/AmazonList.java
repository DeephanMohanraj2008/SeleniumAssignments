package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize Driver
		ChromeDriver driver=new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.amazon.in");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		
		//Search for Phone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		//Get cost of phones displayed in the page
		List<WebElement> cost=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//Get total element counts
		int count=cost.size();
		
		//Get the price of individual phones
		List<String> price=new ArrayList<String>();
		for(int i=0;i<=count-1;i++)
		{
		  String rupees=cost.get(i).getText();
		  price.add(rupees);
		}
		
		//sort the price
		Collections.sort(price);
		
		//Print the phone with least price
		System.out.println("Lowest Price is:" +price.get(0));
		
		//Close Driver
		driver.close();
		

	}

}
