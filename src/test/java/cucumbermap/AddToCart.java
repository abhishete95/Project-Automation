package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AddToCart
{

	@When("^user click on All button$")
	public void user_click_on_All_button() throws Throwable
	{
	    Object [] input25=new Object[1];
		input25[0]="(//*[text()='All'])[2]";
		Hashtable<String,Object> output25=SeleniumOperations.clickOnElement(input25);
		HTMLReportGenerator.StepDetails(output25.get("STATUS").toString(),"^user click on All button$" , output25.get("MESSAGE").toString());
	}

	@When("^user click on Fire TV$")
	public void user_click_on_Fire_TV() throws Throwable
	{
		 Object [] input26=new Object[1];
			input26[0]="//*[text()='Fire TV']";
			Hashtable<String,Object> output26=SeleniumOperations.clickOnElement(input26);
			HTMLReportGenerator.StepDetails(output26.get("STATUS").toString(),"^user click on Fire TV$" , output26.get("MESSAGE").toString());
	}

	@When("^user click on Fire Tv Cube$")
	public void user_click_on_Fire_Tv_Cube() throws Throwable
	{
		Object [] input27=new Object[1];
		input27[0]="(//*[text()='See all Fire TV devices'])[1]";
		Hashtable<String,Object> output27=SeleniumOperations.clickOnElement(input27);
		HTMLReportGenerator.StepDetails(output27.get("STATUS").toString(),"^user click on Fire Tv Cube$" , output27.get("MESSAGE").toString());
	}
	
	@When("^user select Tv$")
	public void user_select_Tv() throws Throwable {
		Object [] input50=new Object[1];
		input50[0]="(//*[@class='a-truncate-cut'])[9]";
		Hashtable<String,Object> output50=SeleniumOperations.clickOnElement(input50);
		HTMLReportGenerator.StepDetails(output50.get("STATUS").toString(),"^user select Tv$" , output50.get("MESSAGE").toString());
	    
	}



	@When("^user click on Add to Cart button$")
	public void user_click_on_Add_to_Cart_button() throws Throwable
	{
		Object [] input28=new Object[1];
		input28[0]="//*[@id='submit.add-to-cart']";
		Hashtable<String,Object> output28=SeleniumOperations.clickOnElement(input28);
		HTMLReportGenerator.StepDetails(output28.get("STATUS").toString(),"^user click on Add to Cart button$" , output28.get("MESSAGE").toString());
	}

	
	

	@Then("^Application Shows product Add to cart successfully$")
	public void user_add_product_to_cart_successfully() throws Throwable
	{
		Object [] input29=new Object[2];
		input29[0]="Added to Cart";
		input29[1]="//*[text()='Added to Cart']";
		Hashtable<String,Object> output29=SeleniumOperations.validationByGetText(input29);	
		HTMLReportGenerator.StepDetails(output29.get("STATUS").toString(),"^application shows Login successfully$", output29.get("MESSAGE").toString());
	}


	
	
}
