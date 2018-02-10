package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicait_wait {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url;
		url = "https://www.guru99.com/implicit-explicit-waits-selenium.html";
		driver.get(url);
		String act_title = "implicit wait & explicit wait in selenium";
		String exp_title;
		exp_title = driver.getTitle();
		if(act_title.equalsIgnoreCase(exp_title))
		{
			System.out.println("The test is passed");
		}
		else
		{
			System.out.println("The test is fail");
		}
	}
}
