package Mvn.DemoMavenProject.PageFactory;

import Mvn.DemoMavenProject.CucumberStepDefinitionTest;

public class StockPageOperations {

	public static void main (String args[]) throws Exception {

		CucumberStepDefinitionTest ct=new CucumberStepDefinitionTest();
		ct.i_open_browser();
		ct.i_hit_the_application_URL("rain_industries");
		ct.i_am_on_Page("StockPage");
	
		//grab data from site
		ct.i_grab_data("stock_data_set");
		
		//ct.i_am_on_Page("StockPage");
		
		//click on consolidated tab
		//ct.i_click_on_linklink("consolidated_tab");
		
		//ct.i_am_on_Page("StockPage");
		
		//grab data from site
		//ct.i_grab_data("consolidated_valuation");
		
		
		
		
		ct.i_close_browser();
	
	
	
	
	
}

}