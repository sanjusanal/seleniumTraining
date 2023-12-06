package seleniumTraining;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Phones & PDAs')][1])")).click();
		Actions actions = new Actions(driver);
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
    	String path = System.getProperty("user.dir")+ "/screenshots/" + System.currentTimeMillis() +".png";
		FileUtils.copyFile(src, new File(path));
		WebElement image = driver.findElement(By.cssSelector("div.col-12.text-center"));
		actions.scrollToElement(image).perform();
		Thread.sleep(2000);
		File src1 = image.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")+ "/screenshots/" + System.currentTimeMillis() +".png";
		FileUtils.copyFile(src1, new File(path1));

	}

}
