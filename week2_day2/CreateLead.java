package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		
		       //Initialize Title
		       String title="Software Engineer";
		    		   
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
				
				//Clicking on CreateLead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter Company Name,First Name, Last Name and Title
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Tech");	
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deep");	
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");				
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
				
			   //Click on Submit
				
				driver.findElement(By.name("submitButton")).click();
				
			   //Validate Title 
				
				String expectedText=driver.findElement(By.xpath("//Div[@class='fieldgroup-body']/table/tbody/tr[6]/td[2]/span")).getText().strip();
				
				if(expectedText.equals(title))
				{
					System.out.println("Title is same" );
				}
				else				{
					System.out.println("Title is Not same");
				}
				
				//Close the Driver
				driver.close();
	}

}
