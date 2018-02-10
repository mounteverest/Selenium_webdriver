package customize_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String url;
		//url = "https://www.google.com/gmail/about/";
		url="https://accounts.google.com/SignUp?";
		driver.get(url);
		driver.manage().window().maximize();
		//String find_gmail = "//a[text()='Create an account']";
		//driver.findElement(By.xpath(find_gmail)).click();
		driver.findElement(By.id("FirstName")).sendKeys("abcdef");
		String last_name;
		last_name = "//input[@id='FirstName']//following::input[1]";
		driver.findElement(By.xpath(last_name)).sendKeys("zyxwvut");
		String user_name;
		user_name = "//input[starts-with(@id,'Gmail')]";
		driver.findElement(By.xpath(user_name)).sendKeys("xxxxxxxxxxxx123@gmail.com");
		//<input id="Passwd" name="Passwd" type="password"/>
		String passwd;
		passwd = "//input[contains(@name,'Pass')]";
		driver.findElement(By.xpath(passwd)).sendKeys("xxxxxxxx");
		//<input id="PasswdAgain" name="PasswdAgain" type="password"/>
		String agPassword;
		agPassword = "//input[@id='PasswdAgain' and @name='PasswdAgain']";
		driver.findElement(By.xpath(agPassword)).sendKeys("xxxxxxxx");
		//.//div[text()='Month'] .//div[@title='Birthday']/div[1]
		String bir_month;
		WebElement month = driver.findElement(By.xpath("//div[text()='Month'] "));
		month.click();
//		System.out.println(bir_month);
//		Select month = new Select(bir_month);
//		//month.selectByVisibleText("August");
//		month.selectByIndex(1);
    	bir_month = "//div[@id=':8']//div[1]";
    	driver.findElement(By.xpath(bir_month)).click();
		String day;
		day="//span[@id='birthday-placeholder' and text()='Day']";
		driver.findElement(By.xpath(day)).click();
		driver.findElement(By.xpath(day)).sendKeys("10");
		String year;
		year = "//*[@id='year-label']//span";
		driver.findElement(By.xpath(year)).click();
		driver.findElement(By.xpath(year)).sendKeys("1977");
		String sex = " //*[@id='Gender']/div[1]";
		driver.findElement(By.xpath(sex)).click();
		String gsex = "//*[@id=':e']/div";
		driver.findElement(By.xpath(gsex)).click();
		String ph_no;
		ph_no= "//input[@id='RecoveryPhoneNumber']";
		driver.findElement(By.xpath(ph_no)).click();
		driver.findElement(By.xpath(ph_no)).sendKeys("000-000-0000");
		String rec_email;
		rec_email = "//input[@id='RecoveryEmailAddress']";
		driver.findElement(By.xpath(rec_email)).sendKeys("bcdefgh@gmail.com");
		String country;
		country = "//div[@id='CountryCode']/div[1 ]/div[1] ";
		driver.findElement(By.xpath(country)).click();
		driver.findElement(By.xpath("//div[@id=':7d']/div[1]")).click();
		String submit;
		submit = "//*[@id='submitbutton' and @value='Next step']";
		driver.findElement(By.xpath(submit)).click();
		

	}

}
/*
Rose	Newman	rose.newman@gmail.com
Richard	Butler	richard.butler@gmail.com
Joshua	Alsop	joshua.alsop@gmail.com
Jack	Mathis	jack.mathis@gmail.com
Sam	Rutherford	sam.rutherford@gmail.com
Boris	Alsop	boris.alsop@gmail.com
Christian	Wilkins	christian.wilkins@gmail.com
Anthony	Bell	anthony.bell@gmail.com
Claire	Mitchell	claire.mitchell@gmail.com
Peter	Mitchell	peter.mitchell@gmail.com*/