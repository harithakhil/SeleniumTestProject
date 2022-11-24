package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement customerId=driver.findElement(By.name("cusid"));
		WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		customerId=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusid")));
		customerId.sendKeys("1230");
		
		WebElement submitButton=driver.findElement(By.name("submit"));
		WebDriverWait webDriverWait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		//submitButton=webDriverWait1.until(ExpectedConditions.elementToBeClickable(By.name("submit")));//By locator
		submitButton=webDriverWait1.until(ExpectedConditions.elementToBeClickable(submitButton));//By web element
		submitButton.click();
	}

}
