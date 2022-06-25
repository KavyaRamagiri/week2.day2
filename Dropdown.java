package week2.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//navigate to webpage 
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//maximize the window
		driver.manage().window().maximize();
		//mention wait time
		Thread.sleep(3000);
		//get the title name of the page
		System.out.println("The title is " + driver.getTitle());
		//check if title is correct
		if (driver.getTitle().contains("Drop downs")) {
			System.out.println("I confirm the title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		System.out.println("the current url is " +driver.getCurrentUrl());
		//select using Index
		WebElement element = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select ob=new Select(element);
		ob.selectByIndex(1);
		//select using VisibleText
		WebElement element1 = driver.findElement(By.name("dropdown2"));
		Select ob1=new Select(element1);
		ob1.selectByVisibleText("Selenium");
		//select using Value
		WebElement element2 = driver.findElement(By.name("dropdown3"));
		Select ob2=new Select(element2);
		ob2.selectByValue("1");
		//get number of dropdown options
		Select select=new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		List<WebElement>options=select.getOptions();
		for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
		}
		System.out.println(options.size());	
		//select using send Keys
		driver.findElement(By.xpath("//div[5]//select[1]")).sendKeys("Selenium");
		//select the program
		driver.findElement(By.xpath("//div[6]/select/option[2]")).click();
	}
}


