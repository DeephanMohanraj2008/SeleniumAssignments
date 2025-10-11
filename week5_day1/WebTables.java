package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		//Declare Variables
		int i,j,count=0;
		
		//Initialize Driver
		ChromeDriver driver=new ChromeDriver();
				
		//Launch URL
		driver.get("https://erail.in/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clear data in From Field
		driver.findElement(By.id("txtStationFrom")).clear();
		
		//Enter From Value as MAS
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		
		//Click on the value in dropdown
		driver.findElement(By.xpath("//Div[text()='Mgr Chennai Ctr']")).click();
		
		//Clear data in To field
		driver.findElement(By.id("txtStationTo")).clear();
		
		//Enter From Value as MDU
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		
		//Click on the value in dropdown
		driver.findElement(By.xpath("//Div[text()='Madurai Jn']")).click();
		
		//Unselect the select date only checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//Retrieve all train names in list
		List<WebElement> trainList = driver.findElements(By.xpath("//Div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		
		//Print all Train Names
		System.out.println("Train Names are:");
		for(i=0;i<=trainList.size()-2;i++)
		{
			System.out.println(trainList.get(i).getText());
		}
		
		//Iterate each value in train name list and if match is found cincrement count by 1
		for(i=0;i<=trainList.size()-2;i++)
		{
			String text1=trainList.get(i).getText();
			for(j=i+1;j<=trainList.size()-1;j++)
			{
				String text2=trainList.get(j).getText();
				if(text1.equals(text2))
				{
					count=count+1;
				}
			}
		}
		
		//Logic to Print if train name has any duplicates or not
		if(count==0)
		{
			System.out.println("No Duplicate Train Name");
			
		}
		else
		{
			System.out.println("Train Name have duplicates");
		}
		
		//Close driver
		driver.close();
	}

}
