package com.pack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Freecrmcom {
static WebDriver driver;
static EdgeOptions options;
 



@BeforeTest
	public void launch() {
System.setProperty("webdriver.edge.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\msedgedriver.exe");
driver=new EdgeDriver();
driver.navigate().to("https://freecrm.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
}

@Test(priority=1)
public void login() {
	driver.findElement(By.xpath("//a[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")).click();
	driver.findElement(By.name("email")).sendKeys("mkishorebabungl@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Mkb@2000");
	driver.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]")).click();
	
	
	 
}
@Test(priority=2)
public void intocontact() throws Exception {
	Actions action=new Actions(driver);
	Thread.sleep(3000);
	WebElement move=driver.findElement(By.linkText("Contacts"));
	//move.click();
	WebElement plus=driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button"));
	//plus.click();
Thread.sleep(2000);
	action.moveToElement(move).click().moveToElement(plus).click().build().perform();
}

@Test(priority=3)
public void createpage() {
	Actions act=new Actions(driver);
	WebElement status =driver.findElement(By.name("status"));
	//status.click();
	WebElement active=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div[2]/div[4]"));
	act.moveToElement(status).click().moveToElement(active).click().build().perform();
	
}


@AfterTest
public void exit() {
	//driver.close();
	}


}
