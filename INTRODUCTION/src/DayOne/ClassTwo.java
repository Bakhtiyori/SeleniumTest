package DayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTwo {

	public static void main(String[] args) throws InterruptedException{ 
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com");
		
		//System.out.println(selenium.getTitle());
		
		//System.out.println(selenium.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println("=================");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.facebook.com");
		
		System.out.println("***********************");
		
		System.out.println(driver.getTitle());
		
		System.out.println("---------------------");
		
		System.out.println(driver.getCurrentUrl());
		// The line bellow will stop the operation for 5 seconds
		Thread.sleep(5000);
		
		driver.navigate().back();
		 
		Thread.sleep(3000);
		
		driver.navigate().forward(); 
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}   

}  
