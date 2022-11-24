package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions actions=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		actions.dragAndDrop(source, destination).build().perform();
		
		
	}

}
