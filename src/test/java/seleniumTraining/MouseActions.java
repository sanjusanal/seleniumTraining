package seleniumTraining;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Phones & PDAs')][1])")).click();
		Actions actions = new Actions(driver);
		WebElement image = driver.findElement(By.cssSelector("div.col-12.text-center"));
		actions.scrollToElement(image).perform();
//		WebElement srcBox = driver.findElement(By.name("search"));
//		actions.contextClick(srcBox).perform();
//		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
//		actions.moveToElement(menu).perform();
//		WebElement menuitem = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
//		actions.click(menuitem).perform();
//		actions.moveToElement(menu).click(menuitem).build().perform();
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
//		WebElement btn = driver.findElement(By.xpath("//button[contains (text(), 'Click Me / Double Click Me!')]"));
//		Actions actions = new Actions(driver);
//		actions.doubleClick(btn).perform();
//		
		
	}
}
	
