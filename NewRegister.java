package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewRegister {
 
  WebDriver driver;
  @Test(priority=2)
  public void f1() {
	  driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
	  
  }
  
  @Test(priority=3)
  public void register()
  {
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
	  WebElement ssn=driver.findElement(By.id("customer.ssn"));
	  ssn.sendKeys("987");
	  WebElement username=driver.findElement(By.id("customer.username"));
	  username.sendKeys("ankitha");
	  WebElement password=driver.findElement(By.id("customer.password"));
	  password.sendKeys("ankitha");
	  WebElement confirm=driver.findElement(By.id("repeatedPassword"));
	  confirm.sendKeys("ankitha");
	  WebElement register=driver.findElement(By.xpath("//input[@value=\"Register\"]"));
	  register.click();
	  
	  String Rtitle=driver.getTitle();
	  String RActualTitle="ParaBank | Register for Free Online Account Access";
	  if(Rtitle.equalsIgnoreCase(RActualTitle))
	  {
		  System.out.println("Customer created successfully");
	  }
	  else
	  {
		  System.out.println("Customer is not created");
	  }
	  
  }
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
}
