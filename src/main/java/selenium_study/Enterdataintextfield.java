package selenium_study;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class Enterdataintextfield {
		
		
		WebDriver driver;
		
		@Test
		public void enterdataintextfield() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "E:\\newjlearn\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#email")).sendKeys("ashu.chaturvedi109@gmail.com");
			driver.findElement(By.cssSelector("#pass")).sendKeys("hariom123");
			driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ashu");
			driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("chaturvedi");
			driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("ashu.chaturvedi109@gmail.com");
			driver.findElement(By.cssSelector("input[aria-label='Re-enter email address']")).sendKeys("ashu.chaturvedi109@gmail.com");
			driver.findElement(By.cssSelector("input[aria-label='New password']")).sendKeys("9870570547");
			
		
			WebElement day = driver.findElement(By.cssSelector("#day"));// Webelement creation 
			Select select= new Select(day);
			select.selectByValue("10");
			
			WebElement month = driver.findElement(By.cssSelector("#month"));// Webelement creation 
			Select select1= new Select(month);
			select1.selectByIndex(9);
			WebElement year = driver.findElement(By.xpath("//select[@id='year' and @title='Year']"));// Webelement creation 
			Select select2= new Select(year);
			select2.selectByVisibleText("1988");
			Thread.sleep(200);
			
		}

	}

