package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php\r\n");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		dropDown.click();
		Select select=new Select(dropDown);
		//select.selectByIndex(1);
		//select.selectByValue("Yellow");
		select.selectByVisibleText("Green");
		

	}

}
