import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class google {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Tajikistan");
		
		Thread.sleep(4000);
		
		//List<WebElement> options = 
		
		//driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > ul > li.sbct.sbre > div > div.pcTkSc > div.ClJ9Yb > span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]/div[1]/span")).click();
		
		//driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div/div[1]/div/div[1]/div/div[4]/a")).click();
		
		
		
		WebDriver newdriver = new ChromeDriver();
		newdriver.get("https://www.makemytrip.com/");

		newdriver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).clear();
		newdriver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).click(); 
		WebDriverWait wait = new WebDriverWait(newdriver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ui-menu-item'][2]/div/p[1]/span[1]"))).click();
   
	}

}
