package branchWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing01 {

	@Test
	public void openFirefox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\BatchMarch2020\\jars\\chromedriver_win32\\chromedriver.exe");		
		
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
		driver.findElement(By.cssSelector("#month")).sendKeys("Dec");
		driver.findElement(By.cssSelector("#day")).sendKeys("12");
		driver.findElement(By.cssSelector("#year")).sendKeys("1971");

	}

}
