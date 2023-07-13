package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AmazonLogin
{
	@Given("^user Launch browser with  \"([^\"]*)\"$")
	public void user_Launch_browser_with(String arg1) throws Throwable
	{
		Object [] input1=new Object[1];
		input1[0]=arg1;
			
			SeleniumOperations.browserLaunch(input1);
	}

	@Given("^user open application  as$")
	public void user_open_application_as() throws Throwable 
	{
		SeleniumOperations.openApplication();
	}

	@When("^user navigate on sign in  button$")
	public void user_navigate_on_sign_in_button() throws Throwable 
	{
		Object [] input5=new Object[1];
		input5[0]="//*[@id='nav-link-accountList-nav-line-1']";
		Hashtable<String,Object> output4=SeleniumOperations.moveToElement(input5);
	}

	@When("^user click on sign in  button$")
	public void user_click_on_sign_in_button() throws Throwable
	{
		Object [] input6=new Object[1];
		input6[0]="(//*[text()='Sign in'])[1]";
		Hashtable<String,Object> output5=SeleniumOperations.clickOnElement(input6);	
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on sign in button$" , output5.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as  username$")
	public void user_enter_as_username(String arg1) throws Throwable 
	{
		Thread.sleep(5000);
		Object [] input7=new Object[2];
		input7[0]="//*[@id='ap_email']";
		input7[1]=arg1;	
		Hashtable<String,Object> output6=SeleniumOperations.sendKeyOnUi(input7);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$" , output6.get("MESSAGE").toString());
	}

	@When("^user click on continue  button$")
	public void user_click_on_continue_button() throws Throwable
	{
		Object [] input20=new Object[1];
		input20[0]="(//*[@id='continue'])[2]";
		Hashtable<String,Object> output20=SeleniumOperations.clickOnElement(input20);
		HTMLReportGenerator.StepDetails(output20.get("STATUS").toString(),"^user click on continue button$" , output20.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as  password$")
	public void user_enter_as_password(String arg1) throws Throwable 
	{
		Object [] input8=new Object[2];
		input8[0]="//*[@id='ap_password']";
		input8[1]=arg1;	
		Hashtable<String,Object> output7=SeleniumOperations.sendKeyOnUi(input8);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$" , output7.get("MESSAGE").toString());
	}
	
	@When("^user click on last sign in  button$")
	public void user_click_on_last_sign_in_button() throws Throwable
	{
		Object [] input9=new Object[1];
		input9[0]="//*[@id='signInSubmit']";
		Hashtable<String,Object> output8=SeleniumOperations.clickOnElement(input9);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on sign in button$" , output8.get("MESSAGE").toString());
	}

	

	@Then("^application shows Login  successfully$")
	public void application_shows_Login_successfully() throws Throwable
	{
		Object [] input19=new Object[2];
		input19[0]="Hello, Abhijeet";
		input19[1]="//*[text()='Hello, Abhijeet']";
		Hashtable<String,Object> output9=SeleniumOperations.validationByGetText(input19);	
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^application shows Login successfully$", output9.get("MESSAGE").toString());
	}


}
