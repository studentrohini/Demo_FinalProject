package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjectModel.LoginPageObjects;
import pageObjectModel.EmergencyContactDetailsPageObject ;
import resources.BaseClass;

public class EmergencyContactDetailsPageObject {
	
	public WebDriver driver;

	private By emergecycontactDetails = By.linkText("Emergency Contacts");
	
	public By addemergencycontactdetails= By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[1]");
	
	public By emergencycontactname=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
	
	public By emergencycontactreationship=By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]");
	
	public By emergencycontactMobileNumber=By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]");
	
	public By emergencyPhone=By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[2]//div[1]//div[2]//input[1]");
	
	public By emergencyWorkTelePhone=By.xpath("//div[3]//div[1]//div[2]//input[1]");
	
	public By save=By.xpath("//button[normalize-space()='Save']");
	
	//public By deletecontact=By.xpath("//i[@class='oxd-icon bi-trash']");
	
	//public By yesdelete=By.xpath("//button[normalize-space()='Yes, Delete']");
	
	//public By delerecords=By.xpath("(//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"])[1]");
	
	//public By deleteallrecords=By.xpath("(//button[@type=\"button\"])[4]");
	
	//public By permentalydelete=By.xpath("//button[normalize-space()='Yes, Delete']");
	
	public By editcontact=By.xpath("//i[@class='oxd-icon bi-pencil-fill']");
	
	public By editrelationship=By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]");
	
	public By savechanges=By.xpath("//button[normalize-space()='Save']");
	
	public By addattachment=By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]");
	
	public By typecomment=By.xpath("//textarea[@placeholder='Type comment here']");
	
	public By saveattachmentdetails=By.xpath("//button[normalize-space()='Save']");
	
	public By downoadattachment=By.xpath("(//i[@class='oxd-icon bi-download'])[1]");
	
	public By deleteaddattachment=By.xpath("//div[@role='table']//div[1]//div[1]//div[8]//div[1]//button[2]//i[1]");
	
	public By yesdelete=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]");
	
	public By selectall=By.xpath("//div[@class='orangehrm-attachment']//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
	
	public By deleteselected=By.xpath("//button[normalize-space()='Delete Selected']");
	
	public By yesdeleteselectedbuttons=By.xpath("(//button[normalize-space()='Yes, Delete'])[1]");
	
	public By editattachment=By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[1]");
	
	public EmergencyContactDetailsPageObject(WebDriver driver2) {
	     this.driver=driver2;
	}
	
	public WebElement emergecycontactinfo()
	{
		return driver.findElement(emergecycontactDetails);
	}

	public WebElement emergencycontactdetails()
	{
		
		return driver.findElement(addemergencycontactdetails);
	}
	
	public WebElement emergencyname()
	{
		
		return driver.findElement(emergencycontactname);
	}
	
	public WebElement emergencyrelationship()
	{
		
		return driver.findElement(emergencycontactreationship);
	}
	
	public WebElement emergencyContact()
	{
		
		return driver.findElement(emergencycontactMobileNumber);
	}
	
	public WebElement emergencyPhoneNumber()
	{
		
		return driver.findElement(emergencyPhone);
	}
	
	public WebElement emergencyworkNumber()
	{
		
		return driver.findElement(emergencyWorkTelePhone);
	}
	
	public WebElement savealldetails()
	{
		
		return driver.findElement(save);
	}
	
	//public WebElement deleteemergencycontactdetails()
	//{
		
		//return driver.findElement(deletecontact);
	//}
	
	//public WebElement clickdeleteemergencycontactdetails()
	//{
		
		//return driver.findElement(yesdelete);
	//}
	
	//public WebElement deleteallemergencycontactrecords()
	//{
		
		//return driver.findElement(delerecords);
	//}
	
	//public WebElement delete()
	//{
		
		//return driver.findElement(deleteallrecords);
	//}
	
	//public WebElement yesdeletepermentaly()
	//{
		
		//return driver.findElement(permentalydelete);
	//}
	
	public WebElement editemergencycontact()
	{
		
		return driver.findElement(editcontact);
	}
	
	public WebElement editcontactrelationship()
	{
		
		return driver.findElement(editrelationship);
		
		
	}
	
	public WebElement clicksave()
	{
		
		return driver.findElement(savechanges);
		
		
	}
	
	public WebElement clickaddattachment()
	{
		
		return driver.findElement(addattachment);
		
		
	}
	
	public WebElement clicktypecomment()
	{
		
		return driver.findElement(typecomment);
		
		
	}
	
	public WebElement clicksaveattachmentdetails()
	{
		
		return driver.findElement(saveattachmentdetails);
		
		
	}
	
	public WebElement clickdownoadattachment()
	{
		
		return driver.findElement(downoadattachment);
		
		
	}
	
	public WebElement clickdeleteaddattachment()
	{
		
		return driver.findElement(deleteaddattachment);
		
		
	}
	
	public WebElement clickyesdelete()
	{
		
		return driver.findElement(yesdelete);
		
		
	}
	
	public WebElement clickselectalldeletebuttons()
	{
		
		return driver.findElement(selectall);
		
		
	}
	
	public WebElement clickdeleteselected()
	{
		
		return driver.findElement(deleteselected);
		
		
	}
	
	public WebElement deleteselectedbuttons()
	{
		
		return driver.findElement(yesdeleteselectedbuttons);
		
		
	}
	
	public WebElement clickeditattachment()
	{
		
		return driver.findElement(editattachment);
		
		
	}

	
	
	
	



	

	
	
}
