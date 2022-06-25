package week2.day2.assignments;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//navigate to webpage
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//maximize the window
		driver.manage().window().maximize();
		//mention wait time
		Thread.sleep(2000);
		//get the title name of the page
		System.out.println("The title is " + driver.getTitle());
		//check if title is correct
		if (driver.getTitle().contains("Radio")) {
			System.out.println("I confirm the title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		//get the current Url
		System.out.println("the current url is " +driver.getCurrentUrl());
		//Select the language java from webpage
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//Confirm Selenium is checked
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());
		//DeSelect only checked
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		//Select all checkboxes from webpage
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
	
	}
}
