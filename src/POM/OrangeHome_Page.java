package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHome_Page 
{
	@FindBy(xpath = "//span[.='PIM']")
	private WebElement pm;
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement ademp;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement fn;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement ln;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement svb;
	
	public OrangeHome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void PIM() {
		pm.click();
	}
	public void Addemployee() {
		ademp.click();
	}
	public void Firstname() {
		fn.sendKeys("Laxmi");
	}
	public void Lastname() {
		ln.sendKeys("laxmi@123");
	}
	public void Savebutton() {
		svb.click();
	}
	
	

}
