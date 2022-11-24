package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php\r\n");
		driver.manage().window().maximize();
		/*String currentUrl=driver.getCurrentUrl();
		System.out.println("Current Url: "+currentUrl);
		WebElement tableTab=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		tableTab.click();
		WebElement newyorkCell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[6]//td[3]"));
		boolean display=newyorkCell.isDisplayed();
		System.out.println(display);
		//driver.close();*/
		WebElement inputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement enterMsg=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMsg.sendKeys("Hai");
		WebElement showMsgBtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMsgBtn.click();
		WebElement yourMsg=driver.findElement(By.xpath("//div[contains(text(),'Your Message : Hai')]"));
		System.out.println(yourMsg.isDisplayed());
		String printMsg=yourMsg.getText();
		System.out.println(printMsg);
		
	}

}
