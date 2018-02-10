package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_udemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//If implicit wait is not used it throws a NoSuchElementExceptiom Error.//
		//to do explicit now
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url;
		url = "https://www.orbitz.com/Hotels";
		driver.get(url);
//		String hotel;
//		hotel =".//a[@href='#hotels']";
//		driver.findElement(By.xpath(hotel)).click();
		String going_to;
		going_to = ".//input[@id='hotel-destination']";
		driver.findElement(By.xpath(going_to)).sendKeys("China");
		driver.findElement(By.xpath(going_to)).sendKeys(Keys.TAB);
		//driver.findElement(arg0)
		String checkin;
		checkin= ".//input[@id='hotel-checkin']";
		driver.findElement(By.xpath(checkin)).sendKeys(Keys.ENTER);
		//WebDriverWait check = new WebDriverWait(driver,20);
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS);
		wait.pollingEvery(5,TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		String hotel;
		hotel =".//a[contains(@href,'Guangzhou-Hotels-Blog-Hotel-Guangzhou')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(hotel)));
		driver.findElement(By.xpath(hotel)).click();
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		

	}

}
