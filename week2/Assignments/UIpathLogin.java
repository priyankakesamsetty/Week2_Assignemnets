package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIpathLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//label[contains(text(),'Email:')]/following-sibling::input"))
		.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Password:')]/following-sibling::input"))
		.sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//button[@class='navbar-toggle']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();

	}

}
