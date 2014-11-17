package shots;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class GmailBasedTest extends BaseClass{
//	
//	@BeforeMethod
//	public void beginn() throws Exception{
//	launchBrowser();
//	}
//	
	@Parameter
	private String st;
	@Test
	public void gmailOpreration(String st) throws Exception{
//		driver.get("http://www.gmail.com");
//		Thread.sleep(4000);
//		find(By.cssSelector("input#Email")).sendKeys("udvirk328");
//		find(By.cssSelector("input#Passwd")).sendKeys("gmailpractice");
//		find(By.cssSelector("input#signIn")).click();
//		
//		find(By.xpath("//div[text()='COMPOSE']")).click();
//		find(By.cssSelector("textarea[class='vO'][aria-label='To']")).sendKeys("udvirk328@gmail.com");
//		find(By.xpath("//input[@class='aoT'][@placeholder='Subject']")).sendKeys("Apology Letter");
//		find(By.cssSelector("div[aria-label='Message Body']")).sendKeys("Sorry for being rude....But i dont knw why i always loose my temper\nPlease try to understand me \n plz.....");
//		find(By.xpath("//div[text()='Send']")).click();
//		Thread.sleep(3000);
//				
//		find(By.cssSelector("table[id=':3m'] tr:nth-child(2) div[class*='oZ-jc T-Jo J-J5-Ji']")).click();
//		find(By.cssSelector("div.asa>div[class='ar9 T-I-J3 J-J5-Ji']")).click();
//		Thread.sleep(3000);
//		find(By.cssSelector("span#link_undo")).click();
//		
//		
//		
//		
//	
		System.out.println("Doneeee"+st);
	}
	
	
//	@AfterMethod
//	public void end(){
//		browserQuit();
//	}
}
