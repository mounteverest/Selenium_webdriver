package Handle_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class confirm_alert {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		driver.get(url);
		driver.switchTo().frame(0);
		String confirm;
		confirm = "html/body/button[text()='Try it']";
		driver.findElement(By.xpath(confirm)).click();
		try{
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		System.out.println(alert.getText());
		alert.dismiss();
		
		System.out.println("you Pressed Cancel");
		}
		catch(NoAlertPresentException e){
			System.out.println("You pressed OK");
		}
//		System.out.println(alert.getText());
		driver.switchTo().defaultContent();
	}

}
