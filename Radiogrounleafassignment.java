package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiogrounleafassignment {

	public static void main(String[] args) throws InterruptedException {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//navigate to webpage
		driver.get("http://www.leafground.com/pages/radio.html");
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
		//Are you enjoying the classes? -click on yes
		driver.findElement(By.id("yes")).click();
		//Find default selected radio button provided in webpage
		System.out.println(driver.findElement(By.xpath("//input[@name='news'][2]")).isEnabled());
		//Select your age group (Only if choice wasn't selected) provided in webpage
		System.out.println(driver.findElement(By.xpath("//input[@class='myradio'][2]")).isEnabled());
		
	}
	}


