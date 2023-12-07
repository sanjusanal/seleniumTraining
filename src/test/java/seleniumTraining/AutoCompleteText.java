package seleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoCompleteText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/autocomplete/");
		String expectedvalue = "JavaScript";
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		WebElement tags =driver.findElement(By.cssSelector("#tags"));
		tags.sendKeys("as");
		//Thread.sleep(2000);
		List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1 > li >div"));
		//To know the number of matching items
		System.out.println("Number of matching itmes..." + items.size());
		//To get the text of each items
		for(WebElement item : items) {
			//To get the text of each item
			System.out.println(item.getText());
			//To select expected value
			if(item.getText().equalsIgnoreCase(expectedvalue))
			{
				item.click();
				break;
			}
			
		}

	}

}
