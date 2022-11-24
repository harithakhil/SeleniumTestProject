/* Navigate to Table page. Click on Table sort and search. 
 * Search name as "Dai Rios" in the search box. 
 * Then very the searched name is display or not.*/
package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSearchBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\eclipse-workspace\\selenium_basics\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement clickTableTab=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		clickTableTab.click();
		WebElement clickSortSearch=driver.findElement(By.xpath("//a[contains(text(),'Table Sort And Search')]"));
		clickSortSearch.click();
		WebElement clickSearch=driver.findElement(By.xpath("//input[@type='search']"));
		clickSearch.sendKeys("Dai Rios");
		WebElement verifySearchValue=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[1]"));
		System.out.println(verifySearchValue.isDisplayed());

	}

}
