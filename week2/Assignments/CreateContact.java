package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		  WebElement name=  driver.findElement(By.id("username"));
	       name.sendKeys("Demosalesmanager");
	       WebElement password =driver.findElement(By.id("password"));
	       password.sendKeys("crmsfa");
	       WebElement login =driver.findElement(By.className("decorativeSubmit"));
	       login.click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       //driver.manage().timeouts().implicitlyWait(200, null);
	       //driver.manage().timeouts().implicitlyWait(233);
	       new WebDriverWait(driver, Duration.ofSeconds(2000));
	      
	       //**   Create contacts**//
	       driver.findElement(By.linkText("Contacts")).click();
	       driver.findElement(By.linkText("Create Contact")).click();
	       driver.findElement(By.id("firstNameField")).sendKeys("Piryanka");
	       driver.findElement(By.id("lastNameField")).sendKeys("123");
	       driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("xyz");
	       driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("123");
	       driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("priyanka.123@gmail.com");
	      WebElement Description= driver.findElement(By.id("createContactForm_description"));
	       Description.sendKeys("This is for testing");
	       driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT testing");
	       WebElement state =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	      //**   dropdown**//
	       Select statedrpdown = new Select(state);
	       statedrpdown.selectByVisibleText("New York");
	       driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	       driver.findElement(By.linkText("Edit")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("updateContactForm_description")).clear();
	       driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Note :testing");
	       driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
	       driver.getTitle();
	}

}
