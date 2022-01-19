import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("http://spicejet.com");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		/*int i = 1;
		
		while(i<5) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
			
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();*/
		
		// We can do the above line code with For loop instead of While loop
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i= 1; i < 5; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// if we want to confirm that we are getting and we want to write assertion for that this what we need to do. 
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		
		

	}

}
