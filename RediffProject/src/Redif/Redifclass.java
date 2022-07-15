/**
 * 
 */
package Redif;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author admin
 *
 */
public class Redifclass {

	/**
	 * 
	 */
	public Redifclass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/index.html");
		
		
		driver.findElement(By.linkText("Sign-up")).click();
		
		driver.findElement(By.id("fullname")).sendKeys("priya pavan");
		driver.findElement(By.id("emailid")).sendKeys("priyapavan1212@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("priyapavan1212");
		driver.findElement(By.id("repass")).sendKeys("priyapavan1212");
		
		
		Select day = new Select(driver.findElement(By.id("date_day")));
		day.selectByIndex(3);
		Select Month = new Select(driver.findElement(By.id("date_mon")));
		Month.selectByIndex(5);
		Select Year = new Select(driver.findElement(By.id("date_yr")));
		Year.selectByIndex(86);
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		Select Country = new Select(driver.findElement(By.id("country")));
		Country.selectByIndex(1);
		Select City = new Select(driver.findElement(By.id("city")));
		City.selectByVisibleText("Bengaluru");
		
		driver.findElement(By.id("fld_captcha"));
		
		WebElement submit = driver.findElement(By.id("btn_register"));
	       submit.click();
	}

}
