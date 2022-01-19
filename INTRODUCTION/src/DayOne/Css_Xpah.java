package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Xpah {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver selenium = new ChromeDriver();
		
		selenium.get("http://login.salesforce.com/"); 
		
		//selenium.findElement(By.cssSelector("#username")).sendKeys("test");
		
		//selenium.findElement(By.cssSelector("#password")).sendKeys("123");
		
		// The two lones above was for Css selector. 
		
		selenium.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test");
		
		selenium.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");
		
		selenium.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		
		//<input class="button r4 wide primary" type="submit" 
		//id="Login" name="Login" value="Log In" xpath="1">
		
		
		// TagName    = input 
		// Attributes = Class
		// Value      = button
		
		// The below examoles is for customize Xpath 
		
		//input[@type='submit'] first version 
		//input[@class='button r4 wide primary'] second version 
		//input[@id='Login'] third version 
		//*[@name='Login']
		
		// To create your own Xpath you have to the following
		
		//input[@Class='button']  or we can the following as well "//*[@name= 'username']"
				
		// Above line is the customize xpath that we just created manually
		
		// __________________________________________________
		
		// The Below is customize Css selector
		
		//-----------------------Creating Customize Css for SELENIUM testing----------------------------------//
		
		// for Css we do the same thing but we dont need two forward slashes. For example like this [name= 'username'] or this input[name*= 'username']
		// for CSS we can do the following as well in order to create a custom CSS input#username
		// The other way that we can create our own CSS in SELENIUM is as follows "#password"
		
	
		
		//<input class="button r4 wide primary" type="submit" 
		//id="Login" name="Login" value="Log In" xpath="1">
				
				
				// TagName    = input 
				// Attributes = Class
				// Value      = button
		
		//      *******  Examples *******
		
		//        [name= 'Login']
		//        [type*= 'submit']
		//        input#Login
		//        #Login

	}

}
