package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl,expectedtitle;
		baseurl = "https://www.facebook.com";
		expectedtitle = "Facebook - Log In or Sign Up";
		String actualtitle;
		driver.get(baseurl);
		actualtitle = driver.getTitle();
		if(actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Both the title are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		//driver.close();
		System.exit(0);
		}
		
		
	}

