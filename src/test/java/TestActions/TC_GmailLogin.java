package TestActions;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Utility;
import functions.Login;

public class TC_GmailLogin extends Utility {

	private Login actions = new Login();
	String searchKeyword;

	//Precondition to setup browser and URL
	@Override
	public void preConditions() {
		super.preConditions();
	}


	@Test(description = "This test will verify the Valid User Login")
	public void LoginTest() {
		actions.loginAction(driver);
		Assert.assertTrue(actions.verifyUser());
	}

	//Post condition will run after test execution
	@Override
	public void postConditions() {
		super.postConditions();
	}

}
