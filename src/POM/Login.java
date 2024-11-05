package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usn;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pws;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void username(String un) {
		usn.sendKeys(un);
	}
	public void password(String pwd) {
		pws.sendKeys(pwd);
	}
	public void loginbutton() {
		btn.click();
	}
	

}
