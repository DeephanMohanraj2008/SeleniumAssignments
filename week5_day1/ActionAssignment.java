package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ActionAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
				//Initialize Driver
				ChromeDriver driver=new ChromeDriver();
						
				//Launch URL
				driver.get("https://www.amazon.in/");
				
				//Maximize Window
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Refresh current page
				driver.navigate().refresh();
				
				//Instantiate Action class
				Actions action=new Actions(driver);
				
				//Navigate to Link Conditions of Use and Sale
				WebElement condition=driver.findElement(By.linkText("Conditions of Use & Sale"));
				action.scrollToElement(condition).perform();
				
				//Print the link text
				System.out.println("Text is:"+condition.getText());
				
				//Take the screenshot and store in C Drive
				File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(file, new File("C:\\tmp\\Amazon.png"));
				
				//Close the Driver
				driver.close();
	}

}
