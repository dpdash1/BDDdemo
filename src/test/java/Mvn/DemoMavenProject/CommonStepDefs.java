package Mvn.DemoMavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import pagefactory.WebShopHomePage;



public class CommonStepDefs {
	
	public static WebDriver driver;
	Properties prop;
	Class<?> c;
	Method[] m;
	Object o;
	String p;
	Field[] f;
	
public CommonStepDefs() throws IOException
	{
		prop=new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\setup.properties");
		prop.load(ip);
	}

	
	public void I_Open_Browser() throws IOException
	{
		System.out.println("Inside I_Open_Browser method");
		if (GetBrowserName().equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Root\\pomproject\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (GetBrowserName().equals("chrome"))
		{
			driver = new FirefoxDriver();
		}
	}
	
	public void I_Close_Browser()
	{
		System.out.println("Inside I_Close_Browser method");
		driver.quit();
	}
	
	public void I_Hit_URL() throws IOException
	{
		System.out.println("Inside I_Hit_URL method");
		driver.get(GetURL());	
	}
	
	
	public String GetURL() throws IOException
	{
		System.out.println("Inside GetURL method");
		Properties prop=this.prop;
		String url=prop.getProperty("URL");
		System.out.println(url);
		return url;
	}
	
	public String GetBrowserName() throws IOException
	{
		System.out.println("Inside GetBrowserName method");
		Properties prop=this.prop;
		String browser=prop.getProperty("Browser");
		System.out.println(browser);
		return browser;
		
	}
	
	public void I_Click_On_Link(String e) throws Throwable
	{
		System.out.println("Inside I_Click_On_Link method");
		//I_Am_On_Page(p);
		o = Class.forName("pagefactory."+p).newInstance();
		System.out.println(o);
		m = Class.forName("pagefactory."+p).getMethods();
		System.out.println(m[0]);
		m[0].invoke(o);

		
			
	}
	
	public void I_Wait_For_Seconds(int milliseconds) throws Throwable
	{
		System.out.println("Inside I_Wait_For_Seconds method");
		int seconds=milliseconds*1000;
		Thread.sleep(seconds);
		
			
	}
	
	public String I_Am_On_Page(String page) throws Throwable
	{	
		System.out.println("Inside I_Am_On_Page method");
		p=page;
		System.out.println("System is on "+p);
		//c = Class.forName("pagefactory."+p);
		//o=c.newInstance();
		//System.out.println("newInstance method executed");
		//c = Class.forName("pagefactory."+p).getConstructor(WebDriver.class);
		//o = c.newInstance(driver);
		
		//o = Class.forName("pagefactory."+p).newInstance();
		//System.out.println(o);
		//m = Class.forName("pagefactory."+p).getMethods();
		//System.out.println(m[0]);
		//m[0].invoke(o);
		//f=Class.forName("pagefactory."+p).getFields();
		//System.out.println(f);
		return p;
	
	}
	
	
	
}
