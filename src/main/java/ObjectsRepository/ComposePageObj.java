package ObjectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

 
public class ComposePageObj 
{
	@FindBy(how = How.XPATH, using = " .//div[contains(text(),'Compose')]")
	public WebElement btnCompose ;
	
	
	@FindBy(how = How.XPATH, using = "(//textarea[@name='to'])")
	public WebElement txtTo ;
	
	
	@FindBy(how = How.XPATH, using = "(.//input[@name='subjectbox'])")
	public WebElement txtSubject ;
	
	
	@FindBy(how = How.XPATH, using = ".//div[@role=\"textbox\" and @contenteditable=\"true\"]")
	public WebElement txtMessageBody ;
	
	@FindBy(how = How.XPATH, using = "//*[@aria-label='More options']//div[@class='J-J5-Ji J-JN-M-I-JG']")
	public WebElement lnkLable ;
	
	
	@FindBy(how = How.XPATH, using = " .//input[@aria-label='Label-as menu open' and @type ='text']")
	public WebElement txtLabel ;
	
	
	@FindBy(how = How.XPATH, using = ".//div[contains(text(),'Label')]")
	public WebElement btnLable ;
	
	@FindBy(how = How.XPATH, using = ".//div[@class='J-JK-Jz']/span")
	public WebElement lnkNewLable ;
	
	
	@FindBy(how = How.XPATH, using = ".//button[contains(text(),'Create')]")
	public WebElement btnCreateNewLabel ;
	
	
	@FindBy(how = How.XPATH, using = ".//div[contains(text(),'Send') and @role='button']")
	public WebElement btnSend ;
	
	@FindBy(how = How.XPATH, using = " .//a[@title='Sent']")
	public WebElement lnkSentMenu ;
	
	
	@FindBy(how = How.XPATH, using = ".//input[@aria-label='Search mail']")
	public WebElement txtSearchTextBox ;
	
	@FindBy(how = How.XPATH, using = ".//button[@aria-label='Search Mail']")
	public WebElement btnSearch ;
	
	
	@FindBy(how = How.XPATH, using = ".//div[@role='main']//tr//div[@role='link']//span[contains(text(),'This is Test')]")
	public WebElement lnkSentMail ;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'This is Automation Test script Mail')]")
	public WebElement lblEmailText ;
	
	
	
	
}
