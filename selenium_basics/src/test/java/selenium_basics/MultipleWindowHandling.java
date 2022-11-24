package selenium_basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get parent window handle
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window handle= "+parentWindow);
		WebElement openNewWindowBtn=driver.findElement(By.id("newWindowBtn"));
		openNewWindowBtn.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement openNewTabBtn=driver.findElement(By.id("newTabBtn"));
		js.executeScript("arguments[0].scrollIntoView();", openNewTabBtn);
		openNewTabBtn.click();
		
		//get child window handle
		Set<String> allChildWindows=driver.getWindowHandles();
		System.out.println("All child window handles= "+allChildWindows);
		
		//navigate to child window
		Iterator<String> iterator=allChildWindows.iterator();
		while(iterator.hasNext()) {
			
			String childWindow=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				//child window operations
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				System.out.println("child window url= "+driver.getCurrentUrl());
				driver.close();
			}
			
		
		
		
			String childWindow2=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow2)) {
				driver.switchTo().window(childWindow2);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			
		}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window url= "+driver.getCurrentUrl());
		System.out.println("parent window title= "+driver.getTitle());
		driver.quit();

	}

}
