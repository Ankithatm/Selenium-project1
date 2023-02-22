package ECAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BillPay {
	WebDriver driver;
  @Test(priority=2)
  public void get() throws InterruptedException {
	  
	  WebElement Bpay=driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]"));
	  Bpay.click();
	  
	  Thread.sleep(1000);
	  
	  String title=driver.getTitle();
	  String ActualTitle="ParaBank | Bill Pay";
	  if(title.equalsIgnoreCase(ActualTitle))
	  {
		  System.out.println("bill payment page is verified");
		 
	  }
	  else
	  {
		  System.out.println("bill payment Page is not verified");
	  }
	  WebElement payee=driver.findElement(By.name("payee.name"));
	  payee.sendKeys("Sashi");
	  WebElement address=driver.findElement(By.name("payee.address.street"));
	  address.sendKeys("Bangalore");
	  WebElement city=driver.findElement(By.name("payee.address.city"));
	  city.sendKeys("JP nagar");
	  WebElement state=driver.findElement(By.name("payee.address.state"));
	  state.sendKeys("Karnataka");
	  WebElement zipcode=driver.findElement(By.name("payee.address.zipCode"));
	  zipcode.sendKeys("563002");
	  WebElement phone=driver.findElement(By.name("payee.phoneNumber"));
	  phone.sendKeys("9878909876");
	  WebElement account=driver.findElement(By.name("payee.accountNumber"));
	  account.sendKeys("87902");
	  WebElement verify=driver.findElement(By.name("verifyAccount"));
	  verify.sendKeys("87902");
	  WebElement amount=driver.findElement(By.name("amount"));
	  amount.sendKeys("9000");
	  WebElement fromaccount=driver.findElement(By.xpath("//option[@value=\"19782\"]"));
	  fromaccount.sendKeys("19782");
	  WebElement payment=driver.findElement(By.xpath("//input[@value=\"Send Payment\"]"));
	  payment.click();
	  Thread.sleep(1000);
	 
	  boolean display=driver.findElement(By.xpath("//h1[contains(text(),'Bill Payment Complete')]")).isDisplayed();
	  
	  System.out.println("Bill payed :"+display);
	  
  }
  @Test(priority=0)
  public void f1() {
	  
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
}

@Test(priority=3)
public void close()
{
	driver.close();
}
}
