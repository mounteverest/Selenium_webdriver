package invokeBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.udemy.com");
		System.out.println("Title:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
