import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException { 
		
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");  
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){ // changed this to 0.5 it will fail
			
			System.out.println("it's disabled ");
			
			Assert.assertTrue(true);
			
			}else 
			
		{
			
			Assert.assertTrue(false);  
			
			
		}
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(4);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement dropDowns = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select droplist = new Select(dropDowns);
		
		droplist.selectByVisibleText("USD");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
 