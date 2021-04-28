package Mvn.DemoMavenProject.PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Mvn.DemoMavenProject.CucumberStepDefinitionTest;
import cucumber.api.java.en.Given;

public class WebShopHomePage {
	
	WebDriver driver=CucumberStepDefinitionTest.driver;
	CucumberStepDefinitionTest csdt=new CucumberStepDefinitionTest();
		//Constructor
		public WebShopHomePage()
		{
	        //This initElements method will create all WebElements
	        PageFactory.initElements(CucumberStepDefinitionTest.driver, this);
	        System.out.println("WebShopHomePage Constructor called");

	    }
		
	//----------------------------------------------------------------------------------------	
		
		public void I_Click_On_Link_siteMap() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_siteMap method");
			siteMap.click();
				
		}
		public void I_Click_On_Link_shippingAndReturns() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_shippingAndReturns method");
			shippingAndReturns.click();
				
		}
		public void I_Click_On_Link_privacyNotice() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_privacyNotice method");
			privacyNotice.click();
				
		}
		public void I_Click_On_Link_conditionsOfUse() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_conditionsOfUse method");
			conditionsOfUse.click();
				
		}
		public void I_Click_On_Link_aboutUs() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_aboutUs method");
			aboutUs.click();
				
		}
		public void I_Click_On_Link_contactUs() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_contactUs method");
			contactUs.click();
				
		}
		public void I_Click_On_Link_search() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_search method");
			search.click();
				
		}
		public void I_Click_On_Link_news() throws Throwable
		{
			System.out.println("Inside I_Click_On_Link_news method");
			news.click();
				
		}
		
	//------------------------------------------------------------------------------------------
		
		@Given("^I select (.*) option and click on Vote button$")
		public void i_select_radio_option_and_click_on_Vote_button(String option) throws Throwable {
		    
			List<WebElement> li_options=driver.findElement(By.xpath("//*[@id='poll-block-1']/ul")).findElements(By.tagName("li"));
			System.out.println("no_of_answers: "+li_options.size());
			for (int i=1;i<=li_options.size();i++)
			{
				if(driver.findElement(By.xpath("//*[@id='poll-block-1']/ul/li["+i+"]/label")).getText().equals(option))
						{
							driver.findElement(By.xpath("//*[@id='pollanswers-"+i+"']")).click();
						}
			}
			vote.click();
		    
		}
		
		@Given("^I click on all the footer links$")
		public void i_click_on_all_the_footer_links() throws Throwable {

			siteMap.click();
			shippingAndReturns.click();
			privacyNotice.click();
			conditionsOfUse.click();
			aboutUs.click();
			contactUs.click();
			search.click();
			news.click();
		}
		
		@Given("^I click on all the footer links with common method$")
		public void i_click_on_all_the_footer_links_with_common_method() throws Throwable {
			System.out.println("inside I click on all the footer links with common method");
			csdt.i_click_on_linklink("siteMap");
			csdt.i_click_on_linklink("shippingAndReturns");
			
			
		}
	
		
	//------------------------------------------------------------------------------------------	
		
		
		//All WebElements are identified by @FindBy annotation
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sitemap") 
		private WebElement siteMap;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Shipping & Returns") 
		private WebElement shippingAndReturns;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Privacy Notice") 
		private WebElement privacyNotice;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Conditions of Use") 
		private WebElement conditionsOfUse;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "About us") 
		private WebElement aboutUs;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Contact us") 
		private WebElement contactUs;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Search") 
		private WebElement search;
		
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "News") 
		private WebElement news;
		
		@FindBy(how = How.ID, using = "vote-poll-1") 
		private WebElement vote;
	
		@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a") 
		private WebElement BOOKS;
	

}
