package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnershipForm {

	WebDriver driver;	
	
	//Locating the object - Full Name
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[1]/div[1]/div/input")
    private WebElement FullName;
	
    //Locating the object - Full Name
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[1]/div[2]/div/input")
    private WebElement Email;
    
    //Locating the object - Phone NUMBER 
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[2]/div[1]/div/input")
    private WebElement PhoneNumber;
    
    //Locating the object - Firm 
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[2]/div[2]/div/input")
    private WebElement Firm;
    
   //Locating the object - Address 
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[3]/div[1]/div/input")
    private WebElement Address;
    
    //Locating the object - District 
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[3]/div[2]/div/input")
    private WebElement District;
    
    //Locating the object - SquareFeet
    @FindBy(xpath=" /html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[4]/div[1]/div/input")
    private WebElement SquareFeet;
   
    //Locating the object - NO OF EMPLOYEE
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[4]/div[2]/div/input")
    private WebElement NoofEmp;
   
    //Locating the object - Brief Report
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[5]/textarea")
    private WebElement BriefReport;
    
    //Locating the object - Expects
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[6]/textarea")
    private WebElement Expects;
 
    //Locating the object - Promoters
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[7]/textarea")
    private WebElement Promoters;
    
    //Locating the object - Send Message bUTTON 
    @FindBy(xpath="/html/body/app-root/app-partenshipform/header/div[2]/section/div/div/div/div/div[2]/form/div/div[8]/div/button")
    private WebElement SendMessage;
    

    public PartnershipForm(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }  
    
    
    public void clickAvgfrshrValPointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	FullName.click();
    	Thread.sleep(1000);
    	
    }
    
    
  //Inputting Value to Partnership Form - FullName
    public void clickFullName(String StrFullName) throws InterruptedException{
    	Thread.sleep(1000);
    	FullName.sendKeys(StrFullName);
    	Thread.sleep(1000);
    } 
    
    
  //Inputting Value to Partnership Form - Email
    public void clickEmail(String StrEmail) throws InterruptedException{
    	Thread.sleep(1000);
    	Email.sendKeys(StrEmail);
    	Thread.sleep(1000);
    } 
    
  //Inputting Value to Partnership Form - PhoneNumber
    public void clickPhoneNumber(String StrPhoneNumber) throws InterruptedException{
    	Thread.sleep(1000);
    	PhoneNumber.sendKeys(StrPhoneNumber);
    	Thread.sleep(1000);
    } 
    
  //Inputting Value to Partnership Form -Firm
    public void clickFirm(String StrFirm) throws InterruptedException{
    	Thread.sleep(1000);
    	Firm.sendKeys(StrFirm);
    	Thread.sleep(1000);
    }
    
  //Inputting Value to Partnership Form - Address
    public void clickAddress(String StrAddress) throws InterruptedException{
    	Thread.sleep(1000);
    	Address.sendKeys(StrAddress);
    	Thread.sleep(1000);
    } 
    
  //Inputting Value to Partnership Form - District
    public void clickDistrict(String StrDistrict) throws InterruptedException{
    	Thread.sleep(1000);
    	District.sendKeys(StrDistrict);
    	Thread.sleep(1000);
    } 
    
  //Inputting Value to Partnership Form - SquareFeet
    public void clickSquareFeet(String StrSquareFeet) throws InterruptedException{
    	Thread.sleep(1000);
    	SquareFeet.sendKeys(StrSquareFeet);
    	Thread.sleep(1000);
    } 
    
    //Inputting Value to Partnership Form - No of Employee
    public void clickNoofEmp(String StrNoofEmp) throws InterruptedException{
    	Thread.sleep(1000);
    	NoofEmp.sendKeys(StrNoofEmp);
    	Thread.sleep(1000);
    }
    
  //Inputting Value to Partnership Form - BriefReport
    public void clickBriefReport(String StrBriefReport) throws InterruptedException{
    	Thread.sleep(1000);
    	BriefReport.sendKeys(StrBriefReport);
    	Thread.sleep(1000);
    }
    
  //Inputting Value to Partnership Form - Expects
    public void clickExpects(String StrExpects) throws InterruptedException{
    	Thread.sleep(1000);
    	Expects.sendKeys(StrExpects);
    	Thread.sleep(1000);
    }
    
  //Inputting Value to Partnership Form - Promoters
    public void clickPromoters(String StrExpects) throws InterruptedException{
    	Thread.sleep(1000);
    	Promoters.sendKeys(StrExpects);
    	Thread.sleep(1000);
    }
    
  //BUTTON eNABLED/dISABLED
    public boolean EnabledSendMessage() throws InterruptedException{
    	Thread.sleep(1000);
    	return SendMessage.isEnabled();
    
    }
    
    //Clicks on the button - SendMessage
    public void clickSendMessage() throws InterruptedException{
    	Thread.sleep(1000);
    	SendMessage.click();
    	Thread.sleep(1000);
    }
    
   
}



