package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	       driver.findElement(By.linkText("Create Lead")).click();
	       WebElement companyname=  driver.findElement(By.id("createLeadForm_companyName"));
	       companyname.sendKeys("TechM");
	       WebElement  forename=  driver.findElement(By.id("createLeadForm_firstName"));
	       forename.sendKeys("priyanka");
	       WebElement lastname=  driver.findElement(By.id("createLeadForm_lastName"));
	       lastname.sendKeys("123");
	       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("XYZ");
	       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	       WebElement Description = driver.findElement(By.id("createLeadForm_description"));
	       Description.sendKeys("Testlead");
	       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz.abc@gmail.com");
	       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	       
	       /***-------Select from dropwdown---------***/
	      WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	      State.click();
	      Select statedrpdown =new Select(State);
	      statedrpdown.selectByVisibleText("New York"); 
	      WebElement createlead=driver.findElement(By.className("smallSubmit"));
	       
	      /**------Create lead --------***/
	      createlead.click();
	      /**Gettitle of the page -----***/
	      System.out.println(driver.getTitle());
	      
	     /**------Edit lead------------**/
	      driver.findElement(By.linkText("Edit")).click();
	      WebElement Edit_Description=driver.findElement(By.id("updateLeadForm_description"));
	      Edit_Description.clear();
	 
        /**--------Import date feild----------**/
	      driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is updated data");
	      
	      /**---------update--------**/
	      driver.findElement(By.name("submitButton")).click();
	      
	      /**------------GetTitle---------**/
	      System.out.println(driver.getTitle());
		}

	}


