package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFramesHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iFrame=driver.findElement(By.id("a077aa5e"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", iFrame);
		
		//to switch to frame
		driver.switchTo().frame(iFrame);
		WebElement iFrameImage=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		iFrameImage.click();
		
		//switch to main page
		driver.switchTo().parentFrame();
		//or
		//driver.switchTo().defaultContent();//this also swich back to parent or main page
		WebElement emailId=driver.findElement(By.id("philadelphia-field-email"));
		emailId.sendKeys("abc123@gmail.com");

	}

}
