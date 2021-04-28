package Mvn.DemoMavenProject.PageFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;

import com.asprise.ocr.Ocr;
import com.google.common.io.Files;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Mvn.DemoMavenProject.CucumberStepDefinitionTest;
import cucumber.api.java.en.Given;


public class ChartinkPage {

	WebDriver driver=CucumberStepDefinitionTest.driver;
	CucumberStepDefinitionTest csdt=new CucumberStepDefinitionTest();
	
	
	public ChartinkPage()
	{
        //This initElements method will create all WebElements
        PageFactory.initElements(CucumberStepDefinitionTest.driver, this);
        System.out.println("Chartink Constructor called");

    }
	
	
	
	@Given("^I hit the URLs from the (.*) text file and save the charts in daily_charts folder$")
	public void i_hit_the_URLs_from_the_text_file_and_save_the_charts_in_daily_charts_folder(String textfile) throws Throwable 
	{
		
		// Open the file
		FileInputStream fstream = new FileInputStream(System.getProperty("user.dir")+"\\daily_charts\\"+textfile+".txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
		String line;
		
		//Read File Line By Line
		while ((line = br.readLine()) != null)   
		{
		  // Print the content on the console
		  //line=br.readLine();
		  //----------------------------------------String[] arr_of_line=line.split(";");
		  
		  //----------------------------------------String strURL=arr_of_line[0];
		  //----------------------------------------String company=arr_of_line[1];
		  //----------------------------------------System.out.println ("URL: "+strURL); 
		  //----------------------------------------System.out.println ("Company Name: "+company); 
		  
		  //get the url from the text file and navigate to each page to download the chart image
		  //driver.get(strURL);
		  //----------------------------------------csdt.i_navigate_to_URL(strURL);
		  csdt.i_navigate_to_URL(line);
		  csdt.i_am_on_Page("ChartinkPage");
		  //csdt.i_select_from_period_dropdown("two_months");
		  csdt.i_navigate_into_the_Frame(frameid_or_framename);
		  csdt.i_wait_for_seconds(2);
		  csdt.i_click_on_button("saveImage");
		  csdt.i_wait_for_seconds(2);
		  
		  //capture the numbers from the chart
		  
		  csdt.I_come_out_of_the_frame_to_the_main_page();
	  
		}
		csdt.i_wait_for_seconds(7);
		//Close the input stream
		fstream.close();
		
	}
	
	
	@Given("^Delete old images from the images folder$")
	public void delete_old_images_from_the_images_folder() throws Throwable 
	{
		File dir = new File("C:\\Users\\ASUS\\Downloads\\images\\");
		FileUtils.cleanDirectory(dir); 
	}
	
	
	@Given("^Delete old images from the downloads folder$")
	public void delete_old_images_from_the_downloads_folder() throws Throwable 
	{
		File folder = new File("C:\\Users\\ASUS\\Downloads\\");
        File fList[] = folder.listFiles();
        for (File f : fList) 
        {
            if (f.getName().endsWith(".png")) 
            {
                f.delete(); 
            }
        }
	}
	
	
	
	@Given("^I extract RSI from the png files in images folder$")
	public void i_extract_RSI_from_the_png_files_in_images_folder() throws Throwable 
	{
		File dir = new File("C:\\Users\\ASUS\\Downloads\\images\\");
		FileFilter fileFilter = new WildcardFileFilter("*.png");
		File[] pngfiles = dir.listFiles(fileFilter);
		for (File pngfile:pngfiles)
		{
			File img_file_complete_name= new File(pngfile.getName());
			System.out.println("Complete File Name: "+img_file_complete_name);
			
			String company_name;
			String[] arr_complete_name=pngfile.getName().split("_");
			company_name=arr_complete_name[0];
			System.out.println("Company Name: "+ company_name);
			
			//OCR code
			Ocr.setUp();
			Ocr ocr = new Ocr();
			ocr.startEngine("eng", Ocr.SPEED_SLOW);
			
			String OCR_text=ocr.recognize(dir+"\\"+pngfile.getName(), 0, 55, 440, 153, 453, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
			System.out.println("Complete OCR text: "+ OCR_text);
			
			
			ocr.stopEngine();
					
		}
		
	}
	
	
	
	
	@Given("^Copy all newly downloaded png files into images folder$")
	public void copy_all_newly_downloaded_png_files_into_images_folder() throws Throwable 
	{
		File dest = new File("C:\\Users\\ASUS\\Downloads\\images\\");
		File dir = new File("C:\\Users\\ASUS\\Downloads\\");
		FileFilter fileFilter = new WildcardFileFilter("*.png");
		File[] pngfiles = dir.listFiles(fileFilter);
		for (File pngfile:pngfiles)
		{
			File destcopyfile= new File(dest+"\\"+pngfile.getName());
			//pngfile.renameTo(dest);
			Files.copy(pngfile, destcopyfile);
			//System.out.println(pngfile.getName());
			
		}
		
		
	}
	
	
	
	@Given("^Add all daily chart images into one (.*) pdf file$")
	public void add_all_daily_chart_images_into_one_pdf_file(String pdffilename) throws Throwable 
	{
		System.out.println("Inside i_add_all_daily_chart_images_into_one_pdf_file method");
		
		  Document document = new Document();
		  PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\ASUS\\Downloads\\"+pdffilename+"_chartlist.pdf"));
		  document.open();
		  
		  File folder = new File("C:\\Users\\ASUS\\Downloads\\images\\");
		  File[] listOfFiles = folder.listFiles();

		  for (int i = 0; i < listOfFiles.length; i++) 
		  {
		    if (listOfFiles[i].isFile()) 
		    {
		      System.out.println("File " + listOfFiles[i].getName());
		      Image img = Image.getInstance(folder+"\\"+listOfFiles[i].getName());
		      img.scaleToFit(540, 540);
		      String filename=listOfFiles[i].getName();
		      String[] arr_filename=filename.split("_");
		      String stockname=arr_filename[0];
		      document.add(new Paragraph(stockname));
			  document.add(img);
		    } 
		  }
		  

		  document.close();
		  System.out.println("Done");
		  
	}
	
	@Given("^I send a java mail$")
	public void i_send_a_java_mail() throws Throwable {

		// email ID of Recipient. 
	      String recipient = "dp.dpdash.dash@gmail.com"; 
	  
	      // email ID of  Sender. 
	      String sender = "dp.dpdash.dash@gmail.com"; 
	  
	      // using host as localhost 
	      String host = "127.0.0.1"; 
	  
	      // Getting system properties 
	      Properties properties = System.getProperties(); 
	  
	      // Setting up mail server 
	      properties.setProperty("mail.smtp.host", host); 
	  
	      // creating session object to get properties 
	      Session session = Session.getDefaultInstance(properties);
	      
	      
	      try 
	      { 
	         // MimeMessage object. 
	         MimeMessage message = new MimeMessage(session); 
	  
	         // Set From Field: adding senders email to from field. 
	         message.setFrom(new InternetAddress(sender)); 
	  
	         // Set To Field: adding recipient's email to from field. 
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 
	  
	         // Set Subject: subject of the email 
	         message.setSubject("This is Suject"); 
	  
	         // set body of the email. 
	         message.setText("This is a test mail"); 
	  
	         // Send email. 
	         Transport.send(message); 
	         System.out.println("Mail successfully sent"); 
	      } 
	      catch (MessagingException mex)  
	      { 
	         mex.printStackTrace(); 
	      }
	}
	
	//----------------------------------------------------------------------------------------	
	
	//All WebElements are identified by @FindBy annotation
	
	String frameid_or_framename="ChartImage";
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"saverbutton\"]") 
	private WebElement saveImage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[12]") 
	private WebElement one_year;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[11]") 
	private WebElement nine_months;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[10]") 
	private WebElement six_months;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[9]") 
	private WebElement four_months;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[8]") 
	private WebElement three_months;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[7]") 
	private WebElement two_months;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[6]") 
	private WebElement one_month;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[5]") 
	private WebElement ten_days;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ti\"]/option[4]") 
	private WebElement five_days;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"innerb\"]") 
	private WebElement btn_updateChart;
	
	
	
	
	
	
	
	
	
	
	
	
}
