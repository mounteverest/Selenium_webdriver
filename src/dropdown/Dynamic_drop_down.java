package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url ="https://www.cheapflights.com/";
		driver.get(url);
		String car;
		car = ".//div[@class='bookingEngineModule']/div/ul/li[4]/span";
		driver.findElement(By.xpath(car)).click();
		String location;
		location = ".//input[@id='destination']";
		driver.findElement(By.xpath(location)).click();
		driver.findElement(By.xpath(location)).sendKeys("Portland, OR (PDX) - USA");
		String pickupdate;
		pickupdate = ".//form/span[2]/div/div";
		driver.findElement(By.xpath(pickupdate)).click();
		String selectmonth;
//		selectmonth = "//div[@class='calendars']/table[1]/thead/tr[1]/th/span[text()='December, 2017']";
//		driver.findElement(By.xpath(selectmonth)).click();
}
}