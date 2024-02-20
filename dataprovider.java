dpackage com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;

	@DataProvider(name = "sharmitha")

	public static Object[][] credentials() {

		return new Object[][] {
			{ "anjith", "password123" },
			{ "priyank", "password456" },
			{ "pavan", "password567" },

		};

	}

	@DataProvider(name="sabana")
	public static Object[][] logindata99(){
		return new Object[][]{
			{ "yamini", "password123" },
			{ "sanskruthi", "password456" },
			//{ "gaurav", "password567" },
		};
	}

	@DataProvider(name="darshini")
	public static Object[][] logindata991(){
		return new Object[][]{
			{ "swaraj", "password123" },
			{ "kavitha", "password456" },
			{ "siva", "password567" },
		};
	}

	//Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "darshini")

	public void invalid_login(String Username, String Password) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");

		//Create Browser object
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("login")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		String str2=  driver.getTitle();
		System.out.println(str2);
		//  Assert.assertEquals(str2,"Rediffmail" );
		//            
		//System.out.println("test passed");
		//            Assert.assertEquals(10, 10);
		//            System.out.println("9 is equal to 10 ");
		//            Assert.assertFalse(false);
		driver.quit();

}
	@Test(dataProvider = "sharmitha")
	public void invalid_login1(String Username, String Password) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIMURUGA\\eclipse-workspace\\Seleniumproject\\src\\jar\\chromedriver.exe");

		//Create Browser object
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("login")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		String str2=  driver.getTitle();
		System.out.println(str2);
		//  Assert.assertEquals(str2,"Rediffmail" );
		//            
		//System.out.println("test passed");
		//            Assert.assertEquals(10, 10);
		//            System.out.println("9 is equal to 10 ");
		//            Assert.assertFalse(false);
		driver.quit();

}
}
