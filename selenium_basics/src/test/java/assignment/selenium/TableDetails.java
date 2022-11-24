/*Navigate to Table page. Print the all details of the person "Tiger Nixon" in the console.*/
package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement clickTableTab=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		clickTableTab.click();
		WebElement findName=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[1]"));
		System.out.println("Name= "+findName.getText());
		WebElement findPosition=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[2]"));
		System.out.println("Position= "+findPosition.getText());
		WebElement findOffice=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[3]"));
		System.out.println("Office= "+findOffice.getText());
		WebElement findAge=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[4]"));
		System.out.println("Age= "+findAge.getText());
		WebElement findStartDate=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[5]"));
		System.out.println("Start Date= "+findStartDate.getText());
		WebElement findSalary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[6]"));
		System.out.println("Salary= "+findSalary.getText());
	}

}
