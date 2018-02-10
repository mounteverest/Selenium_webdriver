package invokeBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Invoke_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "c:\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		System.out.println("Title:"+driver.getTitle());
		System.out.println("URL:"+driver.getCurrentUrl());
		driver.close();
	}

}
