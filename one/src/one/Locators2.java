package one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Locators2 rambo3 = new Locators2();
		String name = "rambo2";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = rambo3.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type = 'submit')]")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + name + ",");
		driver.findElement(By.xpath("//button[contains(@class, 'logout-btn')]")).click();
		driver.close();
	}
		
		
		
		public String getPassword(WebDriver driver) throws InterruptedException {
			
			driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
			String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
			String [] passwordArray = passwordText.split("'");
			String [] passwordArray2 = passwordArray[1].split("'");
			String password = passwordArray[1].split("'")[0];
			return password;
					
			
		}
	
	}


