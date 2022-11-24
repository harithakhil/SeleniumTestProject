package my.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String currentUrl=driver.getCurrentUrl();
		System.out.println("current url : "+currentUrl);
		String title=driver.getTitle();
		System.out.println("title : "+title);
		String pageSource=driver.getPageSource();
		System.out.println("page source : "+pageSource);
		driver.close();
		driver.quit();

	}

}
