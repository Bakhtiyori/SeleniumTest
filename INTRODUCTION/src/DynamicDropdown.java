import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert;
public class DynamicDropdown {

		public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		/* the same code can be written in the following way as well. Meaning we will change this code driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 to something else which will do the same thing */
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		// from here bellow we want to handle check box
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		// Count for number of check boxes.
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
		
		
		

	}

}
