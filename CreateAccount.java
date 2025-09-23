package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Declaring Account Name
		
		String accountName="Sample4";
		
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
		
		//Clicking on Accounts
		
		driver.findElement(By.linkText("Accounts")).click();
		
		//Clicking on Create Account
		
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering Account Name and Description
		
		driver.findElement(By.id("accountName")).sendKeys(accountName);		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Selecting Industry
		WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryOptions=new Select(industry);
		industryOptions.selectByContainsVisibleText("Computer Software");
		
		//Selecting Ownership
		
		WebElement ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipOptions=new Select(ownership);
		ownershipOptions.selectByContainsVisibleText("S-Corporation");
		
		//Selecting Source
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select sourceOptions=new Select(source);
		sourceOptions.selectByValue("LEAD_EMPLOYEE");
		
		//Selecting Marketing Campaigns
		WebElement marketingCampaign=driver.findElement(By.name("marketingCampaignId"));
		Select marketingOptions=new Select(marketingCampaign);
		marketingOptions.selectByIndex(6);
		
		//Selecting State
		
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOptions=new Select(state);
		stateOptions.selectByValue("TX");
		
		//Clicking on Submit
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//Validating Account Name
	    String accountText=driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[1]/td[2]/span")).getText().strip();
	    if(accountText.contains(accountName))
	    {
	    	System.out.println("Account Name Same");
	    }
	    else
	    {
	    	System.out.println("Account Name Not Same");
	    }
		
		//Closing the Driver
		driver.close();
	}

}
