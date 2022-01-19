import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_one {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		System.out.println(driver.getTitle());
		
		// in order to validate if we landed in correct URL
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.name("pw")).sendKeys("12345");
		driver.findElement(By.cssSelector("#Login")).click();
		driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		// Classes should not have spaces. if it has spaces selenium can not read it. If the class dont have space that you can use it 
		// if there is multiple or same attributes SELENIUM identifies the first one first.  
		// and when SELENIUM scans, sacning strts from top left. 
		
		// to ivoke interExplorer we just need to do 
		// => System.setProperty("webdriver.ie.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		
		
		
		
		

	}

}
