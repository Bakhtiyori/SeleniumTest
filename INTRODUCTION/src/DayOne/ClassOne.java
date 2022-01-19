package DayOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ClassOne   {
	
		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
			
			WebDriver selenium = new ChromeDriver();  
			
			selenium.get("http://google.com"); 
			
			Thread.sleep(3000);
			// we use this > System.out.println whenever we want to print something
			System.out.println(selenium.getTitle());
			
			System.out.println(selenium.getCurrentUrl());
			
			selenium.get("https://facebook.com");
			
			System.out.println(selenium.getTitle());
			
			System.out.println(selenium.getCurrentUrl());
			
			selenium.navigate().back();	
			
			selenium.navigate().forward(); 
				
			
		
    }

}


