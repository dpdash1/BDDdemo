package ChartInk;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChartInkDownloadImages {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		// Open the file
		FileInputStream fstream = new FileInputStream(System.getProperty("user.dir")+"\\daily_charts\\url_list.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strURL;
		//Read File Line By Line
		while ((strURL = br.readLine()) != null)   
			{
			  // Print the content on the console
			  System.out.println (strURL);  
			  
			  //get the url from the text file and navigate to each page to download the chart image
			  driver.get(strURL);		
			  driver.switchTo().frame(driver.findElement(By.id("ChartImage")));
			  //driver.switchTo().frame("ChartImage");
			  driver.findElement(By.id("saverbutton")).click();
			  Thread.sleep(7000);
			  driver.switchTo().defaultContent();
			  
		  
			}

		//Close the input stream
		fstream.close();
		
		driver.quit();

	}

}
