package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {
	WebDriver driver;
  @Test(priority=2)
  public void f1() {
	  WebElement fname=driver.findElement(By.id("firstName"));
	  fname.sendKeys("Sashi");
	  WebElement lname=driver.findElement(By.id("lastName"));
	  lname.sendKeys("Kumar");
	  WebElement address=driver.findElement(By.id("address.street"));
	  address.sendKeys("Bangalore");
	  WebElement city=driver.findElement(By.id("address.city"));
	  city.sendKeys("JP nagar");
	  WebElement state=driver.findElement(By.id("address.state"));
	  state.sendKeys("Karnataka");
	  WebElement zipcode=driver.findElement(By.id("address.zipCode"));
	  zipcode.sendKeys("563002");
	  WebElement ssn=driver.findElement(By.id("ssn"));
	  ssn.sendKeys("987");
	  WebElement a=driver.findElement(By.xpath("//input[@value=\"Find My Login Info\"]"));
	  a.click();
	  
  }
  @Test(priority=0)
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
}
@Test(priority=1)
public void launch()
{
  driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
  driver.manage().window().maximize();
}
@Test(priority=3)
public void close()
{
	driver.close();
}
}
