package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
    
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
       driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5555");
       driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
       System.out.println(driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getAttribute("id"));
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
       driver.findElement(By.xpath("(//div[@class='frameSectionBody'])[1]//a[contains(text(),'Find Leads')]")).click();

	}

}
