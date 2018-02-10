package Handle_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prompt_alert {
	
		public static void main(String[] args){
			WebDriver driver = new FirefoxDriver();
			String url;
			url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
			driver.get(url);
			driver.switchTo().frame(0);
			String prompt;
			prompt = "//html/body/button[text()='Try it']";
			driver.findElement(By.xpath(prompt)).click();
			try{
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.sendKeys("Super Man");
			alert.accept();
			System.out.println("User accepted the prompt");
					
				}
			catch(NoAlertPresentException e){
				System.out.println("User Cancelled the prompt");
			}
			
		}
}
