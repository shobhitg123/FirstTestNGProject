import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class naukrimethod {
	
	public void password(WebDriver driver, WebElement element) {
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click", element);
		
		
	}

}
