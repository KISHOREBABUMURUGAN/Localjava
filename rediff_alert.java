package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediff_alert {
	Alert al;
 static WebDriver driver;
 @BeforeTest
     public void launchbrowser() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 driver.navigate().to("https://www.rediff.com/");
    	 
    	 driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.findElement(By.linkText("Sign in")).click();
 		String title=driver.getTitle();
 		System.out.println(title);
 		Assert.assertEquals("Rediffmail", title);
 		System.out.println("=======Title are same========");
     }
 @Test(priority=1)
 public void username_alert() throws InterruptedException {
	 driver.findElement(By.name("proceed")).click();
	 Thread.sleep(2000);
	 al=driver.switchTo().alert();
	 String actualmessage=al.getText();
	 System.out.println(actualmessage);
	 String expectedmessage="Please enter a valid user name";
	 System.out.println(expectedmessage);
	 Assert.assertEquals(expectedmessage,actualmessage);
	 System.out.println("=======same as expected message=========>>");
	 al.accept();
	 
 }
 @Test(priority=2)
 public void password_alert() throws InterruptedException {
	 
	 driver.findElement(By.id("login1")).sendKeys("kishore");
	 Thread.sleep(2000);
	 driver.findElement(By.name("proceed")).click();
	 al=driver.switchTo().alert();
	 String actmes=al.getText();
	 System.out.println(actmes);
	 String expmes="Please enter your password";
	 System.out.println(expmes);
	 Assert.assertEquals(actmes,expmes);
	 System.out.println("=======same as expected message for password=========>>");
	 al.accept();
	 Thread.sleep(3000);
 }
 @Test(priority=3)
 public void invalid_credentials_alert() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@id=\"login1\"]")).clear();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("mkishorebabungl@gmail.com");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mkb@2000");
	 driver.findElement(By.name("proceed")).click();
	 String actual=driver.findElement(By.xpath("//*[@id=\'div_login_error\']/b")).getText();
	 String expected="Wrong username and password combination.";
	 Assert.assertEquals(actual,expected);
	 System.out.println("The messages are same===>");
	
	 
	 
 }
 @AfterTest
 public void closebrowser() {
	 driver.close();
 }
}
