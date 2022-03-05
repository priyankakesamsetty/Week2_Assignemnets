package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//Checking homepage navgation
		driver.findElement(By.xpath("//button[@id='home']")).click();
		System.out.println("landed on homepage");
		driver.navigate().back();
		System.out.println("back to butteon page");
		
		//checking button position
		Point position =driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		int x= position.getX();
		int y =position.getY();
		System.out.println("X and Y corditnates are " +x +y);
		
		//checking color
		
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		
		
		//checking height and width
		
		WebElement buttonsize= driver.findElement(By.xpath("//button[@id='size']"));
		System.out.println(buttonsize.getSize().getHeight());
		System.out.println(buttonsize.getSize().getWidth());
		
		

	}

}
