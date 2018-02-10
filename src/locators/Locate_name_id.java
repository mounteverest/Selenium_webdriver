package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_name_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("asdfgjh");
		driver.findElement(By.cssSelector("#email")).sendKeys("sdshjkh");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		//driver.close();
		
	}

}
