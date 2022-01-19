import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// drop down with select
		
		//driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// here we created a new object 
		
		// All this methods will work if we have Select tag on HTML code. If we dont have then it will not work. 
		
		Select dropdown = new Select(staticDropdown);
		
		Thread.sleep(4000);  
		
		//dropdown.selectByIndex(3);
		
		
		
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		
		Thread.sleep(4000);
		
		
		
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//dropdown.selectByValue("INR");
		
		//System.out.println(dropdown.getFirstSelectedOption().getText());    
		
		driver.close(); 

	}

}
