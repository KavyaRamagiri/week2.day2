package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttongroundleaf {

	public static void main(String[] args) throws InterruptedException {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//navigate to webpage
		driver.get("http://www.leafground.com/pages/Button.html");
		//maximize the window
		driver.manage().window().maximize();
		//mention wait time
		Thread.sleep(2000);
		//get the title name of the page
		System.out.println("The title is " + driver.getTitle());
		//check if title is correct
		if (driver.getTitle().contains("Button")) {
			System.out.println("I confirm the title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		//check current URL
		System.out.println("the current url is " +driver.getCurrentUrl());	
		//Find position of button (x,y)
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation().getY());
		//Find button color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		//Find the height and width
		System.out.println(driver.findElement(By.id("size")).getSize());
		System.out.println(driver.findElement(By.id("size")).getSize().getWidth());
		System.out.println(driver.findElement(By.id("size")).getSize().getHeight());
		//Click button to travel home page
		driver.findElement(By.id("home")).click();

	}
}
