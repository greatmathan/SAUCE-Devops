package sauce_demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Sauce {
	public static void main(String[]args) {
		// Launch the EDge Browser
		EdgeDriver Driver=new EdgeDriver();
		//Lauch the Websites
		Driver.get("https://www.saucedemo.com/");
		//website maximize
		Driver.manage().window().maximize();

		Driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Driver.findElement(By.id("password")).sendKeys("secret_sauce");

		
		String Title=Driver.getTitle();
		System.out.println("Title: " + Title);
	
		Driver.findElement(By.id("login-button")).submit();

		

	}


}
