package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_classname_link_partiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("clickon");
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();

	}

}
