package shots;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormatSymbols;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Css extends BaseClass{
	
	@BeforeMethod
	public void beginnn() throws Exception{
		System.out.println("before Method");
		launchBrowser();
		}
	
	public WebElement find(By locator) throws Exception{
		return driver.findElement(locator); 
	}
	
	

	@Test
	public void test() throws Exception{
	   driver.get("https://www.irctc.co.in/");
	    String parentwindow=driver.getWindowHandle();
	    System.out.println(driver.getTitle());
	    
	    find(By.xpath("//div[@id='bluemenu']//span[text()='Hotels']")).click();
	    Set<String> windowHandlers=driver.getWindowHandles();
	    for(String windows:windowHandlers){
	    	if(driver.switchTo().window(windows).getTitle().equals("IRCTC Hotel India, Book Confirm Hotels, Indian Railways")){
	    		driver.switchTo().window(windows);
	    	}
	    }
	    System.out.println(driver.getTitle());
	    find(By.cssSelector("input#textfield")).sendKeys("Dehradun");
	    find(By.cssSelector("div.ac_results li")).click();
	    find(By.cssSelector("input#checkIn")).click();
	    String date="23-6-2015";
	    String a[]=date.split("-");
	    String month=new DateFormatSymbols().getMonths()[Integer.parseInt(a[1])-1];
	    System.out.println(month);
	    int current=11;
	    int n=0;
	    while(n<=Integer.parseInt(a[1]+1))
	    
	    
	    while(true){

	    	if(isElementPresent(By.xpath("//span[text()='"+month+"']"))){
	    		break;
	    	}

	    	find(By.cssSelector("div#ui-datepicker-div span[class$='triangle-e']")).click();
	    }


	    
	    
	    	
	    
	    
	    
	    Thread.sleep(5000);
	    
	    
	    
	    
	   
	    
	    
	    
	    
		
		
	
		
	}
	
	@AfterMethod
	public void end(){
		driver.quit();
	}
}
