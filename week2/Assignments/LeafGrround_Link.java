package week2.Assignments;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGrround_Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		//**Home page**..........//
		
	driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//a[1]")).click();
	driver.navigate().back();
	
	//88Find where without clicking
	String page=driver.findElement(By.xpath("//a[contains(text(),'Find where')]")).getAttribute("href");
	System.out.println("without clicking it navigates to" +page);
		
	//Interact with samelink
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//a[1]")).click();
		driver.navigate().back();
		
    //Count no of links 
		
		List<WebElement> countofurls = driver.findElements(By.xpath("//div[@class='large-6 small-12 columns']//a"));
		System.out.println("No of links in the page "+countofurls.size());
		
		
	}

}
