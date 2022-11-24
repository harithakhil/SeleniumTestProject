package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAndMouseHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action=new Actions(driver);
		WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		//action.contextClick(inputFormTab).build().perform();	//build and perform used for compile and run the Actions class
		action.doubleClick(inputFormTab).build().perform();
		
		WebElement enterMsg=driver.findElement(By.id("single-input-field")) ;
		enterMsg.sendKeys("Hello");	
		WebElement showMsgBtn=driver.findElement(By.id("button-one"));
		action.sendKeys(showMsgBtn,Keys.ENTER).build().perform();
		
		enterMsg.clear();
		action.keyDown(Keys.SHIFT).build().perform();
		enterMsg.sendKeys("h");
		action.keyUp(Keys.SHIFT).build().perform();
		enterMsg.sendKeys("ello");
		
		
	}

}
