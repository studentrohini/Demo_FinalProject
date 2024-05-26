package com.Emergencydetails;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectModel.EmergencyContactDetailsPageObject;
import pageObjectModel.LoginPageObjects;
import resources.BaseClass;


public class EmergencyContactDetails extends BaseClass {	
	
	@Test
	public void AssignedEmergencyContactsTest() throws InterruptedException, IOException, AWTException {
		driverInitialize();

		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys("Admin");

		Thread.sleep(2000);

		lpo.enterPassword().sendKeys("admin123");

		Thread.sleep(2000);

		lpo.clickLogin().click();
		
		Thread.sleep(2000);

		lpo.clickOnContactInfo().click();
		
		Thread.sleep(5000);
		
		EmergencyContactDetailsPageObject eds=new EmergencyContactDetailsPageObject(driver);
		
		eds.emergecycontactinfo().click();
		
		Thread.sleep(2000);
		
		eds.emergencycontactdetails().click();
		
		Thread.sleep(2000);
		
		eds.emergencyname().sendKeys("Rohini");
		
		Thread.sleep(2000);
		
		eds.emergencyrelationship().sendKeys("Cousin");
		
		Thread.sleep(2000);
		
		eds.emergencyContact().sendKeys("8767513862");
		
		Thread.sleep(2000);
		
		eds.emergencyPhoneNumber().sendKeys("8767513862");
		
		Thread.sleep(2000);
		
		eds.emergencyworkNumber().sendKeys("9921053603");
		
		Thread.sleep(2000);
		
		eds.savealldetails().click();
		
		//String expetedTitle="Google";
		//String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
		
		//Assert.assertEquals(actualTitle,expetedTitle);
		
		Thread.sleep(5000);
		
		//eds.deleteemergencycontactdetails().click();
		
		//Thread.sleep(5000);
		
		//eds.clickdeleteemergencycontactdetails().click();
		
		//Thread.sleep(5000);
		
		//eds.deleteallemergencycontactrecords().click();
		
		//Thread.sleep(5000);
		
		//eds.delete().click();
		
		//Thread.sleep(5000);
		
		//eds.yesdeletepermentaly().click();
		
		//Thread.sleep(5000);
		
		eds.editemergencycontact().click();
		
		Thread.sleep(5000);
		
		eds.editcontactrelationship().click();
        eds.editcontactrelationship().sendKeys(Keys.CONTROL+"A");
        eds.editcontactrelationship().sendKeys(Keys.CONTROL+"x");
        Thread.sleep(5000);
        eds.editcontactrelationship().sendKeys("Daughter");
        eds.clicksave().click();
        
        Thread.sleep(5000);
        
        eds.clickaddattachment().click();
		
        Thread.sleep(5000);
        
        //eds.clickbrowsettachment().click();
		
		
        WebElement button = driver.findElement(By.xpath("//div[@class='oxd-file-button']"));

		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();

		Robot rb = new Robot();
		rb.delay(2000);


		//copy file to clip board
		StringSelection ss = new StringSelection("C:\\Users\\rohin\\Downloads\\Requiremsnts.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//perform control + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		eds.clicktypecomment().click();
		eds.clicktypecomment().sendKeys("Attachment successfully added");
		
		Thread.sleep(5000);
		
		eds.clicksaveattachmentdetails().click();
		
		Thread.sleep(5000);
		
		eds.clickdownoadattachment().click();
		
		Thread.sleep(5000);
		
		eds.clickdeleteaddattachment().click();
		
		Thread.sleep(5000);
		
		eds.clickyesdelete().click();
		
		Thread.sleep(5000);
		
		eds.clickselectalldeletebuttons().click();
		
		Thread.sleep(5000);
		
		eds.clickdeleteselected().click();
		
		Thread.sleep(5000);
		
		eds.deleteselectedbuttons().click();
		
		Thread.sleep(5000);
		
		eds.clickeditattachment().click();
		
		Thread.sleep(5000);
	}

	



}
