package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Declare Variables
		int count;
		String[]windowURL=new String[10];
		
		//Opening Chrome in Guest Mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
				
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter Username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Contacts
		driver.findElement(By.linkText("Contacts")).click();

		//Click on Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Click on From Contact Lookup
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Thread.sleep(2000);
		
		//Get Window id of Main window and first new tab window
		Set<String>openFirstWindow=driver.getWindowHandles();
		List<String>openFirstWindowOptions=new ArrayList<String>(openFirstWindow);
		count=openFirstWindowOptions.size();
		for(int i=0;i<=count-1;i++)
		{
			windowURL[i]=openFirstWindowOptions.get(i);
			//System.out.println(windowURL[i]);
		}
		
		//Switch to New Window 
		driver.switchTo().window(windowURL[1]);
		
		//Select first Element from Table
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		//Switch back to Main Window
		driver.switchTo().window(windowURL[0]);
		
		//Click on To Contact Lookup
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(2000);
		//Get Window id of Main window and second new tab window
		Set<String>openSecondWindow=driver.getWindowHandles();
		List<String>openSecondWindowOptions=new ArrayList<String>(openSecondWindow);
		for(int i=0;i<=count-1;i++)
		{
			windowURL[i]=openSecondWindowOptions.get(i);
			//System.out.println(windowURL[i]);
		}
		
		//Switch to 2nd New Tab
		driver.switchTo().window(windowURL[1]);
		
		//Click on the first element in the table
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		//Switch back to Main window
		driver.switchTo().window(windowURL[0]);
		
		//Click on Merge
		driver.findElement(By.linkText("Merge")).click();
		
		//Accept the alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//Print Page Title
		String pageTitle=driver.getTitle();
		System.out.println("Page Title is:"+pageTitle);
		
		//Close the driver		
		driver.close();
	}

}
