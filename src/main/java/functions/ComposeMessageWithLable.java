package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import ObjectsRepository.ComposePageObj;
import Utilities.Utility;


public class ComposeMessageWithLable extends Utility 
{
	private ComposePageObj pageObj;
	String lableName="Test"+randInt();

	public void sendMessage(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try
		{
		pageObj = PageFactory.initElements(driver, ComposePageObj.class);
		waifForElementClickable(pageObj.btnCompose,60);
		
		pageObj.btnCompose.click();
		waifForElementClickable(pageObj.txtTo,60);
		
		pageObj.lnkLable.click();
		
		waifForElementClickable(pageObj.btnLable,60);
		Thread.sleep(1000);
		pageObj.btnLable.click();
		
		waifForElementClickable(pageObj.txtLabel,60);
		Thread.sleep(1000);
		pageObj.txtLabel.sendKeys(lableName);
		
		Thread.sleep(1000);
		pageObj.lnkNewLable.click();
		Thread.sleep(1000);
		waifForElementClickable(pageObj.btnCreateNewLabel,60);
		pageObj.btnCreateNewLabel.click();

		Thread.sleep(5000);
		
		
		pageObj.txtTo.clear();
		pageObj.txtTo.sendKeys(TMail);
		
		waifForElementClickable(pageObj.txtSubject,30);
		
		pageObj.txtSubject.clear();
		pageObj.txtSubject.sendKeys("This is Test");
		
		waifForElementClickable(pageObj.txtMessageBody,30);
		pageObj.txtMessageBody.clear();
		pageObj.txtMessageBody.sendKeys("This is Automation Test script Mail");
		
				
		waifForElementClickable(pageObj.btnSend,30);
		pageObj.btnSend.click();
		
		
		Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("Not able to post your message. Error Found: ****** "+e.getMessage()+" ******");
		}
	}

	public boolean vrfyComposeMsg() 
	{
		try 
		{
			//pageObj.lnkSentMenu.click();
			waifForElementClickable(pageObj.btnSearch,30);
			pageObj.txtSearchTextBox.clear();
			pageObj.txtSearchTextBox.sendKeys("label:"+lableName+Keys.ENTER);
			Thread.sleep(2000);
			pageObj.btnSearch.click();
			Thread.sleep(2000);
			
			waifForElementClickable(pageObj.lnkSentMail,30);
			pageObj.lnkSentMail.click();
			Thread.sleep(2000);
			waifForElementClickable(pageObj.lblEmailText,30);
			if(pageObj.lblEmailText.isDisplayed())
				return true;
			else
				return false;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	
	
	
	

}
