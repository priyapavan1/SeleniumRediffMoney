/**
 * 
 */
package Redif;

import java.awt.List;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/**
 * @author admin
 *
 */
public class Port {

	/**
	 * 
	 */
	public Port() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com");
		
		
	
		

		driver.findElement(By.linkText("My Portfolio")).click();
		
		driver.findElement(By.id("useremail")).sendKeys("svpriya1234@gmail.com");
		driver.findElement(By.id("userpass")).sendKeys("priya1234");
		Thread.sleep(2000);
		
		WebElement Submit = driver.findElement(By.xpath("//input[@id='loginsubmit']"));
		Submit.click();
	   
	    
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	    
		Thread.sleep(3000);  
	    driver.get("https://portfolio.rediff.com/portfolio");  
	    
	    
	    
	    WebElement radio = driver.findElement(By.xpath("//input[@id='addmf']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		
		
		
		
		driver.findElement(By.xpath("//input[@id='addStock']")).click();

		//click on to 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addstockname']")).sendKeys("Aarti");
		
		//select company
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='12070021']")).click();

		
		driver.findElement(By.id("stockAddDate")).sendKeys("20/10/2022");
		
		driver.findElement(By.id("addstockqty")).sendKeys("50000");
		
		driver.findElement(By.id("addstockprice")).sendKeys("45500");  
		
		WebElement Submit1 = driver.findElement(By.id("addStockButton"));
		Submit1.click();
	    Thread.sleep(2000);
		
	    
	    
	    driver.findElement(By.xpath("//input[@id='addStock']")).click();

		//click on to 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addstockname']")).sendKeys("Bharat");
		
		//select company
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='13110034']")).click();

		
		driver.findElement(By.id("stockAddDate")).sendKeys("10/10/2022");
		
		driver.findElement(By.id("addstockqty")).sendKeys("5000");
		
		driver.findElement(By.id("addstockprice")).sendKeys("15500");  
		
		WebElement Submit2 = driver.findElement(By.id("addStockButton"));
		Submit2.click();
	    Thread.sleep(2000); 
	   
		
	    driver.findElement(By.id("equityid12070021")).click();
	    driver.findElement(By.name("Delete")).click(); 
	    Thread.sleep(1000);
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='equityid13110034']")).click();
	    driver.findElement(By.cssSelector("tr[id='equityRow22732682'] input[title='Delete']")).click();
	    Thread.sleep(1000);
		Alert alert2= driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
	    
	    
		
		
	    
	    
	    //watchlist
		
		
		WebElement radio1 = driver.findElement(By.cssSelector("#createPortfolio"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(radio1);
		actions2.perform();
	    
	    driver.findElement(By.linkText("My Watchlist")).click();
	    
	    driver.findElement(By.xpath("//input[@id='add-stock-button']")).click();
	  
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='stocksearch']")).sendKeys("aa");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='15580082']")).click();

		driver.findElement(By.id("maxprice")).sendKeys("59000");
		driver.findElement(By.id("minprice")).sendKeys("9000");
		
		
		WebElement Add = driver.findElement(By.id("add-stock-submit"));
		Add.click();
	    Thread.sleep(2000);
		
	    //secondstock
	    
	    driver.findElement(By.xpath("//input[@id='add-stock-button']")).click();
		  
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='stocksearch']")).sendKeys("TT");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='17024576']")).click();

		driver.findElement(By.id("maxprice")).sendKeys("99000");
		driver.findElement(By.id("minprice")).sendKeys("800");
		
		Thread.sleep(1000);
		WebElement Add1 = driver.findElement(By.id("add-stock-submit"));
		Add1.click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath ("/html/body/div[5]/div[3]/div/div[2]/div[1]/table/tbody/tr/td[10]/div[1]/a")).click();
	    driver.findElement(By.xpath ("//a[@class='delete-stock-confirm']")).click();
	    
	   
	   
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Sign Out")).click();         
	    
	    
		
	}
	
	

}
