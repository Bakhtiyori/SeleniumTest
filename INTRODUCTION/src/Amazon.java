import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon { 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]")).click();
		
		// //div[@class= 'Sdkep']/div/div[2]/div/input 
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]"));
		//driver.findElement(By.xpath("//a[starts-with(text(), 'ap_email')]")).sendKeys("bmloikzoda@gmail.com"); 
		
		//driver.findElement(By.xpath("//input[contains(@name,'rememb')]")).click();
		
	
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.cssSelector("#auth-fpp-link-bottom")).click();
		
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("bmloikzoda@gmail.com");
		//driver.close();
		
		
		

	}

}
