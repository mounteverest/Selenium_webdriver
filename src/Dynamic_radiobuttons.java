import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_radiobuttons {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String url ="http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		//Automate Radio buttons Dynamically
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String first_radio_buttons;
		first_radio_buttons = "//td/input[@name ='group1']";
		int count = driver.findElements(By.xpath(first_radio_buttons)).size();
		System.out.println(count);
		//String radio_button;
		List <WebElement> radio_button = driver.findElements(By.xpath(first_radio_buttons));
//		String butter;
//		butter = "//input[@value='Butter']";
		
		for(int i=0;i<count;i++)
		{
			String dairy;
			dairy = radio_button.get(i).getAttribute("value");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println(dairy);
			//driver.findElement(By.xpath(drinks));
			if (dairy.contentEquals("Milk"))
			{
				radio_button.get(i).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println(radio_button.get(i).getAttribute(dairy));
				
			}
			
		}
		String Second_radio_button;
		Second_radio_button = "//td/input[@name = 'group2']";
		List<WebElement> radio_button1 = driver.findElements(By.xpath(Second_radio_button));
		int size1 = driver.findElements(By.xpath(Second_radio_button)).size();
		System.out.println("size1 ="+size1);
		for(int j =0;j<size1;j++)
		{
			String drinks;
			drinks = radio_button1.get(j).getAttribute("value");
			//System.out.println(drinks);
			
			if(drinks.contentEquals("Beer"))
			{
				radio_button1.get(j).click();
				//System.out.println(radio_button1.get(j).getAttribute("value"));
			}
		}
		
	}

}
