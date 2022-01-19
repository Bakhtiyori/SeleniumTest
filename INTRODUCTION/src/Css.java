
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		// here we created our own css locator 
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("test123");
		
		// here we created out own xpath locator 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		
		//driver.findElement(By.cssSelector("input[name='Login']")).click();
		
		// we can create css locator in this way also. line number 22 and 26 are the same 
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		/* when we create our own class name. it starts with dot . in case if css selector we use # but for class we use .
		
		 example .input.classenmae  ---- If the class name name has spaces in between, replace them with . dot 
		
		 but don't ever use class name if the class name is not unique. */
		
		//driver.quit();
		
		
	}

}
