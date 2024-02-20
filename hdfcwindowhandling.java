package com.pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hdfcwindowhandling {
 public  WebDriver driver;
  ChromeOptions options;
  @Test
  public void hdfc_window() throws Exception {
	  String userprofile="C:\\Users\\KIMURUGA\\AppData\\Local\\Google\\Chrome\\User Data";
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
	  options=new ChromeOptions();
	  options.addArguments("--user-data-dir="+userprofile);
	  options.addArguments("--profile-directory=Default");
	  options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
Thread.sleep(2000);
int total=driver.findElements(By.name("login_page")).size();
System.out.println("frame : "+total);
driver.switchTo().frame(0);
driver.findElement(By.linkText("Privacy Policy")).click();
Set<String> windid=driver.getWindowHandles();
//Set<String> win=new HashSet<String>();
//win=driver.getWindowHandles();
Iterator <String> id=windid.iterator();
System.out.println("Total windows - "+ windid.size());
String hdfc_window=id.next();
String privacypolicy_window=id.next();

System.out.println(hdfc_window);
System.out.println(privacypolicy_window);
driver.switchTo().window(privacypolicy_window);


driver.findElement(By.linkText("Personal")).click();
String str=driver.getTitle();
System.out.println(str);
Assert.assertEquals(str, "HDFC Bank – Personal Banking & Netbanking Services");
System.out.println("its text are equal");
driver.switchTo().window(hdfc_window);
driver.switchTo().frame("login_page");
driver.findElement(By.name("fldLoginUserId")).sendKeys("44434377");

driver.switchTo().window(privacypolicy_window);
driver.findElement(By.linkText("NRI")).click();
String str1=driver.getTitle();
System.out.println(str1);
driver.switchTo().window(hdfc_window);
driver.switchTo().frame("login_page");
driver.findElement(By.linkText("CONTINUE")).click();
// driver.findElement(By.xpath("//img[@alt='continue']")).click();
driver.findElement(By.name("fldPassword")).sendKeys("abcdefgh");
driver.findElement(By.name("chksecmod")).click();
}
}