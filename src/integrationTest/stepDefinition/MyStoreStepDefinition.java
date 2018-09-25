package integrationTest.stepDefinition;

import integrationTest.config.DriverSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import integrationTest.pageObject.*;

public class MyStoreStepDefinition extends MyStore{
	
	MyStore Obj=new MyStore();
	
	@Given("^User opens the application in \"([^\"]*)\" browser$")
	public void initializingBrowserType(String browserType){
		setDriver(browserType);
	}
	
	@When("^User opens the application with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void appOpenStepDef(String usrName, String pwd) throws InterruptedException{
		appLogin(usrName, pwd);		
	}
	
	@When("^orders the Tshirt$")
	public void tShirtOrderStepDef() throws InterruptedException{
		tShirtOrder();		
	}
	
	@Then("^validate the ordered item in order history$")
	public void orderValidationStepDef() throws InterruptedException{
		orderValidation();
	}
	
	@When("^updates the First Name \"([^\"]*)\" with \"([^\"]*)\" current password$")
	public void firstNameUpdate(String newFirstName, String currentPassword) throws InterruptedException{
		personalUpdate(newFirstName, currentPassword);
	}
	
	@Then("^new new values should get updated$")
	public void updatedFirstNameValidation(){
		firstNameUpdateValidation();
	}

}
