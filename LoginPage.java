package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {
	
	WebDriver driver;
	@Test(priority=0)
	  public void f() {
		  
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
	}
  @Test(priority=1)
  public void launch()
  {
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
  }
  
  @Test(priority=2)
  public void logindetails()
  {
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("ankitha");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("ankitha");
	  WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	  login.click();
	  String title=driver.getTitle();
	  String ActualTitle="ParaBank | Accounts Overview";
	  if(title.equalsIgnoreCase(ActualTitle))
	  {
		  System.out.println("Login sucessfull");
		 
	  }
	  else
	  {
		  System.out.println("Login failed");
	  }
  }
  
  @Test(priority=4)
  public void afterMethod() {
	  
  driver.close();
  }

}