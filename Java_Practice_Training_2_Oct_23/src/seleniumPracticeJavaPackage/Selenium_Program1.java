package seleniumPracticeJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String Url = "https://mail.google.com";
		
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String browserTitle = driver.getTitle();
		System.out.println("Current browser title is: " + browserTitle);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
