package Mvn.DemoMavenProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;

//import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.core.ApiFuture;

import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.WriteResult;



//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class CucumberStepDefinitionTest {

	public static WebDriver driver;
	public static String p;
	Class<?> c;
	Object o;
	Method[] m;
	Field[] f;
	Field field;
	WebElement we=null;
	
	
	@Given("^I want to write a step$")
	public void i_want_to_write_a_step() throws Throwable {
		System.out.println("write a step - done");

	}
	@Given("^I want to write a tag131 step$")
	public void i_want_to_write_a_tag131_step() throws Throwable {
		System.out.println("write tag131 - done");

	}
	@Given("^I want to write a tag132 step$")
	public void i_want_to_write_a_tag132_step() throws Throwable {
		System.out.println("write tag132 - done");

	}
	
	
	@Given("^I open browser$")
	public void i_open_browser() throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream pf=new FileInputStream("C:\\Users\\ASUS\\Documents\\0_Devi\\EclipseProjects\\DemoMavenProject\\src\\PropertiesFiles\\config.properties");
		prop.load(pf);
		String bname;
		bname = prop.getProperty("browsername");
		
		//use switch case instead of if else ladder
		if(bname.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Documents\\0_Devi\\EclipseProjects\\DemoMavenProject\\src\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			//Assert.assertTrue(bname.equals("firefox"));
			
		}
		else if (bname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\0_Devi\\EclipseProjects\\DemoMavenProject\\src\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//Assert.assertTrue(bname.equals("chrome"));
		}
		else if (bname.equals("headless_chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\0_Devi\\EclipseProjects\\DemoMavenProject\\src\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions chromeoptions=new ChromeOptions();
			
			//chromeoptions.setHeadless(true);
			//chromeoptions.addArguments("--window-size=1200x600");
			
			chromeoptions.addArguments("--test-type");
			chromeoptions.addArguments("--window-size=1920,1080");
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.addArguments("--headless");
			chromeoptions.addArguments("--disable-extensions");
			
			
			HashMap<String, Object> commandParams = new HashMap<String, Object>();
            commandParams.put("cmd", "Page.setDownloadBehavior");
            commandParams.put("plugins.always_open_pdf_externally", true);
            chromeoptions.setExperimentalOption("prefs", commandParams);
            Map<String, String> params = new HashMap<String, String>();
            params.put("behavior", "allow");
            params.put("downloadPath", "C:\\Users\\dp_da\\Downloads");
            commandParams.put("params", params);
            
            ChromeDriverService driverService = ChromeDriverService.createDefaultService();
            WebDriver driver = new ChromeDriver(driverService, chromeoptions);
            
            ObjectMapper objectMapper = new ObjectMapper();
            HttpClient httpClient = HttpClientBuilder.create().build();
            String command = objectMapper.writeValueAsString(commandParams);
            //String u = driverService.getUrl().toString() + "/session/" + driver.getSessionId() + "/chromium/send_command";
            //HttpPost request = new HttpPost(u);
            //request.addHeader("content-type", "application/json");
            //request.setEntity(new StringEntity(command));
            //httpClient.execute(request);
			
			
			
		}
		
		
		System.out.println(bname + " browser window is opened");
	    
	}
	
	@Given("^I hit the (.*) application URL$")
	public void i_hit_the_application_URL(String appurl) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream pf=new FileInputStream("C:\\Users\\ASUS\\Documents\\0_Devi\\EclipseProjects\\DemoMavenProject\\src\\PropertiesFiles\\config.properties");
		prop.load(pf);
		String url;
		url = prop.getProperty(appurl);
		driver.get(url);
		System.out.println("URL: "+url);
	    
	}
	
	
	@Given("^I navigate to (.*)$")
	public String i_navigate_to_URL(String url) throws Throwable 
	{		
		driver.get(url);
		return url;
		   
	}
	
	
	@Given("^I close browser$")
	public void i_close_browser() throws IOException 
	{
		driver.quit();
		System.out.println("browser window is closed");
	    
	}
	
	@Given("^I am on (.*) Screen$")
	public String i_am_on_Page(String page)  
	{
		p=page;
		System.out.println("System is on "+p+" page");
		return p;
	    
	}
	
	
	
	
	public void initialize_class() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		o = Class.forName("Mvn.DemoMavenProject.PageFactory."+p).newInstance();
		System.out.println("Class initialized is "+p);
		
	}
	
	//***********************************Stock data methods***********************************//
	
	@Given("^I grab (.*)$")
	public void i_grab_data(String data_set) throws Exception
	{
		initialize_class();
		
		Properties prop=new Properties();
		FileInputStream pf=new FileInputStream("C:\\Users\\ASUS\\Documents\\0_Devi\\EclipseProjects\\DemoMavenProject\\src\\PropertiesFiles\\config.properties");
		prop.load(pf);
		String all_data;
		all_data = prop.getProperty(data_set);
		String[] split_array=all_data.split(",");
		
		for (int i = 0; i < split_array.length; i++)
		{
			field = o.getClass().getDeclaredField(split_array[i]);
			field.setAccessible(true);
			we=(WebElement) field.get(o);
			String grabbed_data=we.getText();
			System.out.println(split_array[i]+": "+grabbed_data);
		}

	}
	
	
	
	
	@Given("^I click on (.*) link$")
	public void i_click_on_link(String e) throws Exception
	{
		System.out.println("inside i click on link method");
		initialize_class();
		m = Class.forName("Mvn.DemoMavenProject.PageFactory."+p).getMethods();
		for (Method meth:m)
		{
			if(meth.toString().contains(e))
			{
				meth.invoke(o);
			}
		}

	}
	
	
	@Given("^I navigate into the (.*) Frame$")
	public String i_navigate_into_the_Frame(String frameid_or_framename) throws Throwable 
	{
		
		System.out.println("inside i click on i_navigate_into_the_Frame method");
		initialize_class();
		driver.switchTo().frame(driver.findElement(By.id(frameid_or_framename)));
		return frameid_or_framename;
	}

	@Given("^I come out of the frame to the main page$")
	public void I_come_out_of_the_frame_to_the_main_page() throws Throwable 
	{
		System.out.println("inside i click on I_come_out_of_the_frame_to_the_main_page method");
		initialize_class();
		driver.switchTo().defaultContent();
		
	}
	
	
	@Given("^I click on (.*) button$")
	public void i_click_on_button(String elem) throws Exception
	{
		System.out.println("inside i click on button method");
		initialize_class();
		field = o.getClass().getDeclaredField(elem);
		field.setAccessible(true);
		we=(WebElement) field.get(o);
		we.click();

	}
	
	@Given("^I click on (.*) linklink$")
	public void i_click_on_linklink(String elem) throws Exception
	{
		System.out.println("inside i click on linklink method");
		initialize_class();
		field = o.getClass().getDeclaredField(elem);
		field.setAccessible(true);
		we=(WebElement) field.get(o);
		we.click();
		
	}
	
	
	@Given("^I run all batch files in (.*) folder$")
	public void i_run_all_batch_files_in_folder(String folder) throws Throwable {
	    
		String filepath=System.getProperty("user.dir")+"\\"+folder;
		System.out.println("batch file folder: "+filepath);
		
		
		
	}
	
	
	@Given("^I select (.*) from period dropdown$")
	public void i_select_from_period_dropdown(String elem) throws Exception
	{
		System.out.println("inside i select from period dropdown method");
		initialize_class();
		field = o.getClass().getDeclaredField(elem);
		field.setAccessible(true);
		we=(WebElement) field.get(o);
		Thread.sleep(500);
		we.click();
		Thread.sleep(500);
		
	}
	
	
	@Given("^I wait for (\\d+) seconds$")
	public void i_wait_for_seconds(int second) throws InterruptedException
	{
		System.out.println("waiting for "+second+" seconds...");
		second=second*1000;
		Thread.sleep(second);
		

	}
	
	
	@Given("^I verify the confirmation message (.*) is displayed$")
	public void i_verify_the_confirmation_message_is_displayed(String confirmation_message) throws Throwable {
		
		Properties prop=new Properties();
		  if(confirmation_message.equals(prop.getProperty("vote_confirmation_message")))
		   	{ 
			  Assert.assertTrue(confirmation_message.equals(prop.getProperty("vote_confirmation_message"))); 
			  System.out.println("Pass");
			} 
		  else 
			  {
			  	Assert.fail("Failed: Confirmation message does not match"); 
			  }
		  
		  }
		
	
	
	
	
	//***********************************Web Services Step Definitions***********************************//
	
	@Given("^I verify the number of circuits in (\\d+) season is (\\d+)$")
	public void i_verify_the_number_of_circuits_in_season(int season, int numberOfRaces) throws Throwable 
	{
		//System.out.println("Season: "+ season);
		String Season=Integer.toString(season);
		
		
		
		try {
		given().
		pathParam("raceSeason",Season).
	    when().
	        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	@Given("^I extract the first circuit name for (\\d+) season$")
	public void i_extract_the_first_circuit_name_for_season(int season) throws Throwable {
		String Season=Integer.toString(season);
		String circuitName = given().
				pathParam("raceSeason",Season).
			    when().
			        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
			    then().
			        extract().
			        path("MRData.CircuitTable.Circuits.circuitId[0]");
		
		System.out.println("1st Circuit name for "+season+" season: "+circuitName);
		
		
	}
	
	@Given("^I extract the (\\d+) circuit name for (\\d+) season$")
	public void i_extract_the_circuit_name_for_season(int circuitnumber, int season) throws Throwable {
	    int ctnumber=circuitnumber-1;
	    String Season=Integer.toString(season);
		String circuitName = given().
				pathParam("raceSeason",Season).
			    when().
			        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
			    then().
			        extract().
			        path("MRData.CircuitTable.Circuits.circuitId["+ctnumber+"]");
		
		System.out.println("1st Circuit name for "+season+" season: "+circuitName);
			
	}
	
	
	@Given("^I extract the total number of circuits for (\\d+) season$")
	public void i_extract_the_total_number_of_circuits_for_season(int season) throws Throwable {

	    String Season=Integer.toString(season);
		List<String> lst_circuitNames = given().
				pathParam("raceSeason",Season).
			    when().
			        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
			    then().
			        extract().
			        path("MRData.CircuitTable.Circuits.circuitId");
		
		System.out.println("Total number of Circuits for "+season+" season: "+lst_circuitNames.size());
		for (String circuitname:lst_circuitNames)
		{
			System.out.println(circuitname);
		}
	}
	
	@Given("^I extract all values for (.*) key from (.*) api$")
	public void i_extract_all_values_for_key_key_from_api_api(String key, String api) throws Throwable {
		RestAssured.defaultParser = Parser.JSON;
		Response response = given().
				//headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                when().
                get(api).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
		String keyvalues = response.jsonPath().getString(key);
		System.out.println("keyvalues: "+keyvalues);
		String firstvalue = response.jsonPath().getString(key+"["+0+"]");
		System.out.println("firstvalue: "+firstvalue);
		
		//same thing using a list
		List<String> jsonResponse = response.jsonPath().getList(key);
		System.out.println("using list: "+jsonResponse.get(0));
		
	}

	

	
	
	//***********************************Web Services Step Definitions***********************************//
	
	@Given("^I want to write data into firestore$")
	public void i_want_to_write_data_into_firestore() throws Throwable {
		
		
		FirestoreOptions firestoreOptions =
			    FirestoreOptions.getDefaultInstance().toBuilder()
			        .setProjectId("mymapproject1-1557762909543")
			        .build();
			Firestore db = firestoreOptions.getService();
			
			
			DocumentReference docRef = db.collection("users").document("alovelace");
			// Add document data  with id "alovelace" using a hashmap
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("first", "Ada");
			data.put("last", "Lovelace");
			data.put("born", 1815);
			//asynchronously write data
			ApiFuture<WriteResult> result = docRef.set(data);
			// ...
			// result.get() blocks on response
			System.out.println("Update time : " + result.get().getUpdateTime());
		
	}
	
	
	//***********************************Appium Step Definitions***********************************//
	@Given("^I open ApiDemos app on android device$")
	public void i_open_ApiDemos_app_on_android_device() throws Throwable {
	    
		
	//***********************************Chartink Definitions***********************************//	
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
