package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameValidation {

	public static void main(String[] args) {
		//Initialize Driver
		ChromeDriver driver=new ChromeDriver();
				
		//Launch URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switch to Frame
		
		driver.switchTo().frame("iframeResult");
		
		//Click on the Try It button
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Initialize alert
		
		Alert alert=driver.switchTo().alert();
		
		//Accept Alert
		alert.accept();
		
		//Validate the text
		
		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if (text.equals("You pressed OK!"))
		{
			System.out.println("Text Verification is successful");
		}
		else			
		{
			System.out.println("Text Verification is not successful");
		}

	}

}
