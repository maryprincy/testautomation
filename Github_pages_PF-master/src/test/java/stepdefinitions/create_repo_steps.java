package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.createrepo_PO;


public class create_repo_steps {

	public WebDriver driver;
	createrepo_PO obj2;
	//=new createrepo_PO(driver);

		@Given("click newrepository")
		public void click_newrepository() {
		 obj2 =new createrepo_PO(driver);
		 obj2.getNewWindow();
		}
		
		@Then("Insert the repository name")
		public void insert_the_repository_name() {
		    
		}
		
		@Then("select as a public repo and add readme file")
		public void select_as_a_public_repo_and_add_readme_file() {
		  
		}
		
		@And("click on the create repository name")
		public void click_on_the_create_repository_name() {
		   
		}

}
