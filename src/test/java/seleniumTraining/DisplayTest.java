package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.cssSelector("input#searchBar")).sendKeys("text");
		String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		WebElement closeIcon = driver.findElement(By.cssSelector("a[class*='ui-icon-delete']"));
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed()) {
		    closeIcon.click();
		}

	}

}
