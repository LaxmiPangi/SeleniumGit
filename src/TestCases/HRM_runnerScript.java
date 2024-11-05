package TestCases;

import org.testng.annotations.Test;

import GenericScripts.Base_Page;
import POM.Login;
import POM.OrangeHome_Page;

public class HRM_runnerScript extends Base_Page {
	@Test
	public void loginpage() throws Throwable {
		Login l=new Login(driver);
		l.username("Admin");
		Thread.sleep(2000);
		l.password("admin123");
		Thread.sleep(2000);
		l.loginbutton();
		OrangeHome_Page hm=new OrangeHome_Page(driver);
		hm.PIM();
		Thread.sleep(2000);
		hm.Addemployee();
		Thread.sleep(2000);
		hm.Firstname();
		Thread.sleep(2000);
		hm.Lastname();
		Thread.sleep(2000);
		hm.Savebutton();
		
	}

}
