package Test_1;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base_Class.Base_Class;
    
    public class Test_Runner extends Base_Class {
    	 public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, IOException   {
		driver = getbrowser("Chrome");
        url("http://automationpractice.com/index.php");
		
	    WebElement signin= driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(signin);
		WebElement Email = driver.findElement(By.id("email"));
	    sendKeysElement(Email,"dhaniya06@gmail.com");
		WebElement Password = driver.findElement(By.id("passwd"));
	    sendKeysElement(Password, "Maha@123");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
	    clickOnElement(submit);
		WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		clickOnElement(dresses);
		Thread.sleep(3000);
		WebElement PrintedDress= driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]"));
		clickOnElement(PrintedDress);
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);
		WebElement qty = driver.findElement(By.id("quantity_wanted"));
		qty.clear();
		qty.sendKeys("5");
		WebElement size = driver.findElement(By.name("group_1"));
		Select s = new Select(size);
		s.selectByValue("2");
		Thread.sleep(3000);
		WebElement clr = driver.findElement(By.xpath("//a[@title='Pink']"));
		clickOnElement(clr);
		Thread.sleep(3000);
        WebElement smt = driver.findElement(By.name("Submit"));
        clickOnElement(smt);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement ckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        clickOnElement(ckout);
        WebElement ckout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
        clickOnElement(ckout1);
       WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
       clickOnElement(address);
       WebElement cgv = driver.findElement(By.xpath("//input[@name='cgv']"));
       clickOnElement(cgv);
       WebElement carrier = driver.findElement(By.xpath("//button[@name='processCarrier']"));
       clickOnElement(carrier);
       WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
       clickOnElement(pay);
       WebElement btn = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
       clickOnElement(btn);
       Thread.sleep(3000);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,500)");
       TakesScreenshot ts = (TakesScreenshot)driver;
       File source = ts.getScreenshotAs(OutputType.FILE);
       File destination = new File("C:\\Users\\Bala\\eclipse-workspace\\Selenium\\Screenshots\\mini.png");
       FileUtils.copyFile(source,destination);
     
       System.out.println("***************END OF THE PROJECT******************");



}
		
		}
		
		
		
			
		
		
			
		
		


		
		

		
		


