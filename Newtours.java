package com.pack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
driver.manage().window().maximize();
Thread.sleep(1000);
Set<String> id=driver.getWindowHandles();
System.out.println("windows "+id.size());
Iterator<String >it=id.iterator();
String wind=it.next();
System.out.println(wind);

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
driver.close();
System.out.println("Sucessfull");

	}

}
