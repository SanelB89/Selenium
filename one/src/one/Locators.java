package one;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Korisnik\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("rambo");
				driver.findElement(By.name("inputPassword")).sendKeys("cipiripi");
				driver.findElement(By.className("signInBtn")).click();
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jasar");
				driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jasarposleponoci@gmail.com");
				// driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("jasarponoc@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder = 'Phone Number']")).sendKeys("123456 789");
				//driver.findElement(By.cssSelector("reset-pwd-btn")).click();
				System.out.println(driver.findElement(By.cssSelector("form p")).getText());
				driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("rambo");
				driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.xpath("//input[contains(@name,'chkboxTwo')]")).click();
				driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
				Thread.sleep(1000);
				System.out.println(driver.findElement(By.tagName("p")).getText());
				Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
				Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello rambo,");
				driver.findElement(By.xpath("//button[contains(@class, 'logout-btn')]")).click();
						


	}
	

}
