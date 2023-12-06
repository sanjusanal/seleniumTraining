package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDOMTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.cssSelector("div#shadow_host"));
		SearchContext context =shadowHost.getShadowRoot();
		WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
		System.out.println("Shadow DOM Content :" + shadowContent.getText());
		WebElement shadowHost1 = context.findElement(By.cssSelector("div#nested_shadow_host"));
		SearchContext context1 =shadowHost1.getShadowRoot();
		WebElement shadowContent1 = context1.findElement(By.cssSelector("div#nested_shadow_content"));
		System.out.println("Inner Shadow DOM Content :" + shadowContent1.getText());

	}

}
