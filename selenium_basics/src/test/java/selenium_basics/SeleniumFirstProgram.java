package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");//to hit url
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();//to maximize window
	//	driver.close();

	}

}
