package Authentication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpages {
 public static void main (String[] args)
 {
	WebDriver  driver =new ChromeDriver();
	driver.get("https://nickelfox.currinda2.com/en-au/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("michael@currinda.com");
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("playbill2");
	
	WebElement loginbutton =driver.findElement(By.xpath("//button[text()='Sign in']"));
	loginbutton.click();
	
	 String expectedtitle =driver.getTitle();
	
	  String actualtitle ="Login | Currinda";
	  
	  if (actualtitle.equals(expectedtitle)) {
		 System.out.println("tescase is passed : " +actualtitle);
		  
	 }
	  
	  else
	 {
	  System.out.println("testcase is failed : "  +expectedtitle);
	 }
	  
	
	
	
	driver.quit();
	
	 
 }
}
