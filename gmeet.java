package com.pack;
import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class gmeet {
	static WebDriver driver;
	static ChromeOptions options;
	WebDriverWait wait;
@BeforeTest
public  void launch() {
	System.out.println("launching the browser"); 
	//String userProfile= "C:\\Users\\KIMURUGA\\AppData\\Local\\Google\\Chrome\\User Data";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
	//ChromeOptions options=new ChromeOptions();
	//wait=new WebDriverWait(driver, 30);
		
	//options.addArguments("--user-data-dir="+userProfile);
//	options.addArguments("--profile-directory=Default");
//	options.addArguments("--start-maximized");
//	//options.addArguments("--disable-notifications");
//	options.addArguments("--disable-popup-blocking");
//
//	options.addArguments("--disable-notifications");
	driver=new ChromeDriver();
	driver.navigate().to("https://meet.google.com/");
	driver.manage().window().maximize();
	
}
@Test(priority=1)
public void functions() throws Exception {
	driver.findElement(By.xpath("//button[@class=\"glue-button glue-button--high-emphasis  glue-button--icon \"]")).click();
	
	System.out.println("clicking the function");
Thread.sleep(1000);

driver.findElement(By.name("identifier")).sendKeys("mkishorebabungl@gmail.com");
driver.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click();

String title;
title= driver.getTitle();
System.out.println("Getting the title"+title);
Thread.sleep(1000);
String actualtext=driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText();
System.out.println("actual text is here : "+actualtext);
Thread.sleep(1000);
String Expectedtext=("Couldn’t sign you in");
System.out.println("Expected text is here : "+Expectedtext);
Thread.sleep(1000);
Assert.assertNotEquals(actualtext, Expectedtext);
System.out.println("text are differ!");
	
}
@AfterTest
public void quit() {
	driver.close();
}
}
