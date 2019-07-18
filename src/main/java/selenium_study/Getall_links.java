package selenium_study;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getall_links {
	
WebDriver driver;

@Test

public void getalllinks()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Diligence soft\\git\\Study\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://automationpractice.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	 List<WebElement> link = driver.findElements(By.xpath("//a"));
	 System.out.println(link.size());
	 
	// ArrayList<String> data= new ArrayList<String>();
	for(int i=0;i<link.size();i++)
	{
		System.out.println(link.get(i).getText());
		//data.add(link.get(i).getAttribute("href")); // this will give all the link 
		System.out.println(link.get(i).getAttribute("href"));
	}
	//System.out.println(data.size());
	
}
	

	
	
	
}
