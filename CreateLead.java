package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to webpage 
		driver.get("http://leaftaps.com/opentaps/control/login");
		//find the elements and store in WebElement
		WebElement username = driver.findElement(By.id("username"));
		//enter value using sendKeys
		username.sendKeys("Demosalesmanager"); 
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement Loginbutton = driver.findElement(By.className("decorativeSubmit"));
		//perform click operation
		Loginbutton.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leads =driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createlead =driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Legato");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("kavya");
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("ramagiri");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Kvr");
		WebElement departname = driver.findElement(By.name("departmentName"));
		departname.sendKeys("XYZ");
		WebElement descriptionBox = driver.findElement(By.className("inputBox"));
		descriptionBox.sendKeys("NA123@kvr");
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("rkavya19123@gmail.com");
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//create object for select class
		Select ob=new Select(province);
		ob.selectByVisibleText("New York");
		WebElement createld = driver.findElement(By.className("smallSubmit"));
		createld.click();
		//get the title name of the page
		System.out.println(driver.getTitle());
	}
}
