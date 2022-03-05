package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("priyanka123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9000453545");
		WebElement day=driver.findElement(By.xpath("//span[@class='_5k_4']//select[@id='day']"));
		Select date = new Select (day);
		date.selectByIndex(15);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select birthday_month=new Select(month);
		birthday_month.selectByVisibleText("A;;;pr");
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select birthday_year = new Select(year);
		birthday_year.selectByValue("1991");
		driver.findElement(By.xpath("//label[contains(text(),Female)]/following-sibling::input[1]")).click();
	}

}
