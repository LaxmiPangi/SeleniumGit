package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath = "//p[.='Monkey Luffy']")
	private WebElement drp;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement lg;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void dropdown() {
		drp.click();
	}
	public void logout() {
		lg.click();
	}
}

