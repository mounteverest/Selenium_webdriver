package invokeBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Invoke_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.gecko.driver", "C:/geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.tabs.remote.autostart", false);
		profile.setPreference("browser.tabs.remote.autostart.1", false);
		profile.setPreference("browser.tabs.remote.autostart.2", false);
		profile.setPreference("browser.tabs.remote.force-enable", false);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

		System.out.println(driver.getPageSource());
		System.out.println();
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		System.out.println("Title:" + driver.getTitle());
		driver.close();

	}

}
