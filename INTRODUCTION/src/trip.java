import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trip {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tripadvisor.com/");
		
		driver.findElement(By.cssSelector("#lithium-root > main > div._1zfE5FZZ > div._1brQmsfe > div > div > div:nth-child(17) > div > button > span > span._2qTlD7b_ > svg")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-3\"]/span")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='_3qLQ-U8m']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3qLQ-U8m']")).sendKeys("Booklyn");
		
		driver.findElement(By.cssSelector("#typeahead_results > a > div._3kJV_KuE > div")).click();

	}

}
