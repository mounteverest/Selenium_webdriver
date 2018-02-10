package customize_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("sadfshdahfgsd");
		driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("hehehe");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.xpath("//input[[@name='firstname']]")).sendKeys("xxxxx");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gggg");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sdfsdf@dsfsd.com");
		//driver.findElement(By.xpath(" //input[@name='reg_passwd__']")).sendKeys("fsjkdfhsdkfj");
		//driver.findElement(By.xpath("  "))

	}

}
/* Firefox 56 has issues with 
firepath
and not showing the html document

The problem resolved by
about:config in the ff browser
and change
browser.tabs.autostart to false
and install firefox version 55.0.3*/