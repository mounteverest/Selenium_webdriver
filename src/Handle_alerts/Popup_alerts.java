package Handle_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "http://makeseleniumeasy.com/2017/09/19/handling-calendar-which-has-year-month-as-drop-down-in-selenium/";
		driver.get(url);
		//Alert pop = driver.switchTo().alert();
		//pop.dismiss();
		String close;
		close = "//*[@id='fancybox_ns-close']";
		driver.findElement(By.xpath(close)).click();
	
		
	}

}
