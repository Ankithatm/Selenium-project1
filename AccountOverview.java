package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountOverview {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	WebDriver  driver= new ChromeDriver();
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
	  String title1=driver.getTitle();
	  String ActualTitle1="ParaBank | Accounts Overview";
	  if(title1.equalsIgnoreCase(ActualTitle1))
	  {
		  System.out.println("Login sucessfull");
		 
	  }
	  else
	  {
		  System.out.println("Login failed");
		  
	  }
	  WebElement overview=driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]"));
	  overview.click();
	  
	  boolean display=driver.findElement(By.xpath("//h1[contains(text(),'Accounts Overview')]")).isDisplayed();
	  
	  System.out.println(display);
  }
}
