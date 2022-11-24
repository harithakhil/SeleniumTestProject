//Get the size of the logo.
package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
		System.out.println("size of logo= "+logo.getSize());

	}

}
