package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil
{

	public static void drawBoarder(WebElement element, WebDriver driver) throws IOException
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("arguments[0].style.border='3px solid red'", element);
	}
		
	public static String getTitleByJs(WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
	    String title = st.executeScript("return document.title;").toString();
		return title;
	}
		
	public static void clickElementByJs(WebElement element, WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("arguments[0].click();", element );
	}
	
	public static void alertMassege(WebDriver driver, String message)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("alert('" + message + "')" );
	}
	
	public static void refreshByJs(WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("history.go(0)");
		
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollPageUp(WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
	public static void zoomPageByJs(WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("document.body.style.zoom='200%'");
		
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
	    String bgcolor=element.getCssValue("backgroundColor");
	     for(int i=0; i<100; i++)
	    {
	    	changeColor("#000000", element, driver);
	    	changeColor(bgcolor, element, driver);
	   }
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) 
	{
		JavascriptExecutor st=(JavascriptExecutor)driver;
		st.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		
		try
		{
			Thread.sleep(20);
		}
		catch (InterruptedException e)
		{
			
		}
		
		
	}
	
	
	}	
	

