/*Navigate to Input form page. Click on Checkbook demo. 
Select the Check box one and Check box three. 
Verify them selected or not.*/
package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputFormPage {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/index.php");
			driver.manage().window().maximize();	
			WebElement clickInputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
			clickInputForm.click();
			WebElement clickCheckBoxDemo=driver.findElement(By.xpath("//a[contains(text(),'Checkbox Demo')]"));
			clickCheckBoxDemo.click();
			WebElement clickCheckBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
			clickCheckBoxOne.click();
			WebElement clickCheckBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
			clickCheckBoxThree.click();
			System.out.println("check box one "+clickCheckBoxOne.isEnabled());
			System.out.println("check box two "+clickCheckBoxThree.isEnabled());
			
			
			
			

	}

}
