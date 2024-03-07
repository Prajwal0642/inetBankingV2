package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl1="https://demo.automationtesting.in/Register.html";
	public String firstName="Ram";
	public String lastName="Rahul";
	public String address=" No 154 Mysuru";
	public String mailid ="pavan123@gmail.com";
	WebDriver driver;
	public static Logger Logger;
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\inetbankingV2\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();

		Logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("src/main/java/Log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	
	
	


}
