package my.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputFormTab.click();		//click command
		Thread.sleep(2000);
		WebElement enterMsg=driver.findElement(By.id("single-input-field")) ;
		enterMsg.sendKeys("Hello");		//send keys command
		Thread.sleep(2000);
		WebElement showMsgBtn=driver.findElement(By.id("button-one"));
		showMsgBtn.click();
		Thread.sleep(2000);
		WebElement yourMsg=driver.findElement(By.id("button-one"));
		boolean display=yourMsg.isDisplayed();		//isDisplayed command
		System.out.println(display);
		Thread.sleep(2000);
		String msg=yourMsg.getText();				//getText command
		System.out.println("Your msg : "+msg);
		Thread.sleep(2000);
		String tag=yourMsg.getTagName();			//getTagName command
		System.out.println("your msg tag name : "+tag);
		Thread.sleep(2000);
		WebElement radioButtonDemo=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioButtonDemo.click();
		Thread.sleep(2000);
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radioButton.click();
		boolean radio=radioButton.isEnabled();		//isEnabled command
		System.out.println("radio button : "+radio);
		radioButton.isSelected();					//isSelected command

	}

}
