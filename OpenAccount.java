package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAccount {
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
    WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("ankitha");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("ankitha");
	  WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	  login.click();
   WebElement open=driver.findElement(By.linkText("Open New Account"));
    open.click();
}
  @Test(priority=2)
  public void openAccount()
  
  {
	  WebElement type=driver.findElement(By.id("type"));
	  Select drop=new Select(type);
	  drop.selectByValue("1");
	  
	  WebElement account=driver.findElement(By.id("fromAccountId"));
      Select drop1=new Select(account);
      drop1.selectByValue("14898");
	  WebElement open=driver.findElement(By.xpath("//input[@value=\"Open New Account\"]"));
	  open.click();
	  
  }
  @Test(priority=3)
  public void close()
  {
	  driver.close();
  }
  
}
