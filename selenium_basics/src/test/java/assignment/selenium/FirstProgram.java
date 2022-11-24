/*Open the url : https://groceryapp.uniqassosiates.com/home in any browser. 
 *Then maximize the window. Navigate to the url "http://groceryapp.uniqassosiates.com/admin/login".
 * Then maximize , refresh and and close all opened browser windows .*/
package assignment.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.quit();
	}

}
