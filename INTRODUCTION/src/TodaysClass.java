import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TodaysClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gilt.com/boutique/");
		
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//*[@id=\"edr_register\"]/p/a")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		

	} 

}
