package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		int child_count =0;
		//url selection
		String url;
		url="https://www.expedia.com/";
		driver.get(url);
		
		//Selecting the Flights
		String flights;
		flights ="//*[@id='tab-flight-tab-hp']";
		driver.findElement(By.xpath(flights)).click();
		
		//Select the origin of depart 
		String depart;
		depart = "//*[@id='flight-origin-hp-flight']";
		driver.findElement(By.xpath(depart)).click();
		driver.findElement(By.xpath(depart)).sendKeys("Orlando, FL (SFB-Orlando Sanford Intl.)");
		
		
		//Select the origin of Destination
		String destination;
		destination = "//*[@id='flight-destination-hp-flight']";
		driver.findElement(By.xpath(destination)).click();
		driver.findElement(By.xpath(destination)).sendKeys("Portland, Oregon");
		
		//Select the Departing date
		String departing_date;
		departing_date = "//*[@id='flight-departing-hp-flight']";
		driver.findElement(By.xpath(departing_date)).click();
		departing_date ="//div/table/caption[text()='Dec 2017']//following::tbody/tr[5]/td[1]/button";
		/*
		  //div/table/caption[text()='Jan 2018']//following::tbody/tr[4]/td[4]/button
		 */
		driver.findElement(By.xpath(departing_date)).click();
		
		
		//Select the returning date
		String returning_date;
		returning_date = "//*[@id='flight-returning-hp-flight']";
		driver.findElement(By.xpath(returning_date)).click();
		returning_date = "//div/table/caption[text()='Dec 2017']//following::tbody/tr[5]/td[7]/button";
		/*
		 * //div/table/caption[text()='Jan 2018']//following::tbody/tr[5]/td[2]/button
		 */
		//returning_date ="//div/table/caption[text()='Jan 2018']//following::tbody/tr[5]/td[4]/button";
		driver.findElement(By.xpath(returning_date)).click();
		
		//Selecting the no.of adults
		String adult;
		adult = "//*[@id='flight-adults-hp-flight']";
		Select Adult = new Select(driver.findElement(By.xpath(adult)));
		//Adult.selectByIndex(2);
		//Adult.selectByValue("4");
		Adult.selectByVisibleText("1");
		//Adult.s
		
		
		//Select the no.of children
		String children;
		children = "//*[@id='flight-children-hp-flight']";
		Select child = new Select(driver.findElement(By.xpath(children)));
		child.selectByIndex(5);
		String child_count1 = child.getFirstSelectedOption().getText();
		child_count = Integer.parseInt(child_count1);
		System.out.println(child_count);
		//System.out.println(child.selectByIndex(0));
		
		
		//Selection of kids Age..	
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			if(child_count> 0)
			{
			int i=1;
			String kids_age = null;
			for(i=1;i<=child_count;i++)
			{
			
			if(i == 1){
				kids_age ="//*[@id='flight-age-select-1-hp-flight']";
				Select age = new Select(driver.findElement(By.xpath(kids_age)));
				age.selectByIndex(10);
				
			}
			if(i ==2)
			{
				kids_age ="//*[@id='flight-age-select-2-hp-flight']";
				Select age = new Select(driver.findElement(By.xpath(kids_age)));
				age.selectByIndex(5);
				
			}
			if(i == 3)
			{
				kids_age= "//*[@id='flight-age-select-3-hp-flight']";
				Select age = new Select(driver.findElement(By.xpath(kids_age)));
				age.selectByIndex(3);
				
			}
		if(i == 4)
		{
				kids_age ="//*[@id='flight-age-select-4-hp-flight']";
				Select age = new Select(driver.findElement(By.xpath(kids_age)));
				age.selectByIndex(10);
				
		}		
		if(i == 5)
		{
				kids_age ="//*[@id='flight-age-select-5-hp-flight']";
				Select age = new Select(driver.findElement(By.xpath(kids_age)));
				age.selectByIndex(7);
				
		}
		
			if(i == 6)
			{
				kids_age ="//*[@id='flight-age-select-6-hp-flight']";
				Select age = new Select(driver.findElement(By.xpath(kids_age)));
				age.selectByIndex(13);
				
				
			}
			}
			
			}
		
		
		
		//selecting the car
		String car;
		car = "//*[@id='flight-add-car-checkbox-hp-flight']";
		driver.findElement(By.xpath(car)).click();
		
		//Click on the submit button for search
		String search;
		search = "//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button";
		driver.findElement(By.xpath(search)).click();
		
		
		/* Got a Problem in submit button because i used the span element*/
		
		

	}

}
