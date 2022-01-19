import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://login.salesforce.com/");
		
		//driver.findElement(By.name("username")).sendKeys("Azamat");
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Azamat");

		
		
		driver.findElement(By.xpath("//input[@class= 'input r4 wide mb16 mt8 username']")).sendKeys("test");
		
		
		
		//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">
		
		//input[@name= 'username']  or we can the following as well "//*[@name= 'username']"
		
		// Above line is the customize xpath that we just created manually
		
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Azamat");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.name("pw")).sendKeys("123");
		
		//driver.findElement(By.cssSelector("#password")).sendKeys("123");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("Login")).click();
		
		
		//driver.get("https://google.com");
		
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		/*
		 * Type of Locators
		 * 
		 1) By ID
		 2) By NAME 
		 3) By Xpath
		 4) By cssseletor
		 5) Customize xpath or csselector
		 6) 
		 */
		
		/* How to customize Xpath and CsSelector in case in can't find Xpath
		and CsSelector or when your Xpath and CsSelector doesn't work*/
		
		
		//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">
				
				// this is html 
		
				// in this line of code 
				
				// input = TagName
				// Attributes = Class
				// Value = Inputtext
				
				// To create your own Xpath you have to the following
				
				//input[@name= 'username']  or we can the following as well "//*[@name= 'username']"
				
				// Above line is the customize xpath that we just created manually
		
		

	}

}
