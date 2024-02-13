package seleniumPracticeJavaPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotificationPopupHandling {

	public static void main(String[] args) throws Exception {

		// Setting system properties for chrome driver
		String emailId_Xpath = "//input[@id='email']";
		String emailId = "samevishn@gmail.com";
		String password_Xpath = "//input[@id='pass']";
		String password = "welcome2CA";
		String loginBtn = "//button[@name='login']";
		

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(emailId_Xpath)).clear();
		driver.findElement(By.xpath(emailId_Xpath)).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.xpath(password_Xpath)).clear();
		driver.findElement(By.xpath(password_Xpath)).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loginBtn)).click();


		Thread.sleep(5000);
		driver.close();

	}
}
