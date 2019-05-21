package functions;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ObjectsRepository.LoginPageObj;
import Utilities.Utility;


public class Login extends Utility 
{
	private LoginPageObj pageObj;
	public List<WebElement> listSearch;
	
	//Login with valid user name and password 
	public void loginAction(WebDriver driver)
	{
		pageObj = PageFactory.initElements(driver, LoginPageObj.class);
		
		waifForElementPresent(pageObj.txtEmail,20);
		pageObj.txtEmail.clear();
		pageObj.txtEmail.sendKeys(userName);
		
		
		pageObj.btnNext.click();
		waifForElementPresent(pageObj.txtPassword,20);
		pageObj.txtPassword.clear();
		pageObj.txtPassword.sendKeys(pwd);
		
		pageObj.btnNext.click();
		
		

	}

	// Verify User Login Successfully
	public boolean verifyUser()
	{
		waifForElementPresent(pageObj.btnCompose,30);
		if (pageObj.btnCompose.isDisplayed())
			return true;
		else
			return false;
	}

}
