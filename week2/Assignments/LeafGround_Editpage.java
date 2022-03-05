package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Editpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		//**Enter Email**//
		driver.findElement(By.id("email")).sendKeys("xyz.gmail.com");
		WebElement input = driver.findElement(By.xpath("//input[@value='Append ']"));
		input.sendKeys("testdata");
		input.sendKeys(Keys.LEFT);
		input.sendKeys(Keys.TAB);
		input.sendKeys("hello");
		input.sendKeys("second entry");
		input.sendKeys(Keys.SPACE);
		input.sendKeys("second entry");
		
		WebElement text= driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]/following::input")).getAttribute("disabled"));
        
		driver.close();
	}

}
