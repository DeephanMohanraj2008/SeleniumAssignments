package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling {

	public static void main(String[] args) {
				//Declare Variables
		        String input="Deephan",output;
		        String[] outputText=new String[2];
		
				//Opening Chrome in Guest Mode
				ChromeDriver driver=new ChromeDriver();
						
				//Launch URL
				driver.get("http://leafground.com/alert.xhtml");
				
				//Maximize Window
				driver.manage().window().maximize();
				
				//Implict wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				
				//Dismiss Alert flow
				
				//Click on Show in prompt 
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
				//Switch to Alert
				Alert alert=driver.switchTo().alert();
				
				//Enter the Text
				alert.sendKeys(input);
				
				//Dismiss Alert 
				alert.dismiss();
				
				//Print validation completed
			    System.out.println("Dismiss Alert Validation Completed");

				
				//Accept Alert flow
				
				//Click on Show in prompt 
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
				//Switch to Alert
				Alert alert2=driver.switchTo().alert();
				
				//Enter the Text
				alert2.sendKeys(input);
				
				//Dismiss Alert 
				alert2.accept();
				
				//Extract Entire Alert text
				output=driver.findElement(By.xpath("(//span[@id='confirm_result'])[1]")).getText();
				
				//Extract only input text
				outputText=output.split(":");
				
				//remove blankspace
				outputText[1]=outputText[1].strip();
								
				//Validated if input text and Alert text are matching
				if(input.equals(outputText[1]))
				{
					System.out.println("Input Text and Output Alerts are same");
				}
				else
				{
					System.out.println("Input Text and Output Alerts are not same"+input+outputText[1]);
				}	
						
				
				//Close Driver
				driver.close();
				
	
	}

}
