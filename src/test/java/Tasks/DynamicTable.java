package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicTable 
{
	@Test
	public void dynamicTableTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://testautomationpractice.blogspot.com/");

		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//div[@id='broken-links']/h4"))).perform();

		String name="Chrome";
		
		System.out.println(driver.findElement(By.xpath("//table[@id='taskTable']//td[text()='"+name+"']/following-sibling::td[2]")).getText());

	}

}
