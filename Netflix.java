package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Netflix {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\msedgedriver.exe");
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.navigate().to("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("userLoginId")).sendKeys("mkishorebabungl@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mkb@2000");
		driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();	
		
		
		
		
	}

}
