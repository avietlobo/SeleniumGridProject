package AutomationFramework.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	
	
	
	
	//@Test
	public void setUp() throws MalformedURLException, InterruptedException
	{
		WebDriver driver;
		  
		  ChromeOptions options = new ChromeOptions();
		  options.setCapability("platform", Platform.WINDOWS);
		  options.setCapability("browser", "chrome");
		  
		  String hubUrl="http://192.168.1.111:35200/wd/hub";
		  
		  driver = new RemoteWebDriver(new URL(hubUrl),options);
	      driver.manage().window().maximize();
	      System.out.println("BEFORE TEST BLOCK ************");
	      driver.get("https://www.google.com");
			System.out.println("TEST BLOCK *************************");
			
	  driver.quit();
	   
	     
		
	}
	
	//@Test
	public void setUp2() throws MalformedURLException, InterruptedException
	{
	WebDriver driver;
		  
		  ChromeOptions options = new ChromeOptions();
		  options.setCapability("platform", Platform.WINDOWS);
		  options.setCapability("browser", "chrome");
		  
		  String hubUrl="http://192.168.1.111:5556/wd/hub";
		  
		  driver = new RemoteWebDriver(new URL(hubUrl),options);
	      driver.manage().window().maximize();
	      System.out.println("BEFORE TEST BLOCK ************");
	      driver.get("https://www.google.com");
			System.out.println("TEST BLOCK *************************");
			
	  driver.quit();
	   
	     
		
	}
	
	//@Test
	public void setUp3() throws MalformedURLException, InterruptedException
	{
	WebDriver driver;
		  
		  ChromeOptions options = new ChromeOptions();
		  options.setCapability("platform", Platform.WINDOWS);
		  options.setCapability("browser", "firefox");
		  
		  String hubUrl="http://192.168.1.111:5556/wd/hub";
		  
		  driver = new RemoteWebDriver(new URL(hubUrl),options);
	      driver.manage().window().maximize();
	      System.out.println("BEFORE TEST BLOCK ************");
	      driver.get("https://www.google.com");
			System.out.println("TEST BLOCK *************************");
			
	  driver.quit();
	   
	     
		
	}
	
	
	//@Test
	public void setUp4() throws MalformedURLException, InterruptedException
	{
	WebDriver driver;
		  
	
	      FirefoxOptions options =new FirefoxOptions();
	      options.setCapability("platform", Platform.WINDOWS);
	      options.setCapability("browser", "firefox");
		  
		  String hubUrl="http://192.168.1.111:12653/wd/hub";
		  
		  driver = new RemoteWebDriver(new URL(hubUrl),options);
	      driver.manage().window().maximize();
	      System.out.println("BEFORE TEST BLOCK ************");
	      driver.get("https://www.google.com");
			System.out.println("TEST BLOCK *************************");
			
	  driver.quit();
	   
	     
		
	}
	
	@Test
	public void setUp5() throws MalformedURLException, InterruptedException
	{
	WebDriver driver;
		  
	
	InternetExplorerOptions options = new InternetExplorerOptions();
	      options.setCapability("platform", Platform.WINDOWS);
	      options.setCapability("browser", options.getCapability("browser"));
	      options.setCapability("version", "11"); 
	      options.setCapability("ignoreProtectedModeSettings",1);
	      options.setCapability("nativeEvents","false");
	      options.setCapability("ignoreZoomSetting", true);
	      options.setCapability("requireWindowFocus","true");
	      options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

	      
		  
		  String hubUrl="http://192.168.1.111:12653/wd/hub";
		  
		  driver = new RemoteWebDriver(new URL(hubUrl),options);
	      driver.manage().window().maximize();
	      System.out.println("BEFORE TEST BLOCK ************");
	      driver.get("https://www.google.com");
			System.out.println("TEST BLOCK *************************");
			
	  
	  driver.quit();
	  
	     
		
	}
	
	@Test
	public void setUp6() throws MalformedURLException, InterruptedException
	{
	WebDriver driver;
		  
	
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\YESU_ROWINA\\eclipse-workspace\\new\\SeleniumGrid\\drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
    
		  
		
	      driver.manage().window().maximize();
	      System.out.println("BEFORE TEST BLOCK ************");
	      driver.get("https://www.google.com");
			System.out.println("TEST BLOCK *************************");
			
	  driver.quit();
	   
	     
		
	}
	
	
	
	
	
	
	
	//@Test
	public void launchBrowser() throws InterruptedException
	{
		
	}
	
	//@AfterTest
	public void tearDown()
	{
		//driver.quit();
		System.out.println("AFTER TEST BLOCK *****************8");
		
	}
	
	
}
