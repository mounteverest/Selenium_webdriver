package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl;
		int size;

		baseurl = "https://jqueryui.com/droppable/";
		driver.get(baseurl);
		size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		// driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();

	}

}
