package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String strTitle =(String)js.executeScript("return document.title");
		System.out.println(strTitle);
		WebElement searchBox = (WebElement)js.executeScript("return document.getElementsByName('search') [0]");
		searchBox.sendKeys("Mobile Phone");
		driver.findElement(By.cssSelector("button.btn.btn-light.btn-lg")).click();
		js.executeScript("history.go(-1)");
		js.executeScript("window.scrollBy(10, 700)");
		js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
		

	}

}
