package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		int i =100;
		String url;
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_validation_check";
		driver.get(url);
		driver.switchTo().frame(0);
		String number;
		number = "//input[@id='id1']";
		 List<WebElement> number1 = driver.findElements(By.xpath(number));
		//driver.findElement(By.xpath(number)).click();
		 while( i <105)
		 {
			 number1.get(i).click();
			 i++;
		 }
		 driver.switchTo().defaultContent();
	}

}
