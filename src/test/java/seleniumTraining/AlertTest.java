package seleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text :" + alert.getText());
		alert.accept();
		
		//Handing confirmation Alert
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert Text :" + confirm.getText());
		confirm.dismiss();
		
		//Handling prompt alert
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert Test:" + prompt.getText());
		prompt.sendKeys("Hellow Welcome");
		prompt.dismiss();

	}

}
