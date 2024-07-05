import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyAccountTestCases extends BaseClass {
	
	 @Test
     public void VerifyDashboardOfARegisteredUser() {
    	  WebElement myAccount;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();	 
	 }
	 
	 @Test 
	 public void VerifyOrdersOptionFromMyAccountPage() {
		  WebElement myAccount;
    	  WebElement ordersOption;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();
          
    	  ordersOption = driver.findElement(By.xpath("//a[text()='Orders']"));
    	  ordersOption.click();   	  
	 }
	 
	 @Test
	 public void VerifyViewOptionFromOrdersPage() {
		  WebElement myAccount;
    	  WebElement ordersOption;
    	  WebElement viewOption;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();
          
    	  ordersOption = driver.findElement(By.xpath("//a[text()='Orders']"));
    	  ordersOption.click();
    	  viewOption = driver.findElement(By.xpath("//a[text()='View']"));
    	  viewOption.click();
	 }
	 
	 @Test 
	 public void VerifyAddressOptionFromMyAccountPage() {
		  WebElement myAccount;
    	  WebElement addressOption;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();
          
    	  addressOption = driver.findElement(By.xpath("//a[text()='Addresses']"));
    	  addressOption.click();
	 }
	 
	 @Test 
     public void VerifyEditingOfAddressesFromAddressPage() {
		  WebElement myAccount;
    	  WebElement addressesOption;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  WebElement edit;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();
          
    	  addressesOption = driver.findElement(By.xpath("//a[text()='Addresses']"));
    	  addressesOption.click();
    	  edit = driver.findElement(By.className("edit"));
    	  edit.click();
	 }
     
	 @Test
	 public void VerifyLogoutOptionFromMyAccountPage() {
    	  WebElement myAccount;
    	  WebElement logoutOption;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();
          
    	  logoutOption = driver.findElement(By.xpath("//a[text()='Logout']"));
    	  logoutOption.click();
	 }
	 
     @Test
     public void VerifyAccountDetailsOptionFromMyAccountPage() {
    	  WebElement myAccount;
    	  WebElement accountDetailsOption;
    	  WebElement emailAddressField;
    	  WebElement passwordField;
    	  WebElement loginButton;
    	  
    	  myAccount = driver.findElement(By.id("menu-item-50"));
    	  myAccount.click();
    	  
    	  emailAddressField = driver.findElement(By.id("username"));
    	  passwordField = driver.findElement(By.id("password"));
    	  loginButton = driver.findElement(By.name("login"));
    	  emailAddressField.sendKeys("emailaddress@gmail.com");
    	  passwordField.sendKeys("emailaddress@1");
    	  loginButton.click();
          
    	  accountDetailsOption = driver.findElement(By.xpath("//a[text()='Account Details']"));
    	  accountDetailsOption.click();
     }     
}
