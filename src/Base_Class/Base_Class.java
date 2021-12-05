package Base_Class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.MoveAction;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.http.HttpTokens.Type;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class Base_Class {

	public static WebDriver driver;
	
    public static WebDriver getbrowser(String type) {

	    if (type.equalsIgnoreCase("chromedriver")) {
						System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"Driver//Driver//chromedriver.exe");
						 driver = new ChromeDriver();		
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//gecko.exe");
			 driver = new FirefoxDriver();
		}
		 driver.manage().window().maximize(){
		 return  driver;
		
	    
	    public static void url(String url) {
		driver.get(url);
	    }
     	public static void clickOnElement(WebElement element) {
	    element.click();
	    }
	    public static void sendKeysElement(WebElement element,String value) {
		element.sendKeys(value);
	    }
	   
		
		public static void jsExecutor() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
		}
		
		
		public static void screenShot() {
			TakesScreenshot shot = (TakesScreenshot)driver;
			
		}
		public static void selectvisibletext(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}

         public static void selectByvalue(WebElement element, String value) {
	      Select s = new Select(element);
	      s.selectByVisibleText(value);
       }
         public static void selectByIndex(WebElement element, String index) {
   	      Select s = new Select(element);
   	      s.selectByVisibleText(index);
   	      
         }
         
         
         
}
