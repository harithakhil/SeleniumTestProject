//Get the tagname, attribute, class, and CSS value of the Home tab.
package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		System.out.println("tagname= "+home.getTagName());
		System.out.println("attribute value= "+home.getAttribute("href"));
		System.out.println("css value= "+home.getCssValue("font-size"));
	}

}
