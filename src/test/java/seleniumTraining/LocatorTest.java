package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("http://the-internet.herokuapp.com/login");	
//		//Xpath
//		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
//		//CSS
//		driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
		driver.get("https://www.lambdatest.com/blog/");
		//css
		driver.findElement(By.cssSelector("div.header_menu_items >div:nth-child(2)")).click();

	}

}
