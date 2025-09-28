package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		
		//Enter FirstName,LastName,CompanyName,FirstNameLocal,Department,Description,Email
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC Tech");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Deep");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Deep");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Demo");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@xxx.com");
		
		
		//Select State
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateOptions=new Select(state);
		stateOptions.selectByVisibleText("New York");
		
		//Click on Submit		
		driver.findElement(By.name("submitButton")).click();
				
		
		//Click On Edit
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear Description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Update Note		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated");
		
		//Click on Update
		driver.findElement(By.className("smallSubmit")).click();
		
		//Print Page Title
		
		String title=driver.getTitle();
		System.out.println("Page Title is:"+title);
		
		//Close Driver
		driver.close();	

	}

}
