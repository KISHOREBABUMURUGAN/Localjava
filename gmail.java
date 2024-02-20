package com.pack;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class gmail {
	static WebDriver driver;
	static ChromeOptions options;
@BeforeTest
public  void launch() {
	System.out.println("launching the browser"); 
	String userProfile= "C:\\Users\\KIMURUGA\\AppData\\Local\\Google\\Chrome\\User Data";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
//	ChromeOptions options=new ChromeOptions();
//	
//	options.addArguments("--user-data-dir="+userProfile);
//	options.addArguments("--profile-directory=Default");
//	options.addArguments("--start-maximized");
//	//options.addArguments("--disable-notifications");
//	options.addArguments("--disable-popup-blocking");
//
//	options.addArguments("--disable-notifications");
	//driver=new ChromeDriver(options);
	driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	
}
@Test(priority=1)
public void functions() throws Exception {
	driver.findElement(By.linkText("Gmail")).click();
	System.out.println("clicking the function");
Thread.sleep(3000);
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.name("identifier")).sendKeys("mkishorebabungl@gmail.com");
	driver.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click();
	
	String title;
	title= driver.getTitle();
	System.out.println("Getting the title"+title);
	String actualtext=driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText();
	System.out.println("actual text is here : "+actualtext);
	String Expectedtext=("Couldn’t sign you in");
	System.out.println("Expected text is here : "+Expectedtext);

	Assert.assertNotEquals(actualtext, Expectedtext);
	System.out.println("text are differ!");

	
}
@AfterTest
public void quit() {
	driver.close();
}
}
