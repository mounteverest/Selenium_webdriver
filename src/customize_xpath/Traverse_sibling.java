package customize_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traverse_sibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "http://www.qaclickacademy.com/interview.php";
		//<li id="tablist1-tab1" class="responsive-tabs__list__item responsive-tabs__list__item--active" 
		//aria-controls="tablist1-panel1" role="tab" tabindex="0"> Appium </li>
		driver.get(url);
		String appium = "//ul[@class ='responsive-tabs__list']/li[1]";
		driver.findElement(By.xpath(appium)).click();
		String selenium = "//ul[@class ='responsive-tabs__list']/li[1]//following::li[1]";
		driver.findElement(By.xpath(selenium)).click();
		String soapui,testing;
		soapui = "//ul[@class ='responsive-tabs__list']/li[1]//following::li[2]";
		testing = "//ul[@class ='responsive-tabs__list']/li[1]//following::li[3]";
		driver.findElement(By.xpath(soapui)).click();
		driver.findElement(By.xpath(testing)).click();
		

	}

}
