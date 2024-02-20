package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class redbus {
static WebDriver driver;
static WebDriverWait wait;
   @BeforeTest
   public void login() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe")   ;
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   
   }
   @Test(priority=1)
   public void signin() throws Exception {
	   driver.navigate().to("https://www.redbus.com/");
	   driver.findElement(By.xpath("//div[@class=\"rdc-login\"]")).click();
	   wait= new WebDriverWait(driver, 30);
	   
	   driver.findElement(By.xpath("//li[@id=\"signInLink\"]")).click();
	   Thread.sleep(2000);
	   WebElement modframe=driver.findElement(By.className("modalIframe"));
	   driver.switchTo().frame(modframe);
	   WebElement iframe=driver.findElement(By.tagName("iframe"));
	   driver.switchTo().frame(iframe);
	   driver.findElement(By.xpath("//span[@class=\"nsm7Bb-HzV7m-LgbsSe-BPrWId\"]")).click();

	   
   }
}
