package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url ;
		url ="https://jqueryui.com/droppable";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(0);
		WebElement source,target;
		source = driver.findElement(By.id("draggable"));
		target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		
		
		

	}

}
