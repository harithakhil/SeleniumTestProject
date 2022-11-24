/*Url "https://demo.guru99.com/test/delete_customer.php".  
 *Apply alertsPresent() expectedCondition. 
 *Then dismiss the alert.*/
package assignment.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPresent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().refresh();
		WebElement customerId=driver.findElement(By.name("cusid"));
		customerId.sendKeys("1123");
		WebElement submitButton=driver.findElement(By.name("submit"));
		submitButton.click();
		WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert =webDriverWait.until(ExpectedConditions.alertIsPresent());
		if(alert!=null) {
		String alertMsg=alert.getText();
		System.out.println(alertMsg);
		}
		driver.switchTo().alert().dismiss();
	}

}
