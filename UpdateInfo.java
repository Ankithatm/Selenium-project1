package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateInfo {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
			  driver.get("https://parabank.parasoft.com/");
			  driver.manage().window().maximize();
			  String title=driver.getTitle();
			  String ActualTitle="ParaBank | Welcome | Online Banking";
			  if(title.equalsIgnoreCase(ActualTitle))
			  {
				  System.out.println("Home page is verified");
				 
			  }
			  else
			  {
				  System.out.println("Page not verified");
			  
			  }
			  
			  WebElement username=driver.findElement(By.name("username"));
			  username.sendKeys("ankitha");
			  WebElement password=driver.findElement(By.name("password"));
			  password.sendKeys("ankitha");
			  WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
			  login.click();
	  

	  WebElement fname=driver.findElement(By.id("customer.firstName"));
	  fname.sendKeys("Sashi");
	  WebElement lname=driver.findElement(By.id("customer.lastName"));
	  lname.sendKeys("Kumar");
	  WebElement address=driver.findElement(By.id("customer.address.street"));
	  address.sendKeys("Bangalore");
	  WebElement city=driver.findElement(By.id("customer.address.city"));
	  city.sendKeys("JP nagar");
	  WebElement state=driver.findElement(By.id("customer.address.state"));
	  state.sendKeys("Karnataka");
	  WebElement zipcode=driver.findElement(By.id("customer.address.zipCode"));
	  zipcode.sendKeys("563002");
	  WebElement phone=driver.findElement(By.id("customer.phoneNumber"));
	  phone.sendKeys("9878909876");
	  
	  String Utitle=driver.getTitle();
	  String UActualTitle="ParaBank | Update Profile";
	  if(Utitle.equalsIgnoreCase(UActualTitle))
	  {
		  System.out.println("Profile updated");
		 
	  }
	  else
	  {
		  System.out.println("Profile is not updated");
	  }
  }

}
