package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[10]/a")).click();
		
	
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[2]/a")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(4000);
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		
		Actions test = new Actions(driver);

		//Double click on element
	
		WebElement doubleCk = driver.findElement(By.id("hrefIncAdt")); 
		
		test.doubleClick(doubleCk).perform();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Thread.sleep(3000);
		
		Select drop = new Select(staticDropdown);
		
		Thread.sleep(3000);
		
		drop.selectByVisibleText("USD");
		
		//drop.selectByIndex(3);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
