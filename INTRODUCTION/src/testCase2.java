import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testCase2 {

	public static void main(String[] args) {
		
		// selenium cocde 
		
				// create driver object for chrome Browser
				
				// The way we create any driver here is the syntax
				
				// example Webdriver driver = new Webdriver();
				
				
				System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
				
				WebDriver driver = new SafariDriver();
				
				driver.get("http://google.com");
				
				System.out.println(driver.getTitle());
				
		
		
		

	}

} 
