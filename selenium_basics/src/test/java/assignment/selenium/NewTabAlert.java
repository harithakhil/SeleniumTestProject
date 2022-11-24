/*Go to the url : "https://www.hyrtutorials.com/p/window-handles-practice.html". 
 *click on Open New Tab. print the title of the window. 
 *Click on the 1st Click me button under "Click the below button to display an alert box". 
 *print the text in the alert in to console then handle the alert. 
 *After that, switch back to the main window and close all browser windows.*/
package assignment.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement openNewTabBtn=driver.findElement(By.id("newTabBtn"));
		JavascriptExecutor jv=(JavascriptExecutor)driver;
		jv.executeScript("arguments[0].scrollIntoView();", openNewTabBtn);
		openNewTabBtn.click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window : "+parentWindow);
		
		Set<String> allChildWindows=driver.getWindowHandles();
		System.out.println("Child window : "+allChildWindows);
		
		Iterator<String> iterator=allChildWindows.iterator();
		while(iterator.hasNext()) {
			String childWindow=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				System.out.println("Window title : "+driver.getTitle());
				
				WebElement clickButton=driver.findElement(By.id("alertBox"));
				clickButton.click();
				String alertMsg=driver.switchTo().alert().getText();
				System.out.println("Alert Message : "+alertMsg);
				driver.switchTo().alert().accept();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();

	}

}
