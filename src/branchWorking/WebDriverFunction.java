package branchWorking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFunction {
	
	
WebDriver driver;
	
	public void openURL(String url){
		System.setProperty("webdriver.chrome.driver", "C:/Users/TalentTEK/Documents/GitHub/SFW2020/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

}
