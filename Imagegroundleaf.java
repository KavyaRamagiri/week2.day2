package week2.day2.assignments;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Imagegroundleaf {

	public static void main(String[] args) throws IOException {
		//Launching chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to webpage
		driver.get("http://www.leafground.com/pages/Image.html");
		//get the title name of the page
		System.out.println(driver.getTitle());
		//check if title is correct
		if (driver.getTitle().contains("Images")) {
			System.out.println("I confirm the title is correct");
		}
		else 
		{
			System.out.println("the title is incorrect");
		}
		//Click on this image to go home page
			//System.out.println(driver.findElement(By.xpath("//img[@onclick=\"window.location='../home.html';\"]")).isDisplayed());
			//driver.findElement(By.xpath("//img[@onclick=\"window.location='../home.html';\"]")).click();
		//Check broken image 
		WebElement images = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")); 
		String imageSrc=images.getAttribute("src");
		try {
				URL url=new URL(imageSrc);
				URLConnection urlconnection = url.openConnection();
				HttpURLConnection httpURLConnection=(HttpURLConnection) urlconnection;
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();
				if(httpURLConnection.getResponseCode()==200) {
					System.out.println(imageSrc +">>"+httpURLConnection.getResponseCode()+">>"+httpURLConnection.getResponseMessage());
				}
				else 
				{
					System.err.println(imageSrc +">>"+httpURLConnection.getResponseCode()+">>"+httpURLConnection.getResponseMessage());
				}

				httpURLConnection.disconnect();
		} 
		catch (MalformedURLException e) {
				System.err.println(imageSrc);
			
		}	
		//Click me using Keyboard or Mouse
			driver.findElement(By.xpath("(//img[@onclick=\"window.location='../home.html';\"])[2]")).click();		
	}	
}	

