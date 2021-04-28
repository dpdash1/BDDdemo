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

public class WebShopBooksPage {

	WebDriver driver=CucumberStepDefinitionTest.driver;
	CucumberStepDefinitionTest csdt=new CucumberStepDefinitionTest();
		//Constructor
		public WebShopBooksPage()
		{
	        //This initElements method will create all WebElements
	        PageFactory.initElements(CucumberStepDefinitionTest.driver, this);
	        System.out.println("WebShopHomePage Constructor called");

	    }
		
	//----------------------------------------------------------------------------------------	
		//All WebElements are identified by @FindBy annotation
		@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/a") 
		private WebElement under25;
		
	
	
}
