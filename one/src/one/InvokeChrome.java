package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		//driver.quit();
		

	}

}
