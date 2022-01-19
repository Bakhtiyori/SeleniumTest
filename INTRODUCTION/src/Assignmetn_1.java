import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmetn_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("FromTag")).sendKeys("Tajikistan");
		
		driver.findElement(By.xpath("//*[@id=\"oTag\"]")).sendKeys("JFK");
		
		WebElement dropDowns = driver.findElement(By.id("Adults"));
		
		Select droplist = new Select(dropDowns);
		
		droplist.selectByValue("3");
		
		WebElement dropDown = driver.findElement(By.cssSelector("#Childrens"));
		
		Select newDropDown = new Select(dropDown);
		
		newDropDown.selectByValue("2");
		
		WebElement newDrop = driver.findElement(By.name("infants"));
		
		Select dropList = new Select(newDrop);
		
		dropList.selectByVisibleText("1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("DepartDate")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[1]/a")).click();
		
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Delta");
		
		driver.findElement(By.xpath("//*[@id=\"SearchBtn\"]")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		
		
		
		
		
		
		
		

		
	}

}
