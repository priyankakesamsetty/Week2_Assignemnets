package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//**First Dropdwon**//
		
		WebElement drpdown1=driver.findElement(By.id("dropdown1"));
		drpdown1.click();
		Select FirstDropdown= new Select(drpdown1);
		FirstDropdown.selectByIndex(1);
		
		//Second Dropdown**//
		
		WebElement drpdown2= driver.findElement(By.xpath("//select[@name='dropdown2']"));
		drpdown2.click();
		Select SecondDropDown= new Select(drpdown2);
		SecondDropDown.selectByVisibleText("Appium");
		
		//ThirdDropdown**//
		
		WebElement drpdown3= driver.findElement(By.xpath("//select[@name='dropdown3']"));
		drpdown3.click();
		Select ThirdDropDown= new Select(drpdown3);
		ThirdDropDown.selectByValue("Selenium");
		
		//Fourth Dropdown*//
		
		WebElement dropdwn4=driver.findElement(By.xpath("//select[@class='dropdown']"));
		dropdwn4.click();
		System.out.println(dropdwn4.getSize());
		
		//Sendkeys??
		driver.findElement(By.xpath("//div[@id='contentblock']//select)[5])")).sendKeys("Selenium");
		
		WebElement Multidrpdwn =driver.findElement(By.xpath("//div[@id='contentblock']//select)[6]"));
        Select MultiDropDown= new Select(Multidrpdwn);
        MultiDropDown.selectByIndex(1);
        MultiDropDown.selectByValue("UFT/QTP");
	}

}
