import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url;
		url ="http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		String noof_buttons;
		noof_buttons = "//td[@class='table5']/input";
		int input_size =driver.findElements(By.xpath(noof_buttons)).size();
		System.out.println(input_size);
		String milk =  "//td[@class='table5']/input[1]";
		driver.findElement(By.xpath(milk)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String cheese ="//input[@value='Cheese']";
		//driver.findElement(By.xpath(cheese)).click();
		String Beer;
		Beer = "//input[@value='Beer']";
		driver.findElement(By.xpath(Beer)).click();
	}

}
