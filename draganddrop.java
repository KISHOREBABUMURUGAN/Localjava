package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class draganddrop {
static WebDriver driver;
@BeforeTest

public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://jqueryui.com/droppable/");
}

@Test(priority=1)
public void draganddrop() throws InterruptedException {
	int numofframes=driver.findElements(By.tagName("iframe")).size();
	System.out.println(numofframes);
	WebDriverWait wait=new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"content\"]/iframe")));
	
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	
	String before_drop_message=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).getText();
	System.out.println("====>"+before_drop_message);
	Assert.assertEquals(before_drop_message, "Drag me to my target");
	System.out.println("The text are same==>");
	Thread.sleep(2000);
	
	
	
	Actions act=new Actions(driver);
	act.dragAndDrop(source, target).build().perform();
	
	
	String after_drop_message=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
	System.out.println("====>"+after_drop_message);
	Assert.assertEquals(after_drop_message, "Dropped!");
	System.out.println("The text are same==>");
	Thread.sleep(2000);
	
	
}
@AfterTest
public void closebrowser() {
	driver.close();
}
}
