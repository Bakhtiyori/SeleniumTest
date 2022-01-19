import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		
		// how to find locators 
		
        System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
		
		// in order to validate if we landed in correct URL
		
		System.out.println(driver.getCurrentUrl());
		
		
		/*
		driver.findElement(By.id("email")).sendKeys("baxa.90@list.ru");
		driver.findElement(By.name("pass")).sendKeys("919330363");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("baxa.90@list.ru");*/
		
		// every obeject on your browser may not have ID, className, Xpath, CSS prefrred.
		// any tag start which is starts by <a is a link in SELENIUM. or anchot "a" <a means a link 
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("baxa.90@list.ru");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("919330363");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.cssSelector("#u_0_b")).click();
		driver.findElement(By.cssSelector("#u_0_a > div._6ltj > a")).click();
		driver.findElement(By.cssSelector("#identify_email")).sendKeys("6466595383");
		
		// whenever your Xpath start with html it is not reliable and mostly it happens with FireFox browser
		// In order to have a correct Xpath switch to Chrome and get Xpath. with Chrome you will not have that issue.  
		
		//+++++++++++----------------------+++++++++++++++++++++
		
		// if we need to validate our Xpath or CssSelector in any browser we have to do the following.
		// for Xpath click on consol and type $x("nameofthe_xpath that you copied")
		// for CssSelector do the same thing but without x example $("nameofthe_xpath that you copied")
		

	} 

}
