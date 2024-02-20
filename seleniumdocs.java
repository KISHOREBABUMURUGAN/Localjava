package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumdocs {
	static WebDriver driver;
	@BeforeTest

	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void links() throws InterruptedException {
		//driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		System.out.println("click the selenium link");
		Thread.sleep(4000);
//		String text=driver.findElement(By.xpath("/html/body/main/div[1]/h1")).getText();
//		System.out.println("The text summary is  : "+text);
//		String text1="Package org.openqa.selenium";
//		Assert.assertEquals(text, text1);
		
		System.out.println("===same as text===>");
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		String pack=driver.findElement(By.xpath("/html/body/main/h2")).getText();
		System.out.println("The text summary is  : "+pack);
		String pack1="Packages";
		Assert.assertEquals(pack, pack1);
		
		System.out.println("===same as text package===>");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[1]/a/span")).click();
		Thread.sleep(1000);
		
		String inter=driver.findElement(By.xpath("/html/body/main/h2")).getText();
		System.out.println("The text summary is  : "+inter);
		String inter1="Interfaces";
		Assert.assertEquals(inter, inter1);
		
		System.out.println("===same as text interfaces===>");
		driver.switchTo().defaultContent();
		
		Thread.sleep(9000);
		
	}
	@AfterTest
	public void close() {
		driver.close();
		
	}
	
}
