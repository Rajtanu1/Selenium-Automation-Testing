import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTestCases extends BaseClass {
     
	 @Test 
	 public void VerifyLoginWithValidEmailAndPassword() {
          WebElement myAccount;
          WebElement emailAddressField;
          WebElement passwordField;
          WebElement loginButton;
          String validEmail = "emailaddress@gmail.com";
          String validPassword = "emailaddress@1";
          
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
          
          emailAddressField = driver.findElement(By.id("username"));
          passwordField = driver.findElement(By.id("password"));
          loginButton = driver.findElement(By.name("login")); 
          
          emailAddressField.sendKeys(validEmail);
          passwordField.sendKeys(validPassword);
          loginButton.click();
	 }
	 
	 @Test
	 public void VerifyLoginWithInvalidEmailAndPassword() {
	      WebElement myAccount;
	      WebElement emailAddressField;
	      WebElement passwordField;
	      WebElement loginButton;
	      String invalidEmail = "address@gmail.com";
	      String invalidPassword = "address@1";
	      	      
	      myAccount = driver.findElement(By.id("menu-item-50"));
	      myAccount.click();
	      
	      emailAddressField = driver.findElement(By.id("username"));
	      passwordField = driver.findElement(By.id("password"));
	      loginButton = driver.findElement(By.name("login"));
	      
	      emailAddressField.sendKeys(invalidEmail);
	      passwordField.sendKeys(invalidPassword);
	      loginButton.click();
	 }
	 
	 @Test 
	 public void VerifyLoginUsingEmailAndNoPassword() {
	      WebElement myAccount;
	      WebElement emailAddressField;
	      WebElement loginButton;
	      String validEmail = "emailaddress@gmail.com";
	      	      
	      myAccount = driver.findElement(By.id("menu-item-50"));
	      myAccount.click();
	      
	      emailAddressField = driver.findElement(By.id("username"));
	      loginButton = driver.findElement(By.name("login"));
	      
	      emailAddressField.sendKeys(validEmail);
	      loginButton.click();
	 }
	 
	 @Test
	 public void VerifyLoginUsingPasswordAndNoEmail() {
	      WebElement myAccount;
	      WebElement passwordField;
	      WebElement loginButton;
	      String validPassword = "emailaddress@1";
	      	      
	      myAccount = driver.findElement(By.id("menu-item-50"));
	      myAccount.click();
	      
	      passwordField = driver.findElement(By.id("password"));
	      loginButton = driver.findElement(By.name("login"));
	      
	      passwordField.sendKeys(validPassword);
	      loginButton.click();
	 }
	 
	 @Test 
	 public void VerifyLoginWithoutEmailAndPassword() {
          WebElement myAccount;
          WebElement loginButton;
                  
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
     
          loginButton = driver.findElement(By.name("login"));
          loginButton.click();
	 }
	 
	 @Test
	 public void VerifyCaseSensitivityInLoginDetails() {
	      WebElement myAccount;
	      WebElement emailAddressField;
	      WebElement passwordField;
	      WebElement loginButton;
	      String validEmail = "EMAILADDRESS@gmail.com";
	      String validPassword = "EMAILADDRESS@1";
	      	      
	      myAccount = driver.findElement(By.id("menu-item-50"));
	      myAccount.click();
	      
	      emailAddressField = driver.findElement(By.id("username"));
	      passwordField = driver.findElement(By.id("password"));
	      loginButton = driver.findElement(By.name("login"));
	      
	      emailAddressField.sendKeys(validEmail);
	      passwordField.sendKeys(validPassword);
	      loginButton.click();
	 }
	 
	 @Test 
	 public void VerifyEnteredPasswordIsHidden() {
	      WebElement myAccount;
	      WebElement emailAddressField;
	      WebElement passwordField;
	      String validEmail = "emailaddress@gmail.com";
	      String validPassword = "emailaddress@1";
	      	      
	      myAccount = driver.findElement(By.id("menu-item-50"));
	      myAccount.click();
	      
	      emailAddressField = driver.findElement(By.id("username"));
	      passwordField = driver.findElement(By.id("password"));
	      
	      emailAddressField.sendKeys(validEmail);
	      passwordField.sendKeys(validPassword);
	 }
	 
	 @Test 
	 public void VerifyLogoutFromUserAccoun() {
	      WebElement myAccount;
	      WebElement emailAddressField;
	      WebElement passwordField;
	      WebElement loginButton;
	      WebElement logoutButton;
	      String validEmail = "emailaddress@gmail.com";
	      String validPassword = "emailaddress@1";
	      
	      myAccount = driver.findElement(By.id("menu-item-50"));
	      myAccount.click();
	      
	      emailAddressField = driver.findElement(By.id("username"));
	      passwordField = driver.findElement(By.id("password"));
	      loginButton = driver.findElement(By.name("login"));
	      
	      emailAddressField.sendKeys(validEmail);
	      passwordField.sendKeys(validPassword);
	      loginButton.click();
	      
	      logoutButton = driver.findElement(By.linkText("Logout"));
	      logoutButton.click();
	      driver.navigate().back();
	 }
}
