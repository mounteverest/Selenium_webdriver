package customize_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "http://www.facebook.com";
		driver.get(url);
		driver.findElement(By.xpath("//input[starts-with(@name,'first')]")).sendKeys("ffdgfddfggdsfgdf");
		driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("dsturyuryrgfgsdfgs");
		Select bir_month = new Select (driver.findElement(By.name("birthday_month")));
		bir_month.selectByVisibleText("Jan");
		Select bir_day = new Select(driver.findElement(By.name("birthday_day")));
		bir_day.selectByValue("10");
		Select bir_year = new Select(driver.findElement(By.name("birthday_year")));
		bir_year.selectByValue("1978");
		WebElement female = driver.findElement(By.xpath("//input[@value='1' and @type ='radio']"));
		female.click();
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		driver.navigate().back();
		
	}

}
