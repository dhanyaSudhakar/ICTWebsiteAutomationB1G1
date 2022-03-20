package com.ictwebsite.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
    
	//Home page - Membership menu click
	@FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[1]/div/div/nav/div/div/ul/li[4]/a")
    private WebElement Membership;
   
    //Membership menu - Academic Membership click
   @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[4]/ul/div[1]/ul/li[1]/a/h6")
    private WebElement  Academic_Membership ;
   
   //Membership menu - Academic Membership click
   @FindBy(xpath=" /html/body/app-root/app-academic/section[1]/div[1]/div/div[2]/h2")
   private WebElement  Academic_Membership_Text;
   
   //Membership Page - View Members button click
   @FindBy(xpath="//*[@id=\"about-section\"]/div[1]/div/div[2]/a")
   private WebElement  ViewMember ;

   //ICTLOgo click
   @FindBy(xpath="/html/body/app-root/app-academiccollaborations/app-header/div[1]/div/div/nav/div/img")
   private WebElement  logo ;
 
   //Membership menu - Corporate Membership click
   @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[4]/ul/div[1]/ul/li[2]/a/h6")
    private WebElement  Corporate_Membership ;
   
   //Home page - Membership menu for clicking on corporate membership
   @FindBy(xpath="//*[@id=\"dropdownMenuDocs\"]")
   private WebElement CorpMembership;
 
   //Home page - "PREMIUM MEMBERSHIP FORM" Text
   @FindBy(xpath="/html/body/app-root/app-academiccollaborations/header/div/div[1]/div/div/h1")
   private WebElement MembershipFormText;
   
   
   //MEMBERSHIP-MENU
   //Home page - Membership menu click
   @FindBy(xpath="/html/body/app-root/app-main-page/app-header/div[1]/div/div/nav/div/div/ul/li[4]/a")
   private WebElement SecondMembership;
   
   //Corporate_Membership_RegisterHere- Button Click
   @FindBy(xpath="/html/body/app-root/app-corporate/app-bannercorporate/header/div/div[1]/div/div/button")
   private WebElement CorporateMembershipRegisterHere;
   
   //Membership- MENU
   @FindBy(xpath="/html/body/app-root/app-corporateform/app-header/div[1]/div/div/nav/div/div/ul/li[4]")
   private WebElement MembershipMenuu;
   
   //Membership- MENU ---->  Partnership 
   @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[4]/ul/div[1]/ul/li[3]/a/h6")
   private WebElement PartnershipMenu;
   
   //Membership- MENU ---->  Partnership --- > Register Here
   @FindBy(xpath="/html/body/app-root/app-partnership/app-bannerpartnership/header/div/div[1]/div/div/button")
   private WebElement PartnershipMenuRegister;
  
   //Login button from homepage
   @FindBy(xpath=" //*[@id=\"navigation\"]/ul/li[7]/a")
   private WebElement Login;
   
   

public HomePage(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}


//Click on Membership menu 
public void clickMembershipMenu() throws InterruptedException{
	Thread.sleep(2000);
	Membership.click();
} 


//Click on Membership menu - Academic Membership click
public void clickAcademic_Membership() throws InterruptedException{
	Thread.sleep(2000);
	Academic_Membership.click();
	} 


//Click on Academic_Membership_Text
public void clickAcademic_Membership_Text() throws InterruptedException{
	Thread.sleep(2000);
	Academic_Membership_Text.click();
	}

//Scroll Down a page 
public void scrollDown() throws InterruptedException{
	Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(2000);
	}

//Scroll Slight Down a page 
public void scrollSlightDown(){
JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,150)", "");
	}

//Click on View Members Button click
public void clickViewMembersButton() throws InterruptedException{
	Thread.sleep(2000);
	ViewMember.click();	
} 

public void clickICTLogo() throws InterruptedException{
	Thread.sleep(4000);
	logo.click();	
} 

public void clickMembershipText() throws InterruptedException{
	Thread.sleep(4000);
	MembershipFormText.click();	
} 

public void clickMembershipMenuCorp() throws InterruptedException{
	Thread.sleep(4000);
	CorpMembership.click();	
} 

public void clickMembershipMenuCorporate()  throws InterruptedException{
	Thread.sleep(4000);
	Corporate_Membership.click();	
} 

public void clickCorporateMembershipRegisterHere()  throws InterruptedException{
	Thread.sleep(4000);
	CorporateMembershipRegisterHere.click();	
}

public void clickMembershipMenuu()  throws InterruptedException{
	Thread.sleep(4000);
	MembershipMenuu.click();	
	Thread.sleep(4000);
}

public void clickPartnershipMenu()  throws InterruptedException{
	Thread.sleep(4000);
	PartnershipMenu.click();	
	Thread.sleep(4000);
}


public void clickPartnershipMenuRegister()  throws InterruptedException{
	Thread.sleep(4000);
	PartnershipMenuRegister.click();	
	Thread.sleep(4000);
}

public void clickLogin()  throws InterruptedException{
	Thread.sleep(4000);
	Login.click();	
	Thread.sleep(4000);
}

//public String getErrorMessage() {
//	return errorMessage.getText();
//} 	

}
