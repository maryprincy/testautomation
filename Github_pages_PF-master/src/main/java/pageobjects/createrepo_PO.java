package pageobjects;

import static utils.credentials_reader.getReponame;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createrepo_PO {


	public WebDriver driver;

	@FindBy(xpath = "/html/body/div[1]/div[5]/div/aside/div/loading-context/div/div[1]/div/h2/a")
	WebElement New;
	
	@FindBy(xpath = "(//input[@class='form-control js-repo-name js-repo-name-auto-check short'])")
	WebElement Reponame;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement Public;
	
	@FindBy(xpath = "(//input[@class='js-toggle-new-repo-default-branch-info js-repo-readme'])")
	WebElement Add_readme;
	
	@FindBy(xpath = "//*[@id=\"new_repository\"]/div[5]/button")
	WebElement Create_repo;
	
	
	
	public createrepo_PO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void getNewWindow() {
		New.click();
	}
	
	public void insertRepoName() throws IOException, InterruptedException {
		Reponame.sendKeys(getReponame());
		Thread.sleep(1000);
	}
	
	public void publicRepo() {
		Public.click();
		
	}
	
	public void addReadme() throws InterruptedException {
			Add_readme.click();
			Thread.sleep(1000);
		}
	
	public void createNewRepo() throws InterruptedException {
		Thread.sleep(1000);
		Create_repo.click();
	}
	
}
