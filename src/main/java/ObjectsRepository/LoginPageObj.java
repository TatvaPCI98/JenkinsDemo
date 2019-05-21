package ObjectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageObj 
{
	@FindBy(how = How.XPATH, using = ".//input[@value='Log In']")
	public WebElement btnLogin ;
	
	@FindBy(how = How.XPATH, using = "//input[@type=\"email\"]")
	public WebElement txtEmail ;
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"Next\")]")
	public WebElement btnNext ;
	
	@FindBy(how = How.XPATH, using = "//input[@type=\"password\"]")
	public WebElement txtPassword ;
	
	@FindBy(how = How.XPATH, using = " .//div[contains(text(),'Compose')]")
	public WebElement btnCompose ;
	
}
