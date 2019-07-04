package selenium_study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable {

	WebDriver driver;
	
	@Test
	public void webtable()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\newjlearn\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//get the row and column number from webtable
		 int rownumber = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr")).size();
		 int colnumber = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		 System.out.println(" Total row number: "+rownumber);
		 System.out.println(" Total col number: "+colnumber);
		 
		 
		 // get the row data from webtable
		String rowdata = driver.findElement(By.xpath("//a[contains(text(),'Relaxo Footwears')]/parent::*/following-sibling::td[3]")).getText();
		 System.out.println("Relaxo Footwear current price is: "+rowdata);
		
		
	}
	
	
	
	
}
