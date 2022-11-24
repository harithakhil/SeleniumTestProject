/* Launch the browser and up the url "https://selenium.obsqurazone.com/index.php". 
 * Refresh the page. 
 * Then apply explicit wait (visibilityOfElementLocated)*/
package assignment.selenium;

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
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().refresh();
		WebElement inputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		inputForm=webDriverWait.until(ExpectedConditions.visibilityOf(inputForm));
		inputForm.click();

	}

}
