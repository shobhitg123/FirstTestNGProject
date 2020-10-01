import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailRegister {
	WebDriver driver;
	
	
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void naukrilaunch() {
		driver.get("https://www.naukri.com");
	}
	@Test
	public void notlogin() throws InterruptedException {
		driver.findElement(By.cssSelector("a#login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("shobhitgoy12@gmail.com");
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("input[class= 'err-border'][type='password']")).sendKeys("Google124");
		driver.findElement(By.cssSelector("button.btn-primary.loginButton")).click();
		boolean b1 = driver.findElement(By.cssSelector("button.btn-primary.loginButton")).isDisplayed();
		Assert.assertEquals(true, b1);
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	

}
