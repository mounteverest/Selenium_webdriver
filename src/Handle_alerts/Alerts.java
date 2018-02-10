package Handle_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String url;
		url ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		driver.get(url);
		driver.switchTo().frame(0);
		String alert;
		alert = "html/body/button[text()='Try it']";
		driver.findElement(By.xpath(alert)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text;
		text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().defaultContent();
				
	}

}
