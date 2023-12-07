package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.cssSelector("input#age")).sendKeys(Keys.PAGE_DOWN);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("input#age"))).perform();
		String str = driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
		System.out.println("Tool Tip Test is : " +str);

	}

}
