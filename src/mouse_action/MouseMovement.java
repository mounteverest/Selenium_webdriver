package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url;
		url = "http://spicejet.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions action = new Actions(driver);
		String link_element;
		link_element = "Add-Ons";
		WebElement  add_ons = driver.findElement(By.linkText(link_element));
		action.moveToElement(add_ons).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hot Meals")).click();
	}
}
