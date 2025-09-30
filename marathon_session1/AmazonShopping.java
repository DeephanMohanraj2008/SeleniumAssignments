package marathon.session1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonShopping {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize driver
		ChromeDriver driver=new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.amazon.in");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Giving Implicit wait for 30seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		
		//Search for Bags
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		//Click on Search Button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Extracting search results
		String searchResult=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[1]")).getText();
		String[] result=searchResult.split("for");
		
		//Print search Results
		System.out.println("Search Result Vaue:"+result[0]);
		
		//Applying filter for first 2 brands
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Skybags to narrow results']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Safari to narrow results']")).click();
		
		//Sorting filter based on new arrival
		Thread.sleep(2000);
		WebElement selected=driver.findElement(By.id("s-result-sort-select"));
		Select sort=new Select(selected);
		sort.selectByIndex(4);
		driver.findElement(By.linkText("Newest Arrivals")).click();
     	Thread.sleep(2000);
     	
     	//Extracting bagName and printing
		String bagName=driver.findElement(By.xpath("//Div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']")).getText();
		System.out.println("Bag Name is:"+bagName);
		
		//Extracting Price and printing
		String discountedPrice=driver.findElement(By.xpath("//a[@class='a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal']/span")).getText();
        System.out.println("Bag Price is:"+discountedPrice);
        
      //Extracting Page Title and printing
        String pageTitle=driver.getTitle();
        System.out.println("PageTitle is:"+pageTitle);
        
        //Closing Driver
        driver.close();
        
	}
	

}
