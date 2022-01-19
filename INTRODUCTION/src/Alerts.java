import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		String text = "Bakhtiyori";
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.cssSelector("[id='name']")).sendKeys(text);
		
		//driver.findElement(By.id("alertbtn")).click();
		
		//System.out.println(driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.id("confirmbtn")).click();
		
		//System.out.println(driver.switchTo().alert().getText());
		
		
		driver.switchTo().alert().dismiss();
		
		
		driver.get("http://www.cleartrip.com");
		
		Thread.sleep(4000);
		 
		
		
		
		

	}

}
