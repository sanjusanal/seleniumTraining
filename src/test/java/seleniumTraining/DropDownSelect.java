package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singSel = new Select(driver.findElement(By.id("select-demo")));
		singSel.selectByValue("Tuesday");
		Select multSel = new Select(driver.findElement(By.id("multi-select")));
		if(multSel.isMultiple())
		{
			multSel.deselectByIndex(0);
			multSel.deselectByValue("Florida");
			multSel.deselectByVisibleText("Washington");
		}
		List<WebElement> items = multSel.getAllSelectedOptions();
		System.out.println("Items Selected :"  + items.size());
		multSel.deselectByValue("Florida");
		

	}

}
