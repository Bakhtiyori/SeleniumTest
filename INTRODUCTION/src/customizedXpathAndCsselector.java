import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customizedXpathAndCsselector {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@name= 'username']")).sendKeys("test");
		
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("we did it");
		

	}

}




//     <input class="input r4 wide mb16 mt8 username" type="email"
//     value="" name="username" id="username" aria-describedby="error" style="display: block;">
