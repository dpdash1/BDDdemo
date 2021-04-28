package Mvn.DemoMavenProject.PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Mvn.DemoMavenProject.CucumberStepDefinitionTest;



public class StockPage {

	WebDriver driver=CucumberStepDefinitionTest.driver;
		//Constructor
		public StockPage()
		{
	        PageFactory.initElements(CucumberStepDefinitionTest.driver, this);
	    }		
		
		//------------------------------------------------------------------------------------------	
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/span[1]") 
		private WebElement sensex;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/span[2]") 
		private WebElement sensex_change;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/a/span[2]") 
		private WebElement nifty;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/a/span[3]") 
		private WebElement nifty_change;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/span[1]") 
		private WebElement dollar;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/span[2]") 
		private WebElement dollar_change;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[4]/span[1]") 
		private WebElement gold;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[4]/span[2]") 
		private WebElement gold_change;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[5]/span[1]") 
		private WebElement brent_crude;
		
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div[5]/span[2]") 
		private WebElement brent_crude_change;
		
		
		//------------------------------------------------------------------------------------------	
		
		//All WebElements are identified by @FindBy annotation
		@FindBy(how = How.XPATH, using = "//*[@id='sec_quotes']/div[2]/div/h1") 
		private WebElement stock_name;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_quotes']/div[2]/div/div[1]/p/ctag/span[1]") 
		private WebElement bse_stock_code;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_quotes']/div[2]/div/div[1]/p/ctag/span[2]") 
		private WebElement nse_stock_code;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_quotes']/div[2]/div/div[1]/p/span[1]") 
		private WebElement stock_isin;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_quotes']/div[2]/div/div[1]/p/span[3]/a") 
		private WebElement industry_sector;
		
		//---------------------------------------------------------------
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[1]/div/div[2]/span[1]") 
		private WebElement bse_stock_price_today;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[1]/div/div[2]/span[3]/text()") 
		private WebElement bse_price_change;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[1]/div/div[2]/span[3]/em") 
		private WebElement bse_change_percent;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[1]/div/div[3]/span[2]") 
		private WebElement bse_volume;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[1]/div/div[2]/span[1]") 
		private WebElement nse_stock_price_today;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[1]/div/div[2]/span[3]/text()") 
		private WebElement nse_price_change;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[1]/div/div[2]/span[3]/em") 
		private WebElement nse_change_percent;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[1]/div/div[3]/span[2]") 
		private WebElement nse_volume;
		
		//---------------------------------------------------------------

		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/ul/li[1]/p[2]") 
		private WebElement bse_previous_close_price;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/ul/li[2]/p[2]") 
		private WebElement bse_open_price;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/ul/li[1]/p[2]") 
		private WebElement nse_previous_close_price;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/ul/li[2]/p[2]") 
		private WebElement nse_open_price;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[2]/div/ul/li[2]/div[3]/div[1]") 
		private WebElement market_depth_buy_percent;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[2]/div/ul/li[2]/div[3]/div[3]") 
		private WebElement market_depth_sell_percent;		
		
		//---------------------------------------------------------------
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[1]/div[1]") 
		private WebElement bse_today_low;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[1]/div[3]") 
		private WebElement bse_today_high;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[2]/div[1]") 
		private WebElement bse_52_wk_low;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[2]/div[3]") 
		private WebElement bse_52_wk_high;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[3]/div[1]") 
		private WebElement bse_lower_price_band;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_bse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[3]/div[3]") 
		private WebElement bse_upper_price_band;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[1]/div[1]") 
		private WebElement nse_today_low;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[1]/div[3]") 
		private WebElement nse_today_high;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[2]/div[1]") 
		private WebElement nse_52_wk_low;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[2]/div[3]") 
		private WebElement nse_52_wk_high;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[3]/div[1]") 
		private WebElement nse_lower_price_band;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[1]/div/div[3]/div[3]") 
		private WebElement nse_upper_price_band;
		
