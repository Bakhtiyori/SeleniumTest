import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class_one {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/bakhtiyoriloikzoda/Desktop/SELENIUM/chromedriver");
		
		WebDriver test = new ChromeDriver();
		
		test.get("http://login.salesforce.com/");
		
		Thread.sleep(5000);
		
		System.out.println(test.getTitle());
		
		System.out.println(test.getCurrentUrl());
		
		Thread.sleep(3000);
		
		test.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys("test");
		
		test.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345");
		//test.findElement(By.id("username")).click();
		
		//test.findElement(By.id("username")).sendKeys("test");
		
		//test.findElement(By.id("password")).sendKeys("12345");
		
		//test.findElement(By.name("Login")).click();
		
		//WebDriverWait wait = new WebDriverWait(test,3);
		
        //WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error"))); 
        
        //System.out.println(error.getText());
		
		//Thread.sleep(5000);
		
		//test.navigate().back();
		
		//test.navigate().forward();
		
		Thread.sleep(5000);
		
		test.quit();
		
		
	}

}
