package PageObjectiveModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Learning.TestCase_1;

public class LoginPage {
	
//Abstraction concept is used in Testcase_1.java
	public WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
 PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"username\"]") 
 WebElement Username;
@FindBy(xpath="//*[@id=\"password\"]")
 WebElement Password;
@FindBy(id="login")
 WebElement Login;

public void enterusername(String un) {
	Username.sendKeys(un);
	
}
public void enterpassword(String pwd) {
	Password.sendKeys(pwd);

}
public void clickonlogin() {
	Login.click();
}
}
