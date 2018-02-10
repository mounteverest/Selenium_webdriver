package invokeBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Browser_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.tabs.remote.autostart", false);
//		profile.setPreference("browser.tabs.remote.autostart.1", false);
//		profile.setPreference("browser.tabs.remote.autostart.2", false);
//		profile.setPreference("browser.tabs.remote.force-enable", false);
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "https://www.google.com";
		
		driver.get(url);
		driver.getCurrentUrl();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.close();
		//driver.quit();

	}

}
