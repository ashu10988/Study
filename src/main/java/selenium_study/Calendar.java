package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendar {

	WebDriver driver;

//	String month= "November 2019";
//	String date = "21";
//	 

	String month; 
	String date;

	public void data(String month, String date) {
		this.month = month;
		this.date = date;
		System.out.println(" Enter month: " + month);
		System.out.println(" Enter date: " + date);

	}

	// @Test
	public void calendar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\newjlearn\\Selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#dpd1>div>input")).click();

		WebElement mon = driver.findElement(By.xpath(
				"//div[@id='cookyGotItBtnBox']/following-sibling::div[1]/child::div[1]/table/thead/tr[1]/th[2]"));
		while (true) {
			if (mon.getText().equals(month)) {
				break;
			} else {
				driver.findElement(By.xpath(
						"//div[@id='cookyGotItBtnBox']/following-sibling::div[1]/child::div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(500);
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@id='cookyGotItBtnBox']/following-sibling::div[1]/child::div[1]/table/tbody/tr[4]/td[contains(text(),'"
						+ date + "')]")).click();
	}

	@Test
	public void call() throws InterruptedException {
		Calendar d1 = new Calendar();
		d1.data("November 2019", "21");
		d1.calendar();
	}

}
