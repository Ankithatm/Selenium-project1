package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class logout {
	WebDriver driver;
  @Test(priority=0)
  public void f() {
	  driver.get("https://parabank.parasoft.com/");
	  driver.manage().window().maximize();
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("ankitha");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("ankitha");
	  WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	  login.click();
	}
  @Test(priority=1)
  public void log()
  {
	  WebElement s=driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
	  s.click();
	  System.out.println("User logged out sucessfully");
  }

	@Test(priority=3)
	public void close()
	{
		driver.close();
	
  }
}
