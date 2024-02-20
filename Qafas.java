package com.pack;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Qafas {
static WebDriver driver;
Actions act;
@BeforeTest
public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
	driver.navigate().to("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
}
@Test(priority=1)
public void qafox(){
	

WebElement components=	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a"));
WebElement monitor=	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a"));
 act=new Actions(driver);
act.moveToElement(components).click().moveToElement(monitor).click().build().perform();
WebElement test0=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]/a"));
act.moveToElement(test0).click().build().perform();
String actualtext=driver.findElement(By.xpath("//*[@id=\"content\"]/p")).getText();
System.out.println("The actual text message : "+actualtext);
String expectedtext="There are no products to list in this category.";
System.out.println("The expected text is : "+expectedtext);
Assert.assertEquals(actualtext, expectedtext);
System.out.println("<====The text are same====>");
driver.findElement(By.linkText("Continue")).click();
	
	
}
@Test(priority=2)
public void qafox2() {
	WebElement components=	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a"));
	WebElement printers=	driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[3]/a"));
	act=new Actions(driver);
	act.moveToElement(components).click().moveToElement(printers).click().build().perform();
	String actualtext=driver.findElement(By.xpath("//*[@id=\"content\"]/p")).getText();
	System.out.println("The actual text message : "+actualtext);
	String expectedtext="There are no products to list in this category.";
	System.out.println("The expected text is : "+expectedtext);
	Assert.assertEquals(actualtext, expectedtext);
	System.out.println("<====The text are same====>");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	
	
}

@AfterTest
public void closebrowser() {
	driver.close();
}
}
