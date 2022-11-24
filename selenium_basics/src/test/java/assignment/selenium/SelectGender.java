/*Navigate to Input form page. Click on Radio buttons demo. 
 *Select gender as female, click on Show selected value, then print the getting message. 
 *And also very the female radio button is selected or not*/
package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectGender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();	
		WebElement clickInputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		clickInputForm.click();
		WebElement clickRadioButtonDemo=driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
		clickRadioButtonDemo.click();
		WebElement femaleCheckBox=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleCheckBox.click();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		WebElement showSelectedMsg=driver.findElement(By.xpath("//div[@id='message-one']"));
		String msg=showSelectedMsg.getText();
		System.out.println("printed message= "+msg);
		System.out.println("Radio Button enabled "+femaleCheckBox.isEnabled());
		

	}

}
