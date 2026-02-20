package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTask 
{
	@Test
	public void paginationTableTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"))).perform();

		
	}

}
