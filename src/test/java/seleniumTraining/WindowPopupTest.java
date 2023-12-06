package seleniumTraining;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win : " + parentWin);
		driver.findElement(By.xpath("//button[text() =' Click to open new Tab ']")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Tabs Opened :" + tabs.size());
		for(String child:tabs)
		{
			System.out.println("Windows...."+ child);
			if(!child.equalsIgnoreCase(parentWin)) 
			{
				driver.switchTo().window(child);
				System.out.println("Child Win Title...." + driver.getTitle());
				}			
	
		}
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[text() =' Click to open new Window ']")).click();
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of Windows Opened :" + wins.size());
		for(String child:wins)
		{
			driver.switchTo().window(child);
			System.out.println("Windows...." + driver.getTitle());
			}			
		
		driver.quit();
		

	}
}


