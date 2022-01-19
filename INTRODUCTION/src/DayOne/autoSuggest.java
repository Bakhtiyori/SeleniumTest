package DayOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ta");
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) { 
			
			if(option.getText().equalsIgnoreCase("Tajikistan")) { 
				
				option.click();
				
				break; 
			}
		}
		
		
		Thread.sleep(7000);
		
		driver.quit();
		
		

	}

}
