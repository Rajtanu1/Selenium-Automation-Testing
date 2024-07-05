import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	FirefoxDriver driver = null;
	JavascriptExecutor js = null;
	
	// Starting the Firefox browser 
	@BeforeMethod 
	public void fetchWebsite() {
		 driver = new FirefoxDriver();
		 js = (JavascriptExecutor)driver;
		 driver.get("http://practice.automationtesting.in/");
	}
	
	// Closing the Firefox browser
	@AfterMethod 
	public void quitBrowser() {
		 driver.quit();
	}
}
