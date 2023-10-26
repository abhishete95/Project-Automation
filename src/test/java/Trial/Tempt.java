package Trial;


import java.awt.KeyEventPostProcessor;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.FileBackedOutputStream;

import utility.JavaScriptUtil;

public class Tempt
{

public static void main(String[] args) throws IOException, InterruptedException 
	
	{
	
	//Launch Browser
	 System.setProperty("webdriver.chrome.driver","F:\\Automation support\\chromedriver.exe");
	 
	 
      WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//Open Application	
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(10000);
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File trg=ts.getScreenshotAs(OutputType.FILE);
		File src=new File("F:\\ScreenShot\\amazon1.jpg");
		FileUtils.copyFile(trg, src);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement ele=	driver.findElement(By.xpath("//div[@id='desktop-grid-3']"));
	File tr=ele.getScreenshotAs(OutputType.FILE);
	File sr=new File("F:\\ScreenShot\\computer.jpg");
	FileUtils.copyFile(tr, sr);
		
		
	//Draw Border
		//WebElement logo=driver.findElement(By.xpath("//*[@id='nav-logo-sprites']"));
		//JavaScriptUtil.drawBoarder(logo, driver);
		
		
		/*TakesScreenshot sc=(TakesScreenshot) driver;
		File trg=	sc.getScreenshotAs(OutputType.FILE);
		File src=new File("F:\\ScreenShot\\Border.jpg");
		FileUtils.copyFile(trg, src);*/
		
		
		
		//Get Title by JavaScript
		//String title=JavaScriptUtil.getTitleByJs(driver);
		//System.out.println(title);
		
	// ClickOnElementByJS
	//WebElement sn=driver.findElement(By.xpath("//*[@id='nav-orders']"));
	//JavaScriptUtil.clickElementByJs(sn, driver);
	
		
	//AlertMessageByJS
	//JavaScriptUtil.alertMassege(driver, "This is my Alert....");
		
	//RefreshByJS	
	//JavaScriptUtil.refreshByJs(driver);
		
	//ScrollPageDownByJS
	//JavaScriptUtil.scrollPageDown(driver);
	
	//Thread.sleep(10000);
	
	//ScrollPageUpByJS
	//JavaScriptUtil.scrollPageUp(driver);
	
	//ZoomPageByJS
	//JavaScriptUtil.zoomPageByJs(driver);
	
	//FlashElementByJs
	//WebElement logo=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	//JavaScriptUtil.flash(logo, driver);
		
		
	/*TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("F:\\ScreenShot\\amazon.png");
	FileUtils.copyFile(src, trg);*/
		
	/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement section=driver.findElement(By.xpath("//span[normalize-space()='Frequently repurchased in Drugstore']/../../..//ul[@role='list']"));
	File src=section.getScreenshotAs(OutputType.FILE);
	File trg=new File("F:\\ScreenShot\\section5.png");
	FileUtils.copyFile(src, trg);*/
		
		
		
	//Cancel Login Window
		/*driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		
	//Click on My Prfile
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElementByXPath("//*[@class='_1_3w1N']")).build().perform();
		
		driver.findElementByXPath("//*[text()='My Profile']").click();
		
	//Enter Username
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9595952980");
		
	//Enter Password
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("Abhi@3151995");
		
	//Click on Login Button	
		driver.findElementByXPath("(//*[text()='Login'])[3]").click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElementByXPath("//*[text()='Electronics']")).build().perform();
		driver.findElementByXPath("(//*[@class='_3QN6WI'])[1]").click(); */
		
		
		
	

	
	}
	
	
}
