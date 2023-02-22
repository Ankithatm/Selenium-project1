package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TransferFund {
	WebDriver driver;
  @Test
  public void f1() {
	  WebElement amount=driver.findElement(By.name("amount"));
	  amount.sendKeys("9000");
	  WebElement Faccount=driver.findElement(By.xpath("//select[@id='fromAccountId']"));
	  Select fname=new Select(Faccount);
	  fname.selectByValue("19782");
	 
	  WebElement Taccount=driver.findElement(By.xpath("//select[@id='toAccountId']"));
	  Select taccount=new Select(Taccount);
	  taccount.selectByValue("19782");
	  
	  WebElement transfer=driver.findElement(By.xpath("//input[@type='submit']"));
	  transfer.click();
	  
	  boolean text=driver.findElement(By.xpath("//h1[contains(text(),'Transfer Complete!')]")).isDisplayed();
	  
	  System.out.println("Transfer complete: "+text);
	 	  
  }
  @Test(priority=0)
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
}
@Test(priority=1)
public void launch() throws InterruptedException
{
	driver.get("https://parabank.parasoft.com/");
    driver.manage().window().maximize();
    WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("ankitha");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("ankitha");
	  WebElement login=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	  login.click();
	  WebElement transfer=driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]"));
	  transfer.click();
	  
	  Thread.sleep(1000);
}
}
