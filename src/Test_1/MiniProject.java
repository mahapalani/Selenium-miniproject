package Test_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Actions a = new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		a.moveToElement(signin).build().perform();
		a.click().build().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//h1[text()='Authentication']"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		driver.findElement(By.id("email")).sendKeys("dhaniya06@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Maha@123");
		a.click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitLogin")).click();
		WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		a.moveToElement(dresses).build().perform();
		a.click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]")).click();
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
		driver.findElement(By.xpath("//a[@title='Pink']")).click();
		Thread.sleep(3000);
        driver.findElement(By.name("Submit")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
      driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
       driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
       driver.findElement(By.xpath("//button[@name='processAddress']")).click();
       driver.findElement(By.xpath("//input[@name='cgv']")).click();
       driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
       driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
       driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       Thread.sleep(3000);
       jse.executeScript("window.scrollBy(0,500)");
       TakesScreenshot ts = (TakesScreenshot)driver;
       File source = ts.getScreenshotAs(OutputType.FILE);
       File destination = new File("C:\\Users\\Bala\\eclipse-workspace\\Selenium\\Screenshots\\mini.png");
       FileUtils.copyFile(source,destination);
       
        System.out.println("***************END OF THE PROJECT******************");
	
	}

}
