package my.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement customerId=driver.findElement(By.name("cusid"));
		customerId.sendKeys("1123");
		WebElement submitButton=driver.findElement(By.name("submit"));
		submitButton.click();
		
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		
		String alert1=driver.switchTo().alert().getText();
		System.out.println(alert1);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.quit();
		

	}

}
