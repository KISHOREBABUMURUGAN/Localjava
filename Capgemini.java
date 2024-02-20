package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Capgemini {
	static WebDriver driver;
	static ChromeOptions options;
	
@BeforeTest
public void launch () {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
	String userprofile="C:\\Users\\KIMURUGA\\AppData\\Local\\Google\\Chrome\\User Data";
	options=new ChromeOptions();
	
	options.addArguments("--user-data-dir="+userprofile);
	options.addArguments("--profile-directory=Default");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	options.addArguments("--disable-popup-blocking");
	driver=new ChromeDriver(options);
	
}
@Test(priority=1)
public void solution() throws Exception {
	Actions act = new Actions(driver);
	driver.get("https://www.capgemini.com/in-en/");
	driver.manage().window().maximize();
//	driver.findElement(By.linkText("Allow all cookies")).click();
	Thread.sleep(1000);
	WebElement insight=driver.findElement(By.linkText("Insights"));
	WebElement direction=driver.findElement(By.xpath("//*[@id=\"menu-main-menu-1\"]/li[1]/div/div/nav/ul/li[1]/a/span/span"));
	System.out.println("The system move from the anchor position ");
	act.moveToElement(insight).click().moveToElement(direction).click().build().perform();
	System.out.println("Its click on the function");
	driver.findElement(By.xpath("//button[@class=\"header-search-button header-search-open\"]")).click();
	System.out.println("its click the search button");
	
}
@Test(priority=2)
public void action() throws Exception {
	Actions act=new Actions(driver);
	WebElement data= driver.findElement(By.id("keyword"));
	Thread.sleep(3000);
	 act.moveToElement(data).sendKeys("Cloud").sendKeys(Keys.ENTER).build().perform();
	 System.out.println("Enter the datas and find the solution");
}
@Test(priority=3)
public void drop() throws Exception {
	Thread.sleep(3000);
	WebElement m1= driver.findElement(By.id("Industry-large"));
	m1.click();
//	Select dr=new Select(dropdown);
//	dr.selectByIndex(1);
	
}
@AfterTest
public void close() {
//driver.close();	
}

}
