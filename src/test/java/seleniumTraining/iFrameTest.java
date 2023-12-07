package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		//from main page to frame1
		driver.switchTo().frame("frame1");
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello World");
		//from frame1 to frame 3
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		//from frame 3 to frame 1
		driver.switchTo().parentFrame();
		inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Hello Sanju");
		//from fame 1 to main page
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		//
		driver.switchTo().frame("frame2");
		Select drpDown = new Select(driver.findElement(By.id("animals")));
		drpDown.selectByIndex(2);
		WebElement selected = drpDown.getFirstSelectedOption();
		System.out.println(selected.getText());
		
		
		
		

	}

}
