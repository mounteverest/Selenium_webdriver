package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Isvisible {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "https://www.expedia.com/";
		driver.get(url);
		//Choose Flight option
		String flight;
		flight = "//*[@id='tab-flight-tab-hp']";
		driver.findElement(By.xpath(flight)).click();
		
		//Choose Origin From location text
		String fly_from;
		fly_from = "//*[@id='gcw-flights-form-hp-flight']/div[3]/div[1]/div/div[1]/label/span[1]";
		System.out.println(driver.findElement(By.xpath(fly_from)).getText());
		
		//Choose fly from location
		String Flying_from ;
		Flying_from = ".//input[@id='flight-origin-hp-flight']";
		driver.findElement(By.xpath(Flying_from)).sendKeys("Houston, TX (HOU-William P. Hobby)");
		
		//Choose Depart from location
		String Depart_from;
		Depart_from = ".//input[@id='flight-destination-hp-flight']";
		driver.findElement(By.xpath(Depart_from)).sendKeys("Orlando International Airport (MCO), Florida");
		
		//Choose fly_date
		String depart_button;
		depart_button = "//*[@id='flight-departing-hp-flight']";
		driver.findElement(By.xpath(depart_button)).click();
		String fly_date;
		fly_date = "//div/div[2]/table/tbody/tr[4]/td[5]/button";
		driver.findElement(By.xpath(fly_date)).click();
		System.out.println("Before clicking one_way");
		
		//Choose Depart-Date
		String return_button;
		return_button = ".//*[@id='flight-returning-hp-flight']";
		driver.findElement(By.xpath(return_button)).click();
		String depart_date;
		depart_date ="//*[@id='flight-returning-hp-flight']";
		Assert.assertTrue(driver.findElement(By.xpath(depart_date)).isDisplayed());
		boolean departing_date = driver.findElement(By.xpath(depart_date)).isDisplayed();
		System.out.println(departing_date);
		System.out.println("After clicking one_way");
		
		//Choose One_way
		String one_way;
		one_way = " //*[@id='flight-type-one-way-label-hp-flight']";
		driver.findElement(By.xpath(one_way)).click();
		
		String departing_date1;
		departing_date1 = "//*[@id='flight-returning-hp-flight']";
		Assert.assertFalse(driver.findElement(By.xpath(departing_date1)).isDisplayed());
		System.out.println(driver.findElement(By.xpath(departing_date1)).isDisplayed());
		//System.out.println(departing_date1);
		
		//Check Whether the Element is present in the page or not
		int count = driver.findElements(By.xpath(departing_date1)).size();
		System.out.println("count="+count);
		if(count == 0)
		{
			
		System.out.println("There is no such elemnt in the Current Page");	
			
		}
		else
		{
			
		System.out.println("The Element is present in the Web page");
			
		}
		
		//Check for isEnabled
		String round_trip;
		round_trip = "//*[@id='flight-type-roundtrip-label-hp-flight']";
		Boolean round_button =driver.findElement(By.xpath(round_trip)).isEnabled();
		System.out.println(round_button);
	}
}
