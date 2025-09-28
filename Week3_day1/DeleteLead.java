package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
				//Opening Chrome in Guest Mode
				ChromeOptions options=new ChromeOptions();
				options.addArguments("guest");
				ChromeDriver driver=new ChromeDriver(options);
				
				//Launching URL
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximizing browser window
				driver.manage().window().maximize();
				
				//Implicit timeout for 30 seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
				
				//Entering User Name and Password
				driver.findElement(By.id("username")).sendKeys("DemoCSR");		
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Clicking on Submit
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Clicking on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Clicking on Leads
				driver.findElement(By.linkText("Leads")).click();
		
		       //Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Goto Phone Number tab
				driver.findElement(By.xpath("//span[text()='Phone']")).click();				
				driver.findElement(By.name("phoneCountryCode")).clear();				
				driver.findElement(By.name("phoneNumber")).sendKeys("426441955");				
				driver.findElement(By.xpath("//Button[text()='Find Leads']")).click();
				
				//Wait for Record To Appear
				Thread.sleep(2000);
				
				//Get Record Number
				
				String text= driver.findElement(By.xpath("//Div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
				System.out.println(text);
	
				//Click on the Record
				driver.findElement(By.xpath("//Div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				
				//Delete Lead
				driver.findElement(By.linkText("Delete")).click();
				
				Thread.sleep(2000);
				//Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Goto Phone Number tab
				driver.findElement(By.xpath("//span[text()='Phone']")).click();				
				driver.findElement(By.name("phoneCountryCode")).clear();				
				driver.findElement(By.name("phoneNumber")).sendKeys("426441955");		
				driver.findElement(By.xpath("//Button[text()='Find Leads']")).click();		
				
				
				//Validate if record deleted successfully
				Thread.sleep(2000);
				String message=driver.findElement(By.xpath("//Div[@class='x-paging-info']")).getText();
				if(message.equals("No records to display"))
				{					
					System.out.println("Phone Number Deleted Successfully");
				}
				else
				{
					System.out.println("Phone Number not Deleted Successfully");
				}
				
				//Close Driver
				driver.close();
		
	}

}
