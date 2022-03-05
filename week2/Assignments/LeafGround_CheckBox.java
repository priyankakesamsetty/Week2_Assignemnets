package week2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Select  checkbox
		
		driver.findElement(By.xpath("(//div/input)[1]")).click();
		driver.findElement(By.xpath("(//div/input)[2]")).click();
		
		//Verify whther checbox is selected
		boolean checkbox=driver.findElement(By.xpath("(//div/input)[7]")).isSelected();
		if(checkbox)
		{
		System.out.println("CHeckbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
        //deselect selected checkbox
		driver.findElement(By.xpath("(//div/input)[8]")).click();
		
		List<WebElement> Checkboxes= driver.findElements(By.xpath("//div/input"));
		
		for(int i=1;i<Checkboxes.size();i++)
		{
			if(Checkboxes.get(i).isSelected())
			{
			Checkboxes.get(i).click();
			System.out.println("Deselected");
			}
	}
	}
}

