package com.pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tricentis {
static WebDriver driver;
@BeforeTest
	public  void launchbrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);

	}
@Test(priority=1)
public void method() throws InterruptedException {
	driver.findElement(By.linkText("Register")).click();
	WebElement radio1=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
	radio1.click();	
	Thread.sleep(2000);
	WebElement radio2=driver.findElement(By.id("gender-female"));
	radio2.click();	
	driver.findElement(By.name("FirstName")).sendKeys("Kishore");
	driver.findElement(By.name("LastName")).sendKeys("Murugan");
	driver.findElement(By.id("Email")).sendKeys("kishorebabungl@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Mkb@2000");
	Thread.sleep(1000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Mkb@2000");
	driver.findElement(By.id("register-button")).click();
	
}
@Test(priority=2)
public void login() throws InterruptedException {
driver.findElement(By.linkText("Log in")).click();
Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("kishorebabungl@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Mkb@2000");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	Thread.sleep(1000);
	
}
@Test(priority=3)
public void searchorder() {
	driver.findElement(By.id("small-searchterms")).sendKeys("computer");
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
}
@Test(priority=4)
public void addcart() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
	driver.findElement(By.cssSelector("input[value='65']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value='52']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[value='91']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value='58']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[value='93']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value='94']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"addtocart_72_EnteredQuantity\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"addtocart_72_EnteredQuantity\"]")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.id("add-to-cart-button-72")).click();
	
	Thread.sleep(2000);
	
	
}
@Test(priority=5)
public void editcart() throws InterruptedException {
	driver.findElement(By.linkText("Shopping cart")).click();
	driver.findElement(By.name("removefromcart")).click();
	Thread.sleep(1000);
	
	WebElement count=driver.findElement(By.name("CountryId"));
	count.click();
	Select country=new Select(count);
	country.selectByIndex(5);
	Thread.sleep(2000);
	
	WebElement other=driver.findElement(By.name("StateProvinceId"));
	other.click();
	Select otherstate=new Select(other);
	otherstate.selectByIndex(0);
	Thread.sleep(1000);
	driver.findElement(By.name("ZipPostalCode")).clear();
	driver.findElement(By.name("ZipPostalCode")).sendKeys("500032");
	driver.findElement(By.name("estimateshipping")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("termsofservice")).click();
	driver.findElement(By.name("checkout")).click();
}
@Test(priority=6)
public void checkout() throws InterruptedException {
	/*driver.findElement(By.name("BillingNewAddress.Company")).sendKeys("Milton");
	Thread.sleep(1000);
	WebElement count=driver.findElement(By.name("BillingNewAddress.CountryId"));
	count.click();
	Select country=new Select(count);
	country.selectByIndex(5);
	Thread.sleep(2000);
	
	WebElement other=driver.findElement(By.name("BillingNewAddress.StateProvinceId"));
	other.click();
	Select otherstate=new Select(other);
	otherstate.selectByIndex(0);
	Thread.sleep(1000);
	
	driver.findElement(By.name("BillingNewAddress.City")).sendKeys("Gachibowli");
	driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("42/a vahayadi south cart street");
	driver.findElement(By.name("BillingNewAddress.Address2")).sendKeys("kottar,Nagercoil");
	driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("500032");
	driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("9585535422");
Thread.sleep(1000);*/
	driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
	driver.findElement(By.cssSelector("input[value='Next Day Air___Shipping.FixedRate']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value='2nd Day Air___Shipping.FixedRate']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value='Payments.CheckMoneyOrder']")).click();
	driver.findElement(By.cssSelector("input[value='Payments.CashOnDelivery']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
	Thread.sleep(1000);
	String message=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")).getText();
	System.out.println("verification : "+message);
	String message2=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")).getText();
	System.out.println("order id"+message2);
	
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
	
}
@AfterTest
public void quit() {
	driver.close();
}
}
