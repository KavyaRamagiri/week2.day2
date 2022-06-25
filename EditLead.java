package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		//perform click operation
		login.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Legato");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Kavya");
		WebElement lastnme = driver.findElement(By.id("createLeadForm_lastName"));
		lastnme.sendKeys("Ramagiri");
		WebElement lastnmelocl = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		lastnmelocl.sendKeys("Kvr");
		WebElement departnme = driver.findElement(By.name("departmentName"));
		departnme.sendKeys("LMS");
		WebElement descriptn = driver.findElement(By.id("createLeadForm_description"));
		descriptn.sendKeys("edit assignment");
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("rkavya19123@gmail.com");
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ob=new Select(province);
		//create object for select class
		ob.selectByVisibleText("New York");
		WebElement createled = driver.findElement(By.className("smallSubmit"));
		createled.click();
		WebElement editbtn = driver.findElement(By.xpath("//a[text()='Edit']"));
		editbtn.click();
		WebElement descclr = driver.findElement(By.id("updateLeadForm_description"));
		descclr.clear();
		WebElement impnote = driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
		impnote.click();
		//get the title name of the page
		System.out.println(driver.getTitle());
	}
}
