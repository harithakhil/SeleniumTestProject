package my.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputFormTab.click();	
		
		WebElement selectInput=driver.findElement(By.xpath("//a[text()='Select Input']"));
		selectInput.click();
		
		WebElement selectDropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		selectDropDown.click();
		Select select=new Select(selectDropDown);
		select.selectByIndex(1);
		//Thread.sleep(1000);
		//select.deselectByIndex(1);
		
		/*select.selectByValue("Yellow");
		Thread.sleep(1000);
		select.deselectByValue("Yellow");
		
		select.selectByVisibleText("Green");
		select.deselectByVisibleText("Green");*/
	}

}
