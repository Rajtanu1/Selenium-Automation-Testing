import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomepageTestCases extends BaseClass {
	
	@Test
	public void VerifyThreeArrivalImagesOnHomepage() throws InterruptedException {
		 WebElement shopLink;
		 WebElement homeBreadcrumb;
         String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString() ;
         
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 
		 Thread.sleep(2000);
	}
	
	@Test
	public void VerifyThreeSlidersOnHomepage() throws InterruptedException {
		 WebElement shopLink;
		 WebElement homeBreadcrumb;
		 WebElement nextArrow;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 nextArrow = driver.findElement(By.id("n2-ss-6-arrow-next"));
		 
		 nextArrow.click();
		 nextArrow.click();
		 nextArrow.click();
		 nextArrow.click();
		 
		 Thread.sleep(1000);
	}
	
	@Test
	public void VerifyNavigationOfArrivalImagesToProductDescriptionPage() throws InterruptedException {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString(); 
         List<WebElement> listOfArrivalImageElements;
         int totalNumberOfImageElements;
         WebElement shopLink;
         WebElement homeBreadcrumb;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 totalNumberOfImageElements = listOfArrivalImageElements.size();
		 
		 for (int i = 0; i < totalNumberOfImageElements; i++) {
		 	
		 	 listOfArrivalImageElements.get(i).click();
		 	 driver.navigate().back();
		 	 
		 	 // Re-assigning arrival image elements to avoid stale element error
		 	 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 	 totalNumberOfImageElements = listOfArrivalImageElements.size();		
		 }	
	}
	
	@Test
	public void VerifyDescriptionTabOnProductDescriptionPage() throws InterruptedException {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
		 int viewportHeight = Integer.valueOf(js.executeScript("return window.innerHeight").toString());
		 System.out.println(viewportHeight);
         List<WebElement> listOfArrivalImageElements;
         int totalNumberOfImageElements;
         WebElement shopLink;
         WebElement homeBreadcrumb;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 totalNumberOfImageElements = listOfArrivalImageElements.size();
		 
		 for (int i = 0; i < totalNumberOfImageElements; i++) {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		 	 listOfArrivalImageElements.get(i).click();
		 	 js.executeScript("window.scrollBy(0," + viewportHeight + ")");
		 	 Thread.sleep(1000);
		 	 
		 	 WebElement descriptionTab = wait.until(ExpectedConditions.elementToBeClickable(By.className("entry-title")));
		 	 descriptionTab.click();
		 	 driver.navigate().back();
		 	 
		 	 // Re-assigning arrival image elements to avoid stale element error
		 	 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 	 totalNumberOfImageElements = listOfArrivalImageElements.size();			
		 }	
	}
	
	@Test
	public void VerifyReviewTabOnProductDescripttionPage() {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString(); 
         List<WebElement> listOfArrivalImageElements;
         int totalNumberOfImageElements;
         WebElement shopLink;
         WebElement homeBreadcrumb;
         
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 totalNumberOfImageElements = listOfArrivalImageElements.size();
		 
		 for (int i = 0; i < totalNumberOfImageElements; i++) {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 	 listOfArrivalImageElements.get(i).click(); 
		 	 
		 	 WebElement reviewsTab = wait.until(ExpectedConditions.elementToBeClickable(By.className("reviews_tab")));
		 	 js.executeScript("window.scrollBy(0, 550)");
		 	 reviewsTab.click();
		 	 driver.navigate().back();
		 	 
		 	 // Re-assigning arrival image elements to avoid stale element error
		 	 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 	 totalNumberOfImageElements = listOfArrivalImageElements.size();			
		 }
	}
	
	@Test 
	public void VerifyAddToBasketButtonOnProductDescriptionPage() throws InterruptedException {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString(); 
         List<WebElement> listOfArrivalImageElements;
         int totalNumberOfImageElements;
         WebElement shopLink;
         WebElement homeBreadcrumb;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 totalNumberOfImageElements = listOfArrivalImageElements.size();
		 
		 for (int i = 0; i < totalNumberOfImageElements; i++) {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 	 WebElement addToBasketButton;
		 	 
		 	 listOfArrivalImageElements.get(i).click(); 
		 	 
		 	 addToBasketButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("single_add_to_cart_button")));
		 	 addToBasketButton.click();
		 	 			
		 	 driver.navigate().back();
		 	 driver.navigate().back();
		 	 
		 	 // Re-assigning arrival image elements to avoid stale element error
		 	 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 	 totalNumberOfImageElements = listOfArrivalImageElements.size();			
		 }		
	}
	
	@Test
	public void VerifyItemCartIconNavigationToBasket() throws InterruptedException {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString(); 
         List<WebElement> listOfArrivalImageElements;
         int totalNumberOfImageElements;
         WebElement shopLink;
         WebElement homeBreadcrumb;
         WebElement menuCartContentsOption;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 totalNumberOfImageElements = listOfArrivalImageElements.size();
		 
		 for (int i = 0; i < totalNumberOfImageElements; i++) {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 	 listOfArrivalImageElements.get(i).click(); 
		 	 
		 	 WebElement addToBasketButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("single_add_to_cart_button")));
		 	 addToBasketButton.click();
		 	 driver.navigate().back();
		 	 driver.navigate().back();
		 	 
		 	 // Re-assigning arrival image elements to avoid stale element error
		 	 listOfArrivalImageElements = driver.findElements(By.className("wp-post-image"));
		 	 totalNumberOfImageElements = listOfArrivalImageElements.size();			
		 }
		 
		 menuCartContentsOption = driver.findElement(By.className("wpmenucart-contents"));
		 menuCartContentsOption.click();		
	}
	
	@Test
	public void VerifyUseOfCouponOnItemsInBasket() throws InterruptedException {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString(); 
         WebElement shopLink;
         WebElement homeBreadcrumb;
         WebElement productOne;
         WebElement addToBasketButton;
         WebElement menuCartContentsOption;
         WebElement applyCouponButton;
         WebElement enterCouponCodeField;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 productOne = driver.findElement(By.className("wp-post-image"));
		 
		 productOne.click();
		 addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
		 addToBasketButton.click();
		 driver.navigate().back();
		 driver.navigate().back();
		 
		 menuCartContentsOption = driver.findElement(By.className("wpmenucart-contents"));
		 menuCartContentsOption.click();
		 
		 applyCouponButton = driver.findElement(By.name("apply_coupon"));
		 enterCouponCodeField = driver.findElement(By.id("coupon_code"));
		 enterCouponCodeField.sendKeys("krishnasakinala");
		 applyCouponButton.click();
	}
	
	@Test 
	public void VerfiyUseOfCouponOnItemsLessThan450InBasket() throws InterruptedException {
		 String numberOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString(); 
         List<WebElement> listOfProducts;
         int totalNumberOfProducts;
         WebElement shopLink;
         WebElement homeBreadcrumb;
         WebElement addToBasketButton;
         WebElement menuCartContents;
         WebElement applyCouponButton;
         WebElement enterCouponCodeField;
         int amount;
		 
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 js.executeScript("window.scrollBy(0," + numberOfPixelsToScrollDown + ")");
		 listOfProducts = driver.findElements(By.className("type-product"));
		 totalNumberOfProducts = listOfProducts.size();
		 
		 for (int i = 0; i < totalNumberOfProducts; i++) {	
		     amount = Integer.valueOf(listOfProducts.get(i).findElement(By.className("amount")).getText().substring(1, 4));
		     
		     if (amount <= 450) {
		 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 	 listOfProducts.get(i).click(); 
		 	 
		 	 addToBasketButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("single_add_to_cart_button")));
		 	 js.executeScript("window.scrollBy(0, 550)");
		 	 addToBasketButton.click();
		 	 driver.navigate().back();
		 	 driver.navigate().back();
		 	 
		 	 // Re-assigning products elements to avoid stale element error
		 	 listOfProducts = driver.findElements(By.className("type-product"));
		 	 totalNumberOfProducts = listOfProducts.size();
		     }
		 }
		 
		 menuCartContents = driver.findElement(By.className("wpmenucart-contents"));
		 menuCartContents.click();
		 applyCouponButton = driver.findElement(By.name("apply_coupon"));
		 enterCouponCodeField = driver.findElement(By.name("coupon_code"));
		 enterCouponCodeField.sendKeys("krishnasakinala");
		 applyCouponButton.click();
	}
	
	@Test
	public void VerifyTotalAmountInBasket() throws InterruptedException {
		 String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
	     WebElement shopLink;
		 WebElement homeBreadcrumb;
	     WebElement firstProduct;
	     WebElement addToBasketButton;
	     WebElement productCartIcon;
	     
	     js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
	     shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
	     firstProduct = driver.findElement(By.className("type-product"));
	     firstProduct.click();
	     
	     addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
	     addToBasketButton.click();
	     productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
	     productCartIcon.click();
	}
	
	@Test
	public void VerifyTotalGreaterThanSubtotalInBasket() throws InterruptedException {
		 String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
	     WebElement shopLink;
		 WebElement homeBreadcrumb;
	     WebElement firstProduct;
	     WebElement addToBasketButton;
	     WebElement productCartIcon;
	     WebElement total;
	     WebElement subtotal;
         int totalAmount;
	     int subtotalAmount;
	     
	     js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
	     shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
	     firstProduct = driver.findElement(By.className("type-product"));
	     firstProduct.click();
	     
	     addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
	     addToBasketButton.click();
	     productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
	     productCartIcon.click();
	     
	     total = driver.findElement(By.cssSelector("td[data-title='Total']"));    
	     subtotal = driver.findElement(By.cssSelector("td[data-title='Subtotal']"));
	     totalAmount = Integer.valueOf(total.findElement(By.xpath("//strong/span")).getText().substring(1, 4));
	     subtotalAmount = Integer.valueOf(subtotal.findElement(By.xpath("//span[@class='amount']")).getText().substring(1, 4));
	     
	     if (totalAmount > subtotalAmount) {
	     	System.out.println("Evaluation successful - Total is greater than subtotal.");
	     } else {
	     	System.out.println("Evaluation failed - Total is less than subtotal.");
	     }
	}
	
	@Test 
	public void VerifyQuantityUpdateInBasket() throws InterruptedException {
		  String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
          WebElement shopLink;
 	      WebElement homeBreadcrumb;
          WebElement firstProduct;
          WebElement addToBasketButton;
          WebElement productCartIcon;
          WebElement quantityInputField;
          WebElement updateBasketButton;
          
          js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
          shopLink = driver.findElement(By.linkText("Shop"));
 	      shopLink.click();
 	      homeBreadcrumb = driver.findElement(By.linkText("Home"));
 	      homeBreadcrumb.click();
          firstProduct = driver.findElement(By.className("type-product"));
          firstProduct.click();
          
          addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
          addToBasketButton.click();
          productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
          productCartIcon.click();
          quantityInputField = driver.findElement(By.className("qty"));
          quantityInputField.clear();
          quantityInputField.sendKeys("3");
          updateBasketButton = driver.findElement(By.name("update_cart"));
          updateBasketButton.click();
	}
	
	
	@Test 
	public void VerifyRemoveProductFromBasket() throws InterruptedException {
		 String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
		 WebElement firstProduct;
		 WebElement addToBasketButton;
		 WebElement productCartIcon;
		 WebElement productRemoveIcon;
		     
		 js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
		 firstProduct = driver.findElement(By.className("type-product"));
		 firstProduct.click();
		 
		 addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
		 addToBasketButton.click();
		 productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
		 productCartIcon.click();
		 productRemoveIcon = driver.findElement(By.className("remove"));
		 productRemoveIcon.click();
	}
	
	@Test
	public void VerifyPlaceOrderButtonInCheckoutPage()throws InterruptedException {
		 String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
		 WebElement shopLink;
		 WebElement homeBreadcrumb;
		 WebElement firstProduct;
	     WebElement addToBasketButton;
		 WebElement productCartIcon;
		 WebElement proceedToCheckoutButton;
		 WebElement firstNameField;
		 WebElement lastNameField;
		 WebElement companyNameField;
		 WebElement emailField;
		 WebElement phoneField;
		 WebElement addressField;
		 WebElement cityField;
		 WebElement postcodeField;
		 WebElement cashOnDeliveryRadioButton;
		 WebElement placeOrderButton;
		    
		 js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 firstProduct = driver.findElement(By.className("type-product"));
		 firstProduct.click();
		 
		 addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
		 addToBasketButton.click();
		 productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
		 productCartIcon.click();
		 proceedToCheckoutButton = driver.findElement(By.className("checkout-button"));
		 proceedToCheckoutButton.click();
		  
		 firstNameField = driver.findElement(By.id("billing_first_name"));
		 firstNameField.sendKeys("Dummy");
		 lastNameField = driver.findElement(By.id("billing_last_name"));
		 lastNameField.sendKeys("No-last-name");
		 companyNameField = driver.findElement(By.id("billing_company"));
		 companyNameField.sendKeys("None");
		 emailField = driver.findElement(By.id("billing_email"));
		 emailField.sendKeys("automationtesting@gmail.com");
		 phoneField = driver.findElement(By.id("billing_phone"));
		 phoneField.sendKeys("000000");
		 addressField = driver.findElement(By.id("billing_address_1"));
		 addressField.sendKeys("No address for you");
		 cityField = driver.findElement(By.id("billing_city"));
		 cityField.sendKeys("noCity");
		 postcodeField = driver.findElement(By.id("billing_postcode"));
		 postcodeField.sendKeys("89898");
		 cashOnDeliveryRadioButton = driver.findElement(By.id("payment_method_cod"));
		 cashOnDeliveryRadioButton.click();	 
		 placeOrderButton = driver.findElement(By.id("place_order"));
		 placeOrderButton.click();
		     
		 Thread.sleep(1000);
	}
	
	@Test
	public void VerifyEnteringOfDetailsInCheckoutPage() throws InterruptedException {
   		 String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
   	     WebElement shopLink;
   		 WebElement homeBreadcrumb;
   	     WebElement firstProduct;
   	     WebElement addToBasketButton;
   	     WebElement productCartIcon;
   	     WebElement proceedToCheckoutButton;
   	     WebElement firstNameField;
   	     WebElement lastNameField;
   	     WebElement companyNameField;
   	     WebElement emailField;
   	     WebElement phoneField;
   	     WebElement addressField;
   	     WebElement cityField;
   	     WebElement postcodeField;
   	     WebElement cashOnDeliveryRadioButton;
   	     	        
   	     js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
   	     shopLink = driver.findElement(By.linkText("Shop"));
   		 shopLink.click();
   		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
   		 homeBreadcrumb.click();
   	     firstProduct = driver.findElement(By.className("type-product"));
   	     firstProduct.click();
   	     
   	     addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
   	     addToBasketButton.click();
   	     productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
   	     productCartIcon.click();
   	     proceedToCheckoutButton = driver.findElement(By.className("checkout-button"));
   	     proceedToCheckoutButton.click();
   	     
   	     firstNameField = driver.findElement(By.id("billing_first_name"));
   	     firstNameField.sendKeys("Dummy");
   	     lastNameField = driver.findElement(By.id("billing_last_name"));
   	     lastNameField.sendKeys("No-last-name");
   	     companyNameField = driver.findElement(By.id("billing_company"));
   	     companyNameField.sendKeys("None");
   	     emailField = driver.findElement(By.id("billing_email"));
   	     emailField.sendKeys("automationtesting@gmail.com");
   	     phoneField = driver.findElement(By.id("billing_phone"));
   	     phoneField.sendKeys("000000");
   	     addressField = driver.findElement(By.id("billing_address_1"));
   	     addressField.sendKeys("No address for you");
   	     cityField = driver.findElement(By.id("billing_city"));
   	     cityField.sendKeys("noCity");
   	     postcodeField = driver.findElement(By.id("billing_postcode"));
   	     postcodeField.sendKeys("89898");
   	     cashOnDeliveryRadioButton = driver.findElement(By.id("payment_method_cod"));
   	     cashOnDeliveryRadioButton.click();	 
   	     
	     Thread.sleep(2000);
	}
	
	@Test 
	public void VerifyProceedToCheckoutButtonInBasket() throws InterruptedException {
		 String amountOfPixelsToScrollDown = js.executeScript("return window.innerHeight + window.innerHeight / 2").toString();
		 WebElement shopLink;
		 WebElement homeBreadcrumb;
		 WebElement firstProduct;
		 WebElement addToBasketButton;
		 WebElement productCartIcon;
		 WebElement proceedToCheckoutButton;
		      
		 js.executeScript("window.scrollBy(0, " + amountOfPixelsToScrollDown + ")");
		 shopLink = driver.findElement(By.linkText("Shop"));
		 shopLink.click();
		 homeBreadcrumb = driver.findElement(By.linkText("Home"));
		 homeBreadcrumb.click();
		 firstProduct = driver.findElement(By.className("type-product"));
		 firstProduct.click();
		  
		 addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
		 addToBasketButton.click();
		 productCartIcon = driver.findElement(By.className("wpmenucart-contents"));
		 productCartIcon.click();
		 proceedToCheckoutButton = driver.findElement(By.className("checkout-button"));
		 proceedToCheckoutButton.click();	    	    
	}
}
