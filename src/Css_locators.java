import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url;
		url = "https://login.salesforce.com/";
		driver.get(url);
		String username = "input[id='username']";
		driver.findElement(By.cssSelector(username)).sendKeys("ahahaha");
		String passwd;
		passwd = "input[id='password']";
		driver.findElement(By.cssSelector(passwd)).sendKeys("slkdjfsalkjfa");
		String login;
		login = "input[id='Login']";
		driver.findElement(By.cssSelector(login)).click();
		

	}

}
