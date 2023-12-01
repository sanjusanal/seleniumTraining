package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		//options.setBrowserVersion("115");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("selenium tutorial");
		Thread.sleep(2000);
		List<WebElement> listItems = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println("Total items =" + listItems.size());
		for(int i=0;i<listItems.size();i++)
		{
			System.out.println(listItems.get(i).getText());
			if(listItems.get(i).getText().equalsIgnoreCase("selenium tutorial pdf"))
			{
				listItems.get(i).click();
				break;
			}
			
				
			
		}
		

	}

}
