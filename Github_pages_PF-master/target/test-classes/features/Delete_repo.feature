Feature: Create New Repository

	Background: Verify github login
	    Given System navigate to github login page
    	And I am login to the github
    	Then System navigate to the github user Account home page
	    	   
	    Given click newrepository
	    Then Insert the repository name
	    Then select as a public repo and add readme file
	    And click on the create repository name
	    
	Scenario:
			Given click on repo_name
			Then click on settings
			Then click on delete repository
			And type the confirmation text
			Then click the delete statement