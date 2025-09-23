package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
	//Initialize driver	
	ChromeDriver driver=new ChromeDriver();
	
	//Launch URL
	driver.get("https://en-gb.facebook.com/");
	
	//Maximize Window
	driver.manage().window().maximize();
	
	//Setting Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	
	//Clicking Create New Account
	driver.findElement(By.linkText("Create new account")).click();	
	
	//Enter First and Last Name
	driver.findElement(By.name("firstname")).sendKeys("Deephan");
	driver.findElement(By.name("lastname")).sendKeys("Mohanraj");
	
	//Select Date of Birth(Date,Month,Year)
	WebElement day=driver.findElement(By.id("day"));
	Select birthday=new Select(day);
	birthday.selectByValue("1");
	
	WebElement month=driver.findElement(By.id("month"));
	Select birthmonth=new Select(month);
	birthmonth.selectByVisibleText("Aug");
	
	WebElement year=driver.findElement(By.id("year"));
	Select birthyear=new Select(year);
	birthyear.selectByVisibleText("2000");
	
	//Select Gender as Male
	driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
	
	//Enter Email	
	driver.findElement(By.name("reg_email__")).sendKeys("deephan.mohanraj@gmail.com");
	
	//Enter Password
	driver.findElement(By.id("password_step_input")).sendKeys("Sample@123");
	
	//Close Driver
	driver.close();
}
}
