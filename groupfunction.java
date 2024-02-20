package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class groupfunction {
@Test(groups= {"Murugan"})
public void retesting() {
	System.out.println("I am murugan");
}
@Test(groups= {"Murugan"})
public void retesting1() {
	System.out.println("I am murugan copied");
}
@Test(groups= {"sruti"})
public void regressiontesting() {
	System.out.println("I am kishore");
}
@Test(groups= {"babu"})
public void regressiontesting2() {
	System.out.println("I am babu");
}
@Test(groups= {"sruti"})
public void aditya() throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://jqueryui.com/droppable/");
	
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
@Test(groups= {"sruti"})
public void kichu() throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("KishoreBabu");
	driver.findElement(By.name("lastName")).sendKeys("Murugan");
	driver.findElement(By.name("phone")).sendKeys("9585535422");
	driver.findElement(By.name("userName")).sendKeys("mkishorebabungl@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("vahayadi south cart street");
	driver.findElement(By.name("city")).sendKeys("Hyderabad");
	driver.findElement(By.name("state")).sendKeys("Telangana");
	driver.findElement(By.name("postalCode")).sendKeys("500032");

	WebElement country=driver.findElement(By.name("country"));
	Select s1=new Select(country);
	s1.selectByValue("ALBANIA");
	Thread.sleep(2000);
	s1.selectByVisibleText("INDIA");
	driver.findElement(By.name("email")).sendKeys("mkishorebabungl@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Mkb@2000");
	driver.findElement(By.name("confirmPassword")).sendKeys("Mkb@2000");
	driver.findElement(By.name("submit")).click();
}
}
