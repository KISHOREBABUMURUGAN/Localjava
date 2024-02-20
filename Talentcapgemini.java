package com.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Scanner;
public class Talentcapgemini {
	static WebDriver driver;
static ChromeOptions options;
@BeforeTest

public void launchapplication() {
	
	System.out.println("launch the application");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
	String userprofile="C:\\\\Users\\\\KIMURUGA\\\\AppData\\\\Local\\\\Google\\\\Chrome\\\\User Data";
	options=new ChromeOptions();
	options.addArguments("--user-data-dir="+userprofile);
	options.addArguments("--profile-directory=Default");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	options.addArguments("--disable-popup-blocking");
	driver=new ChromeDriver();
	
	
}
@Test(priority=1)
public void function() throws Exception {
	Actions act=new Actions(driver);
	//Alert alert =driver.switchTo().alert();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
//	WebElement All=driver.findElement(By.id("megamenu-news"));
//	Thread.sleep(2000);
//	All.click();
	//WebElement wins=driver.findElement(By.xpath("//*[@id=\"in_megamenu-news_megamenu\"]/div/div[1]/div/ul/li/a[1]"));
	
	//Thread.sleep(2000);
	//act.moveToElement(All).click().moveToElement(wins).click().build().perform();
	
	//alert.accept();
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("ap_email")).sendKeys("mkishorebabungl@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys("mkb@2000");
	driver.findElement(By.xpath("//span[@class=\"a-button a-button-span12 a-button-primary auth-disable-button-on-submit\"]")).click();
//	System.out.println("Enter the otp : ");
//	Scanner sc=new Scanner (System.in);
//	int nums;
//	nums=sc.nextInt();
	
	
	
	
	
	
}
@AfterTest
public void close() {
	//driver.close();
}


}

