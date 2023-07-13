package Trial;


import java.util.concurrent.TimeUnit;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{

public static void main(String[] args) throws InterruptedException
	
	{
	
	//Launch Browser
	 System.setProperty("webdriver.chrome.driver","E:\\Automation support\\chromedriver.exe");
	 
	 
      ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//Open Application	
		driver.navigate().to("https://www.flipkart.com/");
		
		
	//Cancel Login Window
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		
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
		driver.findElementByXPath("(//*[@class='_3QN6WI'])[1]").click();
		
		
		
	

	
	}
	
	
}
