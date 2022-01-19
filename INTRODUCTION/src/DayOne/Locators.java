package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("Bakhtiyori");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("pw")).sendKeys("12345");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	} 

}
