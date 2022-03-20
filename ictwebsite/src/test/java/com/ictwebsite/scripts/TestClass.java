package com.ictwebsite.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.Assert;


import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.PartnershipForm;
import com.ictwebsite.pages.AdminUser;
import com.ictwebsite.pages.CorporateMembershipForm;
import com.ictwebsite.pages.HomePage;
import com.ictwebsite.pages.LoginPage;
import com.ictwebsite.pages.IndustrialPartners;
import com.ictwebsite.pages.KnowledgePartners;
import com.ictwebsite.pages.Patrons;
import com.ictwebsite.utilities.ExcelUtility;


public class TestClass extends TestBase{

	//Object creation 
	
	HomePage objLogin;
	CorporateMembershipForm ObjCorpMemForm;
	PartnershipForm ObjPartForm;
	LoginPage ObjLoginPage;
	IndustrialPartners ObjIdtrlPrtnrs;
	KnowledgePartners ObjKnwldgPrtnrs;
	Patrons ObjPatrons;
	AdminUser objAdminUser;


@Test(priority=0)
public void HomePage() throws IOException, InterruptedException {
    	   	
	//Create CorporateMembership Page object
	ObjCorpMemForm = new CorporateMembershipForm(driver);

	//Create Home object
	objLogin = new HomePage(driver);

	//Create PartnershipForm object
	ObjPartForm = new PartnershipForm(driver);

	//Create LoginPage object
	ObjLoginPage =new LoginPage(driver);

	//Create IndustrialPartnership Object
	ObjIdtrlPrtnrs=new IndustrialPartners(driver);

	//Creating KnowledgePartners object
	ObjKnwldgPrtnrs= new KnowledgePartners(driver);

	//Creating Patrons  Object
	ObjPatrons = new Patrons(driver);

	//Creating Patrons  Object
	objAdminUser = new AdminUser(driver);
 
}

//@Test(priority=1)
@Test(priority=1)
public void MembershipCourses() throws IOException, InterruptedException {
	
	
	String expectedUrl =AutomationConstants.ACADEMICMEMBERSHIP;
//	String actualUrlhome =driver.getCurrentUrl();
//	AssertJUnit.assertEquals(expectedUrl,actualUrlhome);
	
	objLogin.clickMembershipMenu();
	objLogin.clickAcademic_Membership();

	
	
	String actualUrl =driver.getCurrentUrl();
	AssertJUnit.assertEquals(expectedUrl,actualUrl);

	objLogin.clickAcademic_Membership_Text();
	objLogin.scrollDown();
	objLogin.clickViewMembersButton();

}



@Test(priority=2)
public void CorporateMembership() throws IOException, InterruptedException {
	
	objLogin.clickICTLogo();
	objLogin.clickMembershipText();
	objLogin.clickMembershipMenuCorp();
	objLogin.clickMembershipMenuCorporate();
	objLogin.clickCorporateMembershipRegisterHere();
	ObjCorpMemForm.scrollDownPage();
}



@Test(priority=3)
public void CorporateMembershipForm() throws IOException, InterruptedException {
	
	//getting the data from the excel sheet
	String UName = ExcelUtility.getCellData(0, 0);
	ObjCorpMemForm.clickName(UName);

	String UAddress= ExcelUtility.getCellData(0, 1);
	ObjCorpMemForm.clickAddress(UAddress);

	String UHeadoftheOrganization= ExcelUtility.getCellData(0,2);
	ObjCorpMemForm.clickHeadoftheOrganization(UHeadoftheOrganization);

	String UNature= ExcelUtility.getCellData(0,3);
	ObjCorpMemForm.clickNatureoftheOrga(UNature);

	String UWebsite= ExcelUtility.getCellData(0,4);
	ObjCorpMemForm.clickWebsite(UWebsite);

	ObjCorpMemForm.scrollDownSlightPage();

	ObjCorpMemForm.clickTypeofthecompany();

	ObjCorpMemForm.clickTypeofthecompanyPrivate();

	String UCorporateIdentifyNumber= ExcelUtility.getCellData(0,6);
	ObjCorpMemForm.clickCorporateIdentifyNumber(UCorporateIdentifyNumber);

	String UGSTNumber= ExcelUtility.getCellData(0,7);
	ObjCorpMemForm.clickGSTNumber(UGSTNumber);

}



@Test(priority=4)
public void CorporateMembershipPointofContact() throws IOException, InterruptedException {
	

//	String expectedUrlCM =AutomationConstants.CORPORATEMEMBERSHIPFORM;
//	String actualUrlCM = ObjCorpMemForm.clickPointofContact();
//	Assert.assertEquals(expectedUrlCM,actualUrlCM);
	
	ObjCorpMemForm.scrollDownSlightPage();

	String UNamePointofContact= ExcelUtility.getCellData(0,8);
	ObjCorpMemForm.clickNamePointofContact(UNamePointofContact);

	String UMobilePointofContact= ExcelUtility.getCellData(0,9);
	ObjCorpMemForm.clickMobilePointofContact(UMobilePointofContact);


	ObjCorpMemForm.scrollDownSlightPage();

	String UTechnicalSkillPointofContact= ExcelUtility.getCellData(0,10);
	ObjCorpMemForm.clickTechnicalSkillPointofContact(UTechnicalSkillPointofContact);

	String UemailPointofContact= ExcelUtility.getCellData(0,11);
	ObjCorpMemForm.clickemailPointofContact(UemailPointofContact);

	String UemployeeCountPointofContact= ExcelUtility.getCellData(0,12);
	ObjCorpMemForm.clickemployeeCountPointofContact(UemployeeCountPointofContact);

	ObjCorpMemForm.scrollDownSlightPage();

	ObjCorpMemForm.clickcollaboratePointofContact();

	ObjCorpMemForm.clickcollaborateitemPointofContact();

	ObjCorpMemForm.scrollDownSlightPage();

	ObjCorpMemForm.clickNumberofPatentsperYearPointofContact();

	ObjCorpMemForm.clickNumberofPatentsperYearValPointofContact();

	ObjCorpMemForm.scrollDownSlightPage();

	ObjCorpMemForm.clickAvgfrshrPointofContact();

	ObjCorpMemForm.clickAvgfrshrValPointofContact();

	String Udetails= ExcelUtility.getCellData(0,13);
	ObjCorpMemForm.clickdetails(Udetails);

	//ObjCorpMemForm.clicktoggle();

	//Button Register - Enabled or Disabled
//	boolean actualStatus = ObjCorpMemForm.EnabledRegister();
//	Assert.assertEquals(true,actualStatus);

	ObjCorpMemForm.clickRegister();

	String expectedTitle = AutomationConstants.REGISTRATIONMESSAGE;
	String actualTitle = driver.switchTo().alert().getText();
	Assert.assertEquals(expectedTitle,actualTitle);

	driver.switchTo().alert().accept();

}


@Test(priority=5)
//@Test(priority=5)
public void PartnershipMenu() throws IOException, InterruptedException {
	
	objLogin.clickMembershipMenuu();
	objLogin.clickPartnershipMenu();
	objLogin.clickPartnershipMenuRegister();	
	ObjCorpMemForm.scrollDownSlightPage();

}


@Test(priority=6)
public void PartnershipForm() throws IOException, InterruptedException {
	
	ObjPartForm.clickAvgfrshrValPointofContact();
	
	String UFullName= ExcelUtility.getCellData(2,0);
	ObjPartForm.clickFullName(UFullName);
	
	String UEmail= ExcelUtility.getCellData(2,1);
	ObjPartForm.clickEmail(UEmail);

	String UPhoneNumber= ExcelUtility.getCellData(2,2);
	ObjPartForm.clickPhoneNumber(UPhoneNumber);
	

	String UFirm= ExcelUtility.getCellData(2,3);
	ObjPartForm.clickFirm(UFirm);
	
	ObjCorpMemForm.scrollDownSlightPage();
	
	String UAddress= ExcelUtility.getCellData(2,4);
	ObjPartForm.clickAddress(UAddress);
	
	String UDistrict= ExcelUtility.getCellData(2,5);
	ObjPartForm.clickDistrict(UDistrict);
	
	String USquareFeet= ExcelUtility.getCellData(2,6);
	ObjPartForm.clickSquareFeet(USquareFeet);
	

	String UNoofEmp= ExcelUtility.getCellData(2,7);
	ObjPartForm.clickNoofEmp(UNoofEmp);

	ObjCorpMemForm.scrollDownSlightPage();
	
	String UBriefReport= ExcelUtility.getCellData(2,8);
	ObjPartForm.clickBriefReport(UBriefReport);
	
	String UExpects= ExcelUtility.getCellData(2,9);
	ObjPartForm.clickExpects(UExpects);

	String UPromoters= ExcelUtility.getCellData(2,10);
	ObjPartForm.clickPromoters(UPromoters);
	
	
	//BUTTON eNABLED/dISABLED
	boolean actualStatus = ObjPartForm.EnabledSendMessage();
	Assert.assertEquals(true,actualStatus);

	ObjCorpMemForm.scrollDownSlightPage();
	
	ObjPartForm.clickSendMessage();
	
	String expectedTitle = AutomationConstants.REGISTRATIONMESSAGE;
	String actualTitle = driver.switchTo().alert().getText();
	Assert.assertEquals(expectedTitle,actualTitle);
	
	driver.switchTo().alert().accept();
	
}

@Test(priority=7)
public void Login_Home() throws IOException, InterruptedException {

	
	objLogin.clickLogin();
	
	//Assertion to Check where the entered email and data from input sheet are same
	String UEmail= ExcelUtility.getCellData(4,0);
	ObjLoginPage.setEmail(UEmail);
	Assert.assertEquals(UEmail, ObjLoginPage.matchEmail());
	
	//Assertion to Check where the entered password and data from input sheet are same
	String UPassword= ExcelUtility.getCellData(4,1);
	ObjLoginPage.clickPassword(UPassword);
	Assert.assertEquals(UPassword, ObjLoginPage.matchPassword());
	
	ObjLoginPage.clickSignIn();
	
	objLogin.scrollDown();
		
}

@Test(priority=8)
public void IndustrialPartnersVerifyEmptyData() throws IOException, InterruptedException {
	
	ObjIdtrlPrtnrs.clickIndustral();
	
	ObjIdtrlPrtnrs.clickAddIndustral();
	
	ObjIdtrlPrtnrs.clickAddPartner();
	
	ObjIdtrlPrtnrs.clickNetworkError();
	 
	String expectedTitle = AutomationConstants.NETWORKERRORMSGE;
	System.out.println(expectedTitle);
	String actualTitle = ObjIdtrlPrtnrs.clickNetworkError();
	Assert.assertEquals(expectedTitle,actualTitle);
	
	ObjIdtrlPrtnrs.clickOK();

}

@Test(priority=9)
public void IndustrialPartnersVerifyWithData() throws IOException, InterruptedException {

	ObjIdtrlPrtnrs.clickAddIndustral();	
	
	String UChoosefile= ExcelUtility.getCellData(5,0);
	ObjIdtrlPrtnrs.clickChoosefile(UChoosefile);

	ObjIdtrlPrtnrs.clickAddPartner();

	ObjIdtrlPrtnrs.clickNetworkError();

	String expectedTitle = AutomationConstants.SUCCESSMSGE;
	System.out.println(expectedTitle);
	String actualTitle = ObjIdtrlPrtnrs.clickNetworkError();
	Assert.assertEquals(expectedTitle,actualTitle);

	ObjIdtrlPrtnrs.clickOK();

}


@Test(priority=10)
public void Knowledge() throws IOException, InterruptedException {
	ObjKnwldgPrtnrs.clickKnowledge();

}


@Test(priority=11)
public void KnowledgePartnersVerifyEmptyData() throws IOException, InterruptedException {

	ObjKnwldgPrtnrs.clickAddKnowledge();
	ObjKnwldgPrtnrs.clickAddKnowledgeSubmit();
	ObjIdtrlPrtnrs.clickNetworkError();
	 
	String expectedTitle = AutomationConstants.NETWORKERRORMSGE;
	String actualTitle = ObjIdtrlPrtnrs.clickNetworkError();
	Assert.assertEquals(expectedTitle,actualTitle);
	
	ObjIdtrlPrtnrs.clickOK();

}

@Test(priority=12)
public void KnowledgePartnersVerifyWithData() throws IOException, InterruptedException {

	ObjKnwldgPrtnrs.clickAddKnowledge();	
		
	String UChoosefile= ExcelUtility.getCellData(6,0);
	ObjKnwldgPrtnrs.clickChoosefile(UChoosefile);

	ObjKnwldgPrtnrs.clickAddKnowledgeSubmit();
	ObjIdtrlPrtnrs.clickNetworkError();

	String expectedTitle = AutomationConstants.SUCCESSMSGE;
	System.out.println(expectedTitle);
	String actualTitle = ObjIdtrlPrtnrs.clickNetworkError();
	Assert.assertEquals(expectedTitle,actualTitle);

	ObjIdtrlPrtnrs.clickOK();

}

@Test(priority=13)
public void PatronsDashboard() throws IOException, InterruptedException {

	ObjPatrons.clickpatronDashboard();

}


@Test(priority=14)
public void PatronsAddwithEmpty() throws IOException, InterruptedException {

	ObjPatrons.clickAddpatron();
	ObjPatrons.clickaddPatronSubmit();
	ObjIdtrlPrtnrs.clickNetworkError();

	String expectedTitle = AutomationConstants.NETWORKERRORMSGE;
	System.out.println(expectedTitle);
	String actualTitle = ObjIdtrlPrtnrs.clickNetworkError();
	Assert.assertEquals(expectedTitle,actualTitle);

	ObjIdtrlPrtnrs.clickOK();

}

@Test(priority=15)
public void PatronsAddwithData() throws IOException, InterruptedException {
	
	ObjPatrons.clickAddpatron();	
	
	String UChoosefile= ExcelUtility.getCellData(6,0);
	ObjPatrons.clickpatronChooseFile(UChoosefile);
	ObjPatrons.clickaddPatronSubmit();

	String expectedTitle = AutomationConstants.SUCCESSMSGE;
	System.out.println(expectedTitle);
	String actualTitle = ObjIdtrlPrtnrs.clickNetworkError();
	Assert.assertEquals(expectedTitle,actualTitle);

	ObjIdtrlPrtnrs.clickOK();

}


@Test(priority=16)
public void AdminUserDashboard() throws IOException, InterruptedException {

	objAdminUser.clickadminUserDashboard();
	objAdminUser.clickaddAdmin();
	objAdminUser.clicknewAdminUser();
	
	String Uusername= ExcelUtility.getCellData(7,0);
	objAdminUser.clickUserName(Uusername);
	
	String UFirstName= ExcelUtility.getCellData(7,1);
	objAdminUser.clickFirstName(UFirstName);
	
	String ULastName= ExcelUtility.getCellData(7,2);
	objAdminUser.clickLastName(ULastName);
	
	String UEmail= ExcelUtility.getCellData(7,3);
	objAdminUser.clickEmail(UEmail);
	
	String UDesignation= ExcelUtility.getCellData(7,4);
	objAdminUser.clickDesignation(UDesignation);
	

	ObjCorpMemForm.scrollDownSlightPage();
	
	String UPassword= ExcelUtility.getCellData(7,5);
	objAdminUser.clickPassword(UPassword);
	
	
	objAdminUser.clickFullAccess();
	
	ObjCorpMemForm.scrollDownSlightPage();
	
	objAdminUser.clickAddAccess();
	
	objAdminUser.clickEditAccess();
	
	ObjCorpMemForm.scrollDownSlightPage();
	
	objAdminUser.clickDeleteAccess();
	
	objAdminUser.clickAddButton();
	
	String expectedTitle = AutomationConstants.SUCCESSMSGE;
	System.out.println(expectedTitle);
	String actualTitle = objAdminUser.clickAlertmessage();
	Assert.assertEquals(expectedTitle,actualTitle);
	
	objAdminUser.clickOKButton();
	

}

@Test(priority=17)
public void AdminUserDashboardAction() throws IOException, InterruptedException {

	objAdminUser.clickadminUserDashboard();
	System.out.println("clickadminUserDashboard");
	
	objAdminUser.getTableView();
	System.out.println("getTableView");
	
	String expectedTitle = AutomationConstants.ADMINUSER;
	System.out.println(expectedTitle);
	
	String actualTitle = objAdminUser.clickgetHeadingUseradmin();
	System.out.println(actualTitle);
	
	Assert.assertEquals(expectedTitle,actualTitle);
	
	objAdminUser.getTableEdit();
	
	String Editusername= ExcelUtility.getCellData(7,0);
	
	System.out.println(Editusername);
	Assert.assertEquals(Editusername, objAdminUser.matchGetEditUserName());
	
	String UFirstName= ExcelUtility.getCellData(7,1);
	
	System.out.println(UFirstName);
	Assert.assertEquals(UFirstName, objAdminUser.matchGetEditFirstName());
	
	String ULastName= ExcelUtility.getCellData(7,2);
	
	System.out.println(ULastName);
	Assert.assertEquals(ULastName, objAdminUser.matchEditLastName());
	
	String UEmail= ExcelUtility.getCellData(7,3);
	
	System.out.println(UEmail);
	Assert.assertEquals(UEmail, objAdminUser.matchGetEditEmailAddress());
	
	objAdminUser.getTableDelete();
	objAdminUser.clickyesDelete();
	
}

}
