import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST {

	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub
     
	// selenium cocde 
		
		// create driver object for chrome Browser
		
		// The way we create any driver here is the syntax
		
		// example Webdriver driver = new Webdriver();
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://facebook.com");
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		// in order to validate if we landed in correct URL
		
		System.out.println(driver.getCurrentUrl());
		
		// in order to get the web page source
		
		//System.out.println(driver.getPageSource()); 
		
		// In order to navigte from google to yahoo.com and then navigate back we have to do the following. 
		
		driver.get("http://yahoo.com ");
		
		// now we if want to navigate back this is what we have to do
		
		driver.navigate().back();
		
		//if we want to forward the webpage this what we have to do. 
		
		driver.navigate().forward();
		
		// if we want to clsoe the browser, then this is the command. 
		
		driver.close(); // -> this will close only current browser
		
		// there is another way how to close. 
		
		driver.quit(); // -> will close all the browser opened by SELENIUM.
		
		
		
		
	} 
	

}
