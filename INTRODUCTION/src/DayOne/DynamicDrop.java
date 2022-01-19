package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver selenium = new ChromeDriver();
		
		selenium.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		
		WebElement staticDropdown = selenium.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Thread.sleep(3000);
		
		Select drop = new Select(staticDropdown);
		
		//dropdown.selectByVisibleText("USD");
		
		drop.selectByIndex(3);
		
		Thread.sleep(7000);
		
		selenium.quit();
	}

}


