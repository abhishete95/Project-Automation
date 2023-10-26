package utility;

import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;



public class SeleniumOperations 


{
	public static ConfigReader config;
	public static ChromeDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	
	{
		
try
{
	String strbrwsr=(String)inputParameters[0];
	 config=new ConfigReader();

	 System.setProperty(strbrwsr,config.getDriverPathChrome());
	
	 
	 driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
 //driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

outputParameters.put("STATUS", "PASS");
outputParameters.put("MESSAGE", "methoduse: browserLaunch,Input Given: " +inputParameters[0].toString());

}
catch(Exception e)
{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methoduse: browserLaunch,Input Given: " +inputParameters[0].toString());
	
}
return outputParameters;
}
	
	
	
	
public static Hashtable<String,Object> openApplication()
	
	{
	try
	{

		driver.get(config.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methoduse: openApplication,Input Given: " +config.getApplicationUrl().toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methoduse: openApplication,Input Given: " +config.getApplicationUrl().toString());
	}
	
	return outputParameters;
	
	}




public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)

{
try
{
	String value=(String)inputParameters[0];
	driver.findElementByXPath(value).click();
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methoduse: clickOnElement,Input Given: " +inputParameters[0].toString());
}
catch(Exception e)
{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methoduse: clickOnElement,Input Given: " +inputParameters[0].toString());
}
return outputParameters;
}



public static Hashtable<String,Object> moveToElement(Object[]inputParameters)

{
	try
	{
	String path=(String)inputParameters[0];
	
	Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElementByXPath(path)).build().perform();
	
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methoduse: moveToElement,Input Given: " +inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methoduse: moveToElement,Input Given: " +inputParameters[0].toString());
	}
	return outputParameters;
}



public static Hashtable<String,Object> sendKeyOnUi(Object[]inputParameters) 

{
	try
	{
	String path=(String)inputParameters[0];
	String text=(String)inputParameters[1];
	driver.findElementByXPath(path).sendKeys(text);
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methoduse: sendKeyOnUi,Input Given: " +inputParameters[1].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methoduse: sendKeyOnUi,Input Given: " +inputParameters[1].toString());
	}
	return outputParameters;
}

public static Hashtable<String,Object> validationByGetText(Object[]inputParameters) 

{
	try
	{
	String GivenText=(String)inputParameters[0];
	String locator=(String)inputParameters[1];
	String capturedText=driver.findElementByXPath(locator).getText();
	
	if(GivenText.equalsIgnoreCase(capturedText))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methoduse: validationByGetText,Input Given: " +inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methoduse: validationByGetText,Input Given: " +inputParameters[0].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> switchTab(Object[]inputParameters)

{
	try
	{
	String path=(String)inputParameters[0];
	
	Set<String> ids= driver.getWindowHandles();
	Iterator<String> itr=ids.iterator();	
	itr.next();
	String two= itr.next();
	driver.switchTo().window(two);
	
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methoduse: switchTab,Input Given: " +inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methoduse: switchTab,Input Given: " +inputParameters[0].toString());
	}
	return outputParameters;
}


public static Hashtable<String,Object> takeScreenShot(Object[]inputParameters) 

{
	try
	{
	String path=(String)inputParameters[0];
	TakesScreenshot sc=driver;
	File trg=sc.getScreenshotAs(OutputType.FILE);
	File src=new File(".//Screenshot//photo.png");
	FileUtils.copyFile(src, trg);
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methoduse: takeScreenShot,Input Given: " +inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methoduse: sendKeyOnUi,Input Given: " +inputParameters[1].toString());
	}
	return outputParameters;
}

	
	/* public static void main(String[] args) throws InterruptedException
	{
		Object [] input1=new Object[2];
	input1[0]="webdriver.chrome.driver";
	input1[1]="D:\\Automation support\\chromedriver.exe";	
		SeleniumOperations.browserLaunch(input1);
		
		Object [] input2=new Object[1];
		input2[0]="https://www.flipkart.com/";
		SeleniumOperations.openApplication(input2);
		
		Object [] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input3);
	
	
		Object [] input5=new Object[1];
		input5[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.moveToElement(input5);
	
		Object [] input6=new Object[1];
		input6[0]="//*[text()='My Profile']";
		SeleniumOperations.clickOnElement(input6);
	
		Thread.sleep(5000);
		Object [] input7=new Object[2];
		input7[0]="//*[@class='_2IX_2- VJZDxU']";
		input7[1]="9595952980";	
		SeleniumOperations.sendKeyOnUi(input7);
		
		
		Object [] input8=new Object[2];
		input8[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input8[1]="Abhi@3151995";	
		SeleniumOperations.sendKeyOnUi(input8);
		
		Object [] input9=new Object[1];
		input9[0]="(//*[text()='Login'])[3]";
		SeleniumOperations.clickOnElement(input9);
		
	Thread.sleep(5000);
		Object [] input10=new Object[1];
		input10[0]="(//*[@class='NS64GK'])[1]";
		SeleniumOperations.clickOnElement(input10);
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Object [] input11=new Object[1];
		input11[0]="//*[@class='_1QhEVk']";
		SeleniumOperations.clickOnElement(input11);
		
		Object [] input12=new Object[2];
		input12[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input12[1]="Abhi shete";	
		SeleniumOperations.sendKeyOnUi(input12);
		
		Object [] input13=new Object[2];
		input13[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input13[1]="8329046687";	
		SeleniumOperations.sendKeyOnUi(input13);
	
		Object [] input14=new Object[2];
		input14[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
		input14[1]="414001";	
		SeleniumOperations.sendKeyOnUi(input14);
	
		Object [] input15=new Object[2];
		input15[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input15[1]="Delhigate";	
		SeleniumOperations.sendKeyOnUi(input15);
	
		Object [] input16=new Object[2];
		input16[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input16[1]="Bagroja Hadko";	
		SeleniumOperations.sendKeyOnUi(input16);
		
		Object [] input17=new Object[1];
		input17[0]="(//*[text()='Home'])[1]";
		SeleniumOperations.clickOnElement(input17);
		
		
		Object [] input18=new Object[1];
		input18[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
		SeleniumOperations.clickOnElement(input18);
	
		
		
		
		
		
	}*/
		
}
