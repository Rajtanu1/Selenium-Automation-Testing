import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ShopPageTestCases extends BaseClass {
	 // Helper methods for "VerifyFilterOfProductsWithin150to250PriceRange" method
	 public static int findPercentage(float amount, int percent) {
		 return Math.round(amount) * percent / 100;
	 }
	
	 public static float extractNumberFromAlphanumericString(String string) {
		 return Float.valueOf(string.substring(0, string.length() - 2));
	 }
	
     @Test
     public void VerifyAndroidOptionInProductCategories() throws InterruptedException {
    	  WebElement shop;
    	  WebElement androidOption;
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          androidOption = driver.findElement(By.linkText("Android"));
          androidOption.click();
          
          Thread.sleep(1000);
     }
     
     @Test
     public void VerifyUpdateInPriceOfAProductOnSale() throws InterruptedException {
    	  WebElement shop;
    	  WebElement productOnSale;
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          productOnSale = driver.findElement(By.cssSelector("img[src='https://practice.automationtesting.in/wp-content/uploads/2017/01/Android-Quick-Start-Guide-300x300.png']"));
          productOnSale.click();
          
          Thread.sleep(1000);
     }
     
     @Test
     public void VerifyFilterOfProductsWithin150to250PriceRange() throws InterruptedException {
          Actions action = new Actions(driver);
          float numberOfPixelsToScrollDown = Float.valueOf(String.valueOf(js.executeScript("return window.innerHeight + window.innerHeight / 2")));
          
          WebElement shop;
          WebElement sliderHandle;
          WebElement filterButton;
          float pixelValue;
          int offsetValue;
          String widthOfPriceRangeSliderInPixels;
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          
          widthOfPriceRangeSliderInPixels = String.valueOf((js.executeScript("return getComputedStyle(document.querySelector('.ui-slider-range')).width")));
          pixelValue = extractNumberFromAlphanumericString(widthOfPriceRangeSliderInPixels);
          offsetValue = findPercentage(pixelValue, 14);
          sliderHandle = driver.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[2]"));
          filterButton = driver.findElement(By.xpath("//button[text()='Filter']"));
          
          action.moveToElement(sliderHandle).clickAndHold(sliderHandle).moveByOffset(-offsetValue, 0).release().perform();
          filterButton.click();
          js.executeScript("window.scrollBy(0," + Math.round((numberOfPixelsToScrollDown / 2)) + ")");
          
          Thread.sleep(1000);
     }
     
     @Test 
     public void VerifySortByAverageRatingsFromDropdown() throws InterruptedException {
    	  Select select;
    	  WebElement shop;
    	  WebElement defaultSortingDropdown;
    	  float numberOfPixelsToScrollDown = Float.valueOf(String.valueOf(js.executeScript("return window.innerHeight + window.innerHeight / 2")));
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          
          defaultSortingDropdown = driver.findElement(By.name("orderby"));
          select = new Select(defaultSortingDropdown);
          select.selectByValue("rating");
          
          js.executeScript("window.scrollBy(0," + Math.round((numberOfPixelsToScrollDown / 2)) + ")");
          
          Thread.sleep(1000);
     } 
     
     @Test
     public void VerifySortByHighToLowPriceFromDropdown() throws InterruptedException {
    	  Select select;
    	  WebElement shop;
    	  WebElement defaultSortingDropdown;
    	  float numberOfPixelsToScrollDown = Float.valueOf(String.valueOf(js.executeScript("return window.innerHeight + window.innerHeight / 2")));
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          
          defaultSortingDropdown = driver.findElement(By.name("orderby"));
          select = new Select(defaultSortingDropdown);
          select.selectByValue("price-desc");
          
          js.executeScript("window.scrollBy(0," + Math.round((numberOfPixelsToScrollDown / 2)) + ")");
          
          Thread.sleep(1000);
     }
     
     @Test
     public void VerifySortByLowToHighPriceFromDropdown() throws InterruptedException {
    	  Select select;
    	  WebElement shop;
    	  WebElement defaultSortingDropdown;
    	  float numberOfPixelsToScrollDown = Float.valueOf(String.valueOf(js.executeScript("return window.innerHeight + window.innerHeight / 2")));
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          
          defaultSortingDropdown = driver.findElement(By.name("orderby"));
          select = new Select(defaultSortingDropdown);
          select.selectByValue("price");
          
          js.executeScript("window.scrollBy(0," + Math.round((numberOfPixelsToScrollDown / 2)) + ")");
          
          Thread.sleep(1000);
     }
     
     @Test
     public void VerifySortByNewnessRatingFromDropdown() throws InterruptedException {
    	 Select select;
    	 WebElement shop;
    	 WebElement defaultSortingDropdown;
    	 float numberOfPixelsToScrollDown = Float.valueOf(String.valueOf(js.executeScript("return window.innerHeight + window.innerHeight / 2")));
         
         shop = driver.findElement(By.id("menu-item-40"));
         shop.click();
         
         defaultSortingDropdown = driver.findElement(By.name("orderby"));
         select = new Select(defaultSortingDropdown);
         select.selectByValue("date");
         
         js.executeScript("window.scrollBy(0," + Math.round((numberOfPixelsToScrollDown / 2)) + ")");
         
         Thread.sleep(1000);
     }
     
     @Test
     public void VerifySortByPopularityFromDropdown() throws InterruptedException {
    	  Select select;
    	  WebElement shop;
    	  WebElement defaultSortingDropdown;
    	  float numberOfPixelsToScrollDown = Float.valueOf(String.valueOf(js.executeScript("return window.innerHeight + window.innerHeight / 2")));
          
          shop = driver.findElement(By.id("menu-item-40"));
          shop.click();
          
          defaultSortingDropdown = driver.findElement(By.name("orderby"));
          select = new Select(defaultSortingDropdown);
          select.selectByValue("popularity");
          
          js.executeScript("window.scrollBy(0," + Math.round((numberOfPixelsToScrollDown / 2)) + ")");
          
          Thread.sleep(1000);
     }
}

