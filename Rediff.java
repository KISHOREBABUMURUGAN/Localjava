package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.rediff.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(1000);
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Kishorebabumurugan");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("kishore00958");
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();

driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Mkb@");

driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Mkb@");

driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();

WebElement security =driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
Select sec=new Select(security);
sec.selectByIndex(2);

driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("Biriyani");

driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("Jeeva");





driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9585535422");

Thread.sleep(2000);

WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select date=new Select(day);
date.selectByIndex(11);

WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select mon=new Select(month);
mon.selectByIndex(4);

WebElement year =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
Select ye=new Select(year);
ye.selectByIndex(10);

Thread.sleep(1000);
driver.findElement(By.cssSelector("input[value='m']")).click();
Thread.sleep(1000);

driver.findElement(By.cssSelector("input[value='f']")).click();
Thread.sleep(2000);

WebElement country =driver.findElement(By.xpath("//*[@id=\"country\"]"));
Select cnt=new Select(country);
cnt.selectByIndex(10);

WebElement city =driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
Select c=new Select(city);
c.selectByIndex(10);




	}

}
