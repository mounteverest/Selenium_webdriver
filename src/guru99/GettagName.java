package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe " );
		WebDriver driver = new FirefoxDriver();
		String tagname,baseurl;
		baseurl = "https://facebook.com";
		tagname="";
		driver.get(baseurl);
		tagname = driver.findElement(By.id("email")).getTagName();
		//driver.findElement(By.cssSelector("font:contains('password')")
		System.out.println("tagname ="+tagname);
		driver.close();

	}

}
