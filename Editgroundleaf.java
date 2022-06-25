package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editgroundleaf {

	public static void main(String[] args) throws InterruptedException {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//navigate to webpage
		driver.get("http://www.leafground.com/pages/Edit.html");
		//maximize the window
		driver.manage().window().maximize();
		//mention wait time
		Thread.sleep(2000);
		//get the title name of the page
		System.out.println("The title is " + driver.getTitle());
		//check if title is correct
		if (driver.getTitle().contains("Edit Fields")) {
			System.out.println("I confirm the title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		//Enter email address using send Keys
		driver.findElement(By.id("email")).sendKeys("rkavya19123@gmail.com");
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Apndcomplete" +Keys.TAB );
		//Get default text entered
		driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		//Clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		//Confirm that edit field is disabled
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
		//driver.close();
	}
}
