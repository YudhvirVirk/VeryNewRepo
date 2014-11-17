package shots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Working extends BaseClass {
	
	@BeforeMethod
	public void start() throws Exception{
		launchBrowser();
	}

	@AfterMethod
	public void finish() throws Exception{
		browserQuit();
	}
	@Test
	public void project() throws Exception{
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@id='hplogo']"));
		System.out.println("hello");
		getScreenShot("C:\\Users\\admin\\Desktop","sc.png","//div[@id='hplogo']");
	}



}
