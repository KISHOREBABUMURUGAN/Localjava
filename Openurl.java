
package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openurl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");
WebDriver drive=new ChromeDriver();
drive.get("https://chromedriver.storage.googleapis.com/index.html?path=113.0.5672.63/");
drive.manage().window().maximize();
Thread.sleep(2000);
System.out.println("IT BEEN ENTERED");
//drive.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
//WebDriverWait wait=new WebDriverWait(drive, 30);
//wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.name("name"))));
//boolean is=drive.findElement(By.xpath(null)).isDisplayed();
drive.close();

	}

}
