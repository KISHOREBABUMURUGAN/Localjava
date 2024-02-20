package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class flights {
static WebDriver driver;
  public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.linkText("Flights")).click();

WebElement radiobutton1=driver.findElement(By.cssSelector("input[value='roundtrip']"));
radiobutton1.click();
Thread.sleep(2000);

WebElement radiobutton2=driver.findElement(By.cssSelector("input[value='oneway']"));
radiobutton2.click();
Thread.sleep(2000);

radiobutton1.click();
Thread.sleep(1000);

WebElement passenger= driver.findElement(By.name("passCount"));
Select p=new Select(passenger);
p.selectByIndex(2);	

WebElement depart= driver.findElement(By.name("fromPort"));
Select dep=new Select(depart);
dep.selectByVisibleText("London");	
	
	
WebElement month = driver.findElement(By.name("fromMonth"));
Select mon=new Select(month);
mon.selectByVisibleText("March");	

WebElement day= driver.findElement(By.name("fromDay"));
Select d=new Select(day);
d.selectByIndex(18);

WebElement arrive= driver.findElement(By.name("toPort"));
Select arr=new Select(arrive);
arr.selectByValue("New York");	

WebElement month2 = driver.findElement(By.name("toMonth"));
Select m=new Select(month2);
m.selectByVisibleText("April");	

WebElement day2= driver.findElement(By.name("toDay"));
Select m2=new Select(day2);
m2.selectByIndex(15);

WebElement service=driver.findElement(By.cssSelector("input[value='Coach']"));
service.click();
Thread.sleep(1000);

WebElement bussiness=driver.findElement(By.cssSelector("input[value='Business']"));
bussiness.click();
Thread.sleep(1000);

WebElement firstclass=driver.findElement(By.cssSelector("input[value='First']"));
firstclass.click();
Thread.sleep(2000);

WebElement airlines= driver.findElement(By.name("airline"));
Select air=new Select(airlines);
air.selectByIndex(2);

Thread.sleep(2000);

driver.findElement(By.name("findFlights")).click();



	}
}

