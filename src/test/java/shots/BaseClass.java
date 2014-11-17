package shots;

import java.awt.Point;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;



public class BaseClass  {
	protected WebDriver driver;

	
	public void launchBrowser()throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}


   
	public void browserQuit(){
		driver.quit();
	}
	
	
	public WebElement find(By locator) throws Exception{
		return driver.findElement(locator); 
	}

	public void getScreenShot(String path,String name,String locator)throws Exception{

		File errorShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(errorShot,new File(""+path+"//"+name+""));

		WebElement  ele=driver.findElement(By.xpath(""+locator+""));
		BufferedImage fullImg = ImageIO.read(errorShot);
		org.openqa.selenium.Point point =ele.getLocation();
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth,eleHeight);
		ImageIO.write(eleScreenshot, "png", errorShot);
		FileUtils.copyFile(errorShot,new File(""+path+"//"+name+""));
	}
	

	public boolean isElementPresent(By locator){
		try{
			driver.findElement(locator);
			return true;
		}
		catch(Exception e){
			System.out.println("Element not Found");
			return false;
		}  
	}
}




