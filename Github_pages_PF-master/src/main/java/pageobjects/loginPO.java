package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static utils.credentials_reader.getUsername;

import java.io.IOException;

import static utils.credentials_reader.getPassword;


public class loginPO {

	
public WebDriver driver;
	

	@FindBy(xpath = "//a[text()[normalize-space()='Sign in']]")
	WebElement Login;
	
	@FindBy(xpath = "//input[contains(@class,'form-control input-block js-login-field')]")
	WebElement Username;
	
	@FindBy(xpath = "//input[contains(@class,'form-control input-block js-password-field')]")
	WebElement Password;
	
	@FindBy(xpath ="//input[contains(@class,'btn btn-primary btn-block js-sign-in-button')]")
	WebElement Signin;
	
	public loginPO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void getGithubHomePage() {
		Login.click();
		
	}
	
	public void getUserHomePage() throws IOException, InterruptedException {
		
		Username.sendKeys(getUsername());
		Password.sendKeys(getPassword());
		Thread.sleep(2000);
		Signin.click();
	}
}
