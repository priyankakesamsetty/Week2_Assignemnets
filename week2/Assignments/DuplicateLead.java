package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		/**--------- Launch Leaftaps uRL--------------- **/
		driver.get("http://leaftaps.com/opentaps/control/main");// TODO Auto-generated method stub
		
		/**------------Login with Credentials --------- **/
       WebElement name=  driver.findElement(By.id("username"));
       name.sendKeys("Demosalesmanager");
       WebElement password =driver.findElement(By.id("password"));
       password.sendKeys("crmsfa");
       WebElement login =driver.findElement(By.className("decorativeSubmit"));
       login.click();
       
       /**-------Enter Detail -------**/
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Find Lead")).click();

	}

}
