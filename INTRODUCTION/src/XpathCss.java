import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCss {

	public static void main(String[] args) {
		
		//two ways of finding Xpath and Css. 
		// 1) you can get it from Firefox or Chrome it provided automatically but it not hundred percent reliable. 
		// 2) you can create you own customize Xpath and Css from XML code provided by inspector. 
		// 2) Xpath and Css are ywo different locators
		
		
        System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://login.salesforce.com/");
		
		System.out.println(driver.getTitle());
		
		// in order to validate if we landed in correct URL
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		
		
		//driver.findElement(By.name("pw")).sendKeys("12345");
		
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		//driver.findElement(By.id("email")).sendKeys("baxa.90@list.ru");
		
		//______________________________________________________________________________________
		
		//FirePath is Depricated in Fref0x and now we are learning how to get FirePath in Firex using inspector
		
		
		
		
		
		
		
		
		

	}

}
