package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.createrepo_PO;
import pageobjects.delete_repo_PO;
import pageobjects.loginPO;

public class login_steps {
	
	public WebDriver driver;
	loginPO obj1;
	createrepo_PO obj2;
	delete_repo_PO obj3;
	//loginPO obj1= new loginPO(driver);;
	
	@Given("System navigate to github login page")
	public void system_navigate_to_github_login_page() {
	  
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://github.com/");
	}

	@And("I am login to the github")
	public void i_am_login_to_the_github() {
	   obj1 = new loginPO(driver);
	    obj1.getGithubHomePage();
	}

	@Then("System navigate to the github user Account home page")
	public void system_navigate_to_the_github_user_account_home_page() throws InterruptedException, IOException {
		//obj1 = new loginPO(driver);
		obj1.getUserHomePage();
		
		obj2 =new createrepo_PO(driver);
		 obj2.getNewWindow();
		 
		 obj2.insertRepoName();
		 obj2.publicRepo();
		 obj2.addReadme();
		 obj2.createNewRepo();
		 
		 
		 obj3 = new delete_repo_PO(driver);
		 obj3.navigate_to_deleteTAB();
		 obj3.insert_rponame();
	}
}
