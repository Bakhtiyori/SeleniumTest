import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeCSSXpath {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://login.salesforce.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name= 'username']")).sendKeys("baha"); 
		
		//Now we will create our own Xpath and Css in any browser.+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		//--------------------------------------------------------------------------------------------------------------
		
		
		
		
		
		//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">
		// this is html 
		// in this line of code 
		
		// input = TagName
		// Attributes = Class
		// Value = Inputtext
		
		// To create your own Xpath you have to the following
		
		//input[@type='email']  or we can the following as well "//*[@name= 'username']"
		
		// Above line is the customize xpath that we just created manually
		
		
		//-----------------------Creating Customize Css for SELENIUM testing----------------------------------//
		
		// for Css we the same thing but we dont need two forward slash for exmaple like this [@name= 'username'] or this input[name*= 'username']
		// for CSS we can do the following as well in order to create a custom CSS input#username
		// The other that we can create out own CSS in SELENIUM is as follows "#password"
		
		driver.findElement(By.cssSelector("input[id= 'password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector("input[value= 'Log In']")).click();
		//driver.findElement(By.cssSelector("input#submit")).click();
		//driver.findElement(By.cssSelector("input[name*='remember']")).click();
		// Above line and below is the same thing for Regular expression but this time we use xpath instead of CSS
		
		
		/* Above code is for the values that always change. this line of code helps us to copy for example rememberUn only remember and it will find 
		even though we didn't write the whole value rememberUn*/
		
		
		// when we use Console for xapth we need to type $x("") and then the xpath that you copied insidd the double quotation
		// for CSS we just need to type $("") and inside the quotation we need to put the CSS that we copied  
		
		
		
		
		
		

	}

}



// >> open any website and follow this rules

/*
							    1) open by id
								2) By name 
								3) by xpath 
								4) by Csselector
								5) Full Xpath
								6) Customized Csselector
								7) by Customized Xpath
	
*/












