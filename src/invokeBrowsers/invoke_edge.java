package invokeBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invoke_edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "c://MicrosoftWebDriver.exe");
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.google.com";
		driver.get(url);
		driver.findElement(By.className("gsfi")).sendKeys("guru99");
		int size = driver.findElements(By.tagName("input")).size();
		System.out.println(size);
		//driver.findElement(By.xpath("//input[@='Google search']")).click();
		//driver.findElement(By.cssSelector(".jsb>center>input[value='Google Search')").click();
		driver.findElement(By.name("btnK")).click();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
