package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		
				//Initialize Driver
				ChromeDriver driver=new ChromeDriver();
				
				//Launch URL
				driver.get("https://www.amazon.in");
				
				//Maximize Window
				driver.manage().window().maximize();
				
				//Implict wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Search for Phone
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				//Click on the first mobile
				driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]")).click();
				
				//print 2nd page title
				System.out.println("2nd Page Title is"+driver.getTitle());
				
				//Get window address in a Set
				Set<String> windowID=driver.getWindowHandles();
				
				//Convert set into list to retrieve elements
				List<String> window=new ArrayList<String>(windowID);
				System.out.println("Second Window ID:"+window.get(1));
				
				//Switch to first window and print title, id
				driver.switchTo().window(window.get(0));
				System.out.println("First Page Title:"+driver.getTitle());
				System.out.println("First WindowID is"+window.get(0));
				
				//Close all windows
				driver.quit();
				

	}

}
