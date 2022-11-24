/*Go to the url : "https://www.hyrtutorials.com/p/window-handles-practice.html". 
 *click on Open New Window. 
 *Perform successful registration. 
 *Then verify the "Registration is Successful" text is displayed or not. 
 *Then switch back to the main window. Close all opened browser windows.*/
package assignment.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement openNewWindowBtn=driver.findElement(By.id("newWindowBtn"));
		JavascriptExecutor jv=(JavascriptExecutor)driver;
		jv.executeScript("arguments[0].scrollIntoView();", openNewWindowBtn);
		openNewWindowBtn.click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window : "+parentWindow);
		
		Set<String> allChildWindows=driver.getWindowHandles();
		System.out.println("Child window : "+allChildWindows);
		
		Iterator<String> iterator=allChildWindows.iterator();
		while(iterator.hasNext()) {
			String childWindow=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				
				WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
				firstName.sendKeys("Haritha");
				WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
				firstName.sendKeys("Akhil");
				WebElement genderFemale=driver.findElement(By.id("femalerb"));
				genderFemale.click();
				WebElement languageEnglish=driver.findElement(By.xpath("//input[@id='englishchbx']"));
				languageEnglish.click();
				WebElement languageHindi=driver.findElement(By.xpath("//input[@id='hindichbx']"));
				languageHindi.click();
				WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("harithakhil123@gmail.com");
				WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("haritha1994");
				WebElement register=driver.findElement(By.id("registerbtn"));
				register.click();
				WebElement registrationMsg=driver.findElement(By.xpath("//label[@id='msg']"));
				if(registrationMsg!=null) {
				String msg=registrationMsg.getText();
				System.out.println(msg);
				}
				else {
					System.out.println("Registration unsuccessfull");
				}
				
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();

	}

}
