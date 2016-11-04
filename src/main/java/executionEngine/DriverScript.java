package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Step 1 – Open a Browser
Step 2 – Navigate to URL
Step 3 – Click on My Account button
Step 4 – Enter Username
Step 5 – Enter Password
Step 6 – Click on LogIn button
Step 7 – Click on LogOut button
Step 8 – Close the Browser
*/


public class DriverScript  {

	
	  private static WebDriver driver = null;
	    public static void main(String[] args) throws NullPointerException {
	        
	    	
	    	System.setProperty("webdriver.chrome.driver","F://chromedriver_win32//chromedriver.exe");
	  
	    	driver = new ChromeDriver();
	      
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://ssgt.xtensible.in/");
	 
	        driver.findElement(By.xpath(".//*[@id='header']/div/div/div/div[2]/div/p/a")).click();
	        driver.findElement(By.id("log_email")).sendKeys("sagarkashid@mailinator.com"); 
	        driver.findElement(By.id("log_password")).sendKeys("test_123");
	        driver.findElement(By.id("candidate_login")).click();
	        driver.findElement (By.xpath(".//*[@id='header']/div/div/div/div[2]/div/div/div/a")).click();
	        driver.findElement (By.xpath(".//*[@id='header']/div/div/div/div[2]/div/div/div/ul/li[3]/a")).click();
	        driver.close();
	            }
	
	
	
	
	
	
	
}
