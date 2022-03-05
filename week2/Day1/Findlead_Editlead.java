package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findlead_Editlead {

	public static void main(String[] args) throws InterruptedException {
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
      // driver.findElement(By.xpath("//label[contains(text(),'First name']/following::input")).sendKeys("test");
       driver.findElement(By.xpath("//label[contains(text(),'First name')]/following::input[29]")).sendKeys("test");
       Thread.sleep(3000);
     driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
   //div[@class='x-grid3-cell-inner x-grid3-col-firstName']
     Thread.sleep(3000);
     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']")).click();
     System.out.println(driver.getTitle());
     driver.findElement(By.linkText("Edit")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("updateLeadForm_companyName")).clear();
     Thread.sleep(3000);
     WebElement updated_company = driver.findElement(By.id("updateLeadForm_companyName"));
     updated_company.sendKeys("Amazon");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
     //updated_company.getAttribute(null);
     Thread.sleep(3000);
     updated_company.getText();
     Thread.sleep(3000);
     driver.close();
     
     
	}

}
