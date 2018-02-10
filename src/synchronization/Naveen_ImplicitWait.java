package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naveen_ImplicitWait {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "https://www.ebay.com/";
		driver.get(url);
		driver.manage().window().maximize();
		//
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
	}
	

}
