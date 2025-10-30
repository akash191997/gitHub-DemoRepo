package com.demoProject.generic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseTest implements IAutoConstant { // BaseTest having all the constant value data from IAutoConstant
													// interface

	public static WebDriver driver; // declaring the public variable

	@BeforeClass
	public void setUp() throws IOException {

		Flib flib = new Flib();

		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if (browserValue.equalsIgnoreCase("chrome")) {

			// WebDriverManager.chromedriver().setup();    // Automatically download & manage the chromedriver executable file 

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else if (browserValue.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else {
			System.out.println("Invalid browser");
		}}

//test
	  public void CaptureScreenshot(String TcaseName) 
	  {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File trg = new File("./screenshots/"+ TcaseName+ "_" + getDateTimeString() + "./png" );
		  
			try {
				FileUtils.copyFile(src, trg);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("error");
			}
		
	  }
	  
	  public String getDateTimeString()
	  {
		Calendar cal = Calendar.getInstance();
		 SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy_HHmmss");
		 return df.format(cal.getTime());
	  }
	

//test	
	@AfterClass
   public void tearDown()
   {
	   driver.quit();
   }
   }