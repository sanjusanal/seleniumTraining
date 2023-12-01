package seleniumTraining;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideImageTest {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//this will disable image loading -Method
		options.addArguments("--blink-settings=imagesEnabled=false");
		// or alternatively we can set direct preference - Method 2
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.mananged_default_content_settings.images", 2);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		

	}

}
