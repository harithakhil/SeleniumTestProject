//Q1. Print the title and url of the page in console.
package assignment.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/index.php");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	System.out.println("Current Url: "+url);
	System.out.println("Current Title: "+title);

	}

}
