package selenium_basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		/*js.executeScript("window.scrollBy(0,1000)");//scroll down
		Thread.sleep(5000);//execution stops for 5 seconds
		js.executeScript("window.scrollBy(0,-1000)");//scroll up
		
		WebElement allCoursesInclude=driver.findElement(By.xpath("//h2[contains(text(),'All Courses include')]"));
		js.executeScript("arguments[0].scrollIntoView();",allCoursesInclude);
		System.out.println(allCoursesInclude.getText());*/
		
		WebElement insuranceProject=driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		js.executeScript("arguments[0].click();",insuranceProject);//another method for clicking an element


		
		


	}

}
