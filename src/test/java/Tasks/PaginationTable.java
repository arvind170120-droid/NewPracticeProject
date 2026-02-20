package Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PaginationTable 
{
	@Test
	public void paginationTableTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://testautomationpractice.blogspot.com/");

		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Visitors']"))).perform();

		String product="Portable Charger";
		
		List<WebElement> eles = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
		for(WebElement ele:eles)
		{
			try
			{
				driver.findElement(By.xpath("//td[text()='"+product+"']/following-sibling::td/input")).click();
				System.out.println(driver.findElement(By.xpath("//td[text()='"+product+"']/following-sibling::td[1]")).getText());
				break;
			}
			catch(Exception r)
			{
				ele.click();
			}
		}

		driver.quit();

	}

}
