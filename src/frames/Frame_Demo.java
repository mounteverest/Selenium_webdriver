package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		String baseurl;
		int size;
		baseurl = "http://demo.guru99.com/selenium/deprecated.html";
		driver.get(baseurl);
		size = driver.findElements(By.tagName("frame")).size();
		System.out.println(size);
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Action")).click();
		driver.switchTo().defaultContent();
		

	}

}
