package my.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.navigate().back();	//backward
		Thread.sleep(2000);
		driver.navigate().forward();	//forward
		Thread.sleep(2000);
		driver.navigate().refresh();	//refresh
		driver.quit();
		

	}

}
