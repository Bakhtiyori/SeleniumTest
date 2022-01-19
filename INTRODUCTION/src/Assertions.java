import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "//Users//bakhtiyoriloikzoda//Desktop//SELENIUM//chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://spicejet.com"); 
			
			Thread.sleep(5000); 
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			
			/* If something is disabled meaning d drop down or a any functionality of the GUI and you want to confirm if that functionality is
			disabled or enabled, this what you should do*/
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			// Now we will validate if it's enabled or not.
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){ // changed this to 0.5 it will fail
				
				System.out.println("it's enabled ");
				Assert.assertTrue(true);
				
			}else {
				Assert.assertTrue(false);
			}
			
			
			
			
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
			
			System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
			
			driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
			
			
			System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
			
			// Count for number of check boxes.
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
			
			/* In order to handle Assertions we need to use Testng Framework. In order to have access to that we need first to download 
			 * testng jar file or library from this website >>  https://mvnrepository.com/artifact/org.testng/testng/6.9.4
			 * Once you're done the following steps 
			 * Right click on your projects that you created and  from drop down list go Properties. Now from from drop down list go to
			 * java Build path and click on libraries. Now on the left side of you Properties window click on Add External Jars and import
			 * all the Selenium jar files that you downloaded.  There is no difference in set up between Windows and Mac. Both have the same
			 * set of steps for installation.  */
			
			
			
		
		 
			
			
	}

}
