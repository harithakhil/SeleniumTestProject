/* Launch the browser and up the url(http://www.opesmount.in/grocerystore1/) 
 * Then navigate to the url (https://www.toolsqa.com/automation-practice-form/) 
 * Then navigate back to grocerystore Then navigate to automation practice form 
 * Then refresh the page Close all opened browser windows.*/
package assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back();
		driver.navigate().refresh();
		driver.quit();

	}

}
