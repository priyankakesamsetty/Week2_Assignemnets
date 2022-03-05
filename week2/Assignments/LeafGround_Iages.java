package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Iages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		//**Click on the image*//
		driver.findElement(By.xpath("//label[contains(text(),'home page')]/following-sibling::img")).click();
		driver.navigate().back();
		//clickn on image with keyboard
		WebElement keyboardentry=driver.findElement(By.xpath("//label[contains(text(),'home')]/following-sibling::img"));
		Actions key = new Actions(driver);
		key.moveToElement(keyboardentry).click().build().perform();
		System.out.println("navigated to homepage");
		driver.navigate().back();

	}

}
