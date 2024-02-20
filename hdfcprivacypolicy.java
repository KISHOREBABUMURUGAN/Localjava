package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hdfcprivacypolicy {
	static WebDriver driver;
	@BeforeTest
	public void launchwebsite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		}
	@Test(priority=1)
	public void privacypolicy() throws InterruptedException {
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/a")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		boolean isdisplayed=driver.findElement(By.linkText("Privacy Policy")).isDisplayed();
		System.out.println(isdisplayed);
		boolean isenable=driver.findElement(By.linkText("Privacy Policy")).isEnabled();
		System.out.println(isenable);
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
}
