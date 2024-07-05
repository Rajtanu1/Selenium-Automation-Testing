import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserRegistrationTestCases extends BaseClass {
	
     @Test
     public void VerifyRegistrationWithValidEmailAndPassword() throws InterruptedException {
    	  WebElement myAccount;
          WebElement emailAddressField;
          WebElement passwordField;
          WebElement registerButton;
          String email = "dummyemail@gmail.com";
          String password = "dummypassword@1";
          
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
          
          emailAddressField = driver.findElement(By.id("reg_email"));
          passwordField = driver.findElement(By.id("reg_password"));
          registerButton = driver.findElement(By.name("register"));
          
          emailAddressField.sendKeys(email);
          passwordField.sendKeys(password);
          registerButton.click();
          
          Thread.sleep(1000);
     }
     
     @Test
     public void VerifyRegistrationWithoutEmailAndPassword() throws InterruptedException {
    	  WebElement myAccount;
          WebElement registerButton;
          
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
          registerButton = driver.findElement(By.name("register"));
          registerButton.click();
          
          Thread.sleep(1000);
     }
     
     @Test 
     public void VerifyRegistrationWithInvalidEmail() throws InterruptedException {
    	  WebElement myAccount;
          WebElement emailAddressField;
          WebElement passwordField;
          WebElement registerButton;
          String email = "dummyemailgmail.com";
          String password = "dummypassword@1";
          
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
          
          emailAddressField = driver.findElement(By.id("reg_email"));
          passwordField = driver.findElement(By.id("reg_password"));
          registerButton = driver.findElement(By.name("register"));
          
          emailAddressField.sendKeys(email);
          passwordField.sendKeys(password);
          registerButton.click();
          
          Thread.sleep(1000);
     }
     
     @Test 
     public void VerifyRegistrationUsingPasswordAndNoEmail() throws InterruptedException {
    	  WebElement myAccount;
          WebElement passwordField;
          WebElement registerButton;
          String password = "dummypassword@1";
          
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
          
          passwordField = driver.findElement(By.id("reg_password"));
          registerButton = driver.findElement(By.name("register"));
          
          passwordField.sendKeys(password);
          registerButton.click();   
          
          Thread.sleep(1000);
     }
     
     @Test
     public void VerifyRegistrationUsingEmailAndNoPassword() throws InterruptedException {
    	  WebElement myAccount;
          WebElement emailAddressField;
          WebElement registerButton;
          String email = "dummyemail@gmail.com";
          
          myAccount = driver.findElement(By.id("menu-item-50"));
          myAccount.click();
          
          emailAddressField = driver.findElement(By.id("reg_email"));
          registerButton = driver.findElement(By.name("register"));
          emailAddressField.sendKeys(email);
          registerButton.click();
          
          Thread.sleep(1000);
     }
}
