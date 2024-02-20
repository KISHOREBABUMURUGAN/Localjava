package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleopen {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\Downloads\\chromedriver-win64\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.google.com/");

        WebElement google_search_box= driver.findElement(By.name("q"));


google_search_box.sendKeys("selenium");


Thread.sleep(2000);


WebElement google_search_button=driver.findElement(By.name("btnK"));


boolean b1 = google_search_button.isDisplayed();


System.out.println("is google_search_button displayed ? ====>  " + b1);

boolean b2 = google_search_button.isEnabled();

System.out.println("is google_search_button enabled ? ====>  " + b2);


google_search_button.click();



String page_title_after_searching = driver.getTitle();


System.out.println("page title is ====> "+ page_title_after_searching);


String page_url_current = driver.getCurrentUrl();


System.out.println("current url is =======> " + page_url_current);


driver.close();

driver.quit();
	}

}
