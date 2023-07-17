package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.credentials_reader.getReponame;

import java.io.IOException;
public class delete_repo_PO {
	
	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"settings-tab\"]")
	WebElement settings;
	
	@FindBy(xpath = "//*[@id=\"options_bucket\"]/div[9]/ul/li[4]/details/summary")
	WebElement delete_button;
	
	@FindBy(xpath = "(//input[@name='verify'])[2]")
	WebElement delete_txt;
	
	@FindBy(xpath = "(//button[contains(@class,'btn-danger btn')]//span)[3]")
	WebElement dele_statement;
	
	
	public delete_repo_PO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void navigate_to_deleteTAB() throws InterruptedException {
		settings.click();
		Thread.sleep(1000);
		delete_button.click();
		Thread.sleep(1000);
	}
	
	public void insert_rponame() throws IOException, InterruptedException {
		delete_txt.sendKeys("Archchaya98/"+getReponame());
		dele_statement.click();
		Thread.sleep(1000);
		
		driver.quit();		
		
		
	}
}
