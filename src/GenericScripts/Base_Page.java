package GenericScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.Logout;

public class Base_Page 
{
	public WebDriver driver;
	   @BeforeMethod
	   public void openApplication()
	   {
		   System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
	   }
	   @AfterMethod
	   public void closeApplication() throws Throwable
	   {
		   Logout l=new Logout(driver);
		   l.dropdown();
		   Thread.sleep(2000);
		   l.logout();
		   driver.close();
	   }
}