		//---------------------------------------------------------------
		
		@FindBy(how = How.XPATH, using = "//*[@id='standalone_valuation']/ul/li[1]/ul/li[1]/div[2]") 
		private WebElement standalone_market_cap;
		
		@FindBy(how = How.XPATH, using = "//*[@id='standalone_valuation']/ul/li[1]/ul/li[2]/div[2]") 
		private WebElement standalone_pe_ratio;
		
		@FindBy(how = How.XPATH, using = "//*[@id='standalone_valuation']/ul/li[2]/ul/li[3]/div[2]") 
		private WebElement standalone_eps;
		
		@FindBy(how = How.XPATH, using = "//*[@id='standalone_valuation']/ul/li[1]/ul/li[3]/div[2]") 
		private WebElement standalone_book_value;
		
		@FindBy(how = How.XPATH, using = "//*[@id='standalone_valuation']/ul/li[3]/ul/li[1]/div[2]") 
		private WebElement standalone_price_per_book;
		
		@FindBy(how = How.XPATH, using = "//*[@id='consolidated_valuation']/ul/li[1]/ul/li[1]/div[2]") 
		private WebElement consolidated_market_cap;
		
		@FindBy(how = How.XPATH, using = "//*[@id='consolidated_valuation']/ul/li[1]/ul/li[2]/div[2]") 
		private WebElement consolidated_pe_ratio;
		
		@FindBy(how = How.XPATH, using = "//*[@id='consolidated_valuation']/ul/li[2]/ul/li[3]/div[2]") 
		private WebElement consolidated_eps;
		
		@FindBy(how = How.XPATH, using = "//*[@id='consolidated_valuation']/ul/li[1]/ul/li[3]/div[2]") 
		private WebElement consolidated_book_value;
		
		@FindBy(how = How.XPATH, using = "//*[@id='consolidated_valuation']/ul/li[3]/ul/li[1]/div[2]") 
		private WebElement consolidated_price_per_book;
		
		@FindBy(how = How.XPATH, using = "//*[@id='standalone_valuation']/ul/li[2]/ul/li[2]/div[2]") 
		private WebElement industry_pe_ratio;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_valul']/div/div/div[1]/div/ul/li[2]/a")
		private WebElement consolidated_tab;
		
		//---------------------------------------------------------------
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[2]/div/ul/li[2]/div/div[2]/div[1]/select") 
		private WebElement deliverables_dropdown_menu;
		
		@FindBy(how = How.XPATH, using = "//*[@id='div_nse_livebox_wrap']/div[1]/div[2]/div[2]/div/ul/li[2]/div/div[2]/div[2]/a") 
		private WebElement deliverables_data;
		
		//---------------------------------------------------------------
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[1]/td[2]") 
		private WebElement bse_30_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[2]/td[2]") 
		private WebElement bse_50_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[3]/td[2]") 
		private WebElement bse_150_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[4]/td[2]") 
		private WebElement bse_200_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[1]/td[3]") 
		private WebElement nse_30_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[2]/td[3]") 
		private WebElement nse_50_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[3]/td[3]") 
		private WebElement nse_150_day_sma;
		
		@FindBy(how = How.XPATH, using = "//*[@id='msa_ilnse']/table/tbody/tr[4]/td[3]") 
		private WebElement nse_200_day_sma;
		
		//---------------------------------------------------------------
		
		@FindBy(how = How.XPATH, using = "//*[@id='board_meetings']/div[1]/div/table/tbody") 
		private WebElement board_meetings;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_shrhldPat']/div/div/div[1]/div/div[1]/div/table/tbody") 
		private WebElement share_holding_pattern;
		
		@FindBy(how = How.XPATH, using = "//*[@id='sec_shrhldPat']/div/div/div[2]/div/div/div[1]/table/tbody") 
		private WebElement mutual_fund_holding;
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}