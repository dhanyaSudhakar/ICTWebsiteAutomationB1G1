package com.ictwebsite.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporateMembershipForm {
	
WebDriver driver;

	//Locating the form Heading - " Corporate Membership Form "
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/h3")
	private WebElement FormHead;

	//Locating the Field - Name
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[1]/div/div/input")
    private WebElement Name;

    //Locating the Field - Address
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[2]/div/input")
    private WebElement Address;

    //Locating the Field - Head of the Organization
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[3]/div[1]/div/input")
    private WebElement HeadoftheOrganization;
    
    //Locating the Field - Nature of the Organization (Product/Services)
    @FindBy(xpath=" /html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[3]/div[2]/div/input")
    private WebElement NatureoftheOrganization;
    
    //Locating the Field - Website
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[4]/input")
    private WebElement Website; 
    
    //Locating the Field - Type of the company
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[5]/div[1]/div/select")
    private WebElement Typeofthecompany; 
    
    //Locating the Field - Type of the company ----- Private
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[5]/div[1]/div/select/option[3]")
    private WebElement TypeofthecompanyPrivate; 

    //Locating the Field - Corporate Identify Number
    @FindBy(name="identityNo")
    private WebElement CorporateIdentifyNumber; 
    
    //Locating the Field - GSTNumber
    @FindBy(name="GST")
    private WebElement GSTNumber; 
    
    //Locating the Field - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/h3")
    private WebElement PointofContact; 
    
    //Locating the Field Name - Point of Contact
    @FindBy(name="nameofContact")
    private WebElement NamePointofContact; 
    
    //Locating the Field Mobile Number - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[7]/div[2]/div/input")
    private WebElement MobilePointofContact;
    
    //Locating the Field Skillset - Point of Contact
    @FindBy(name="TechnicalSkill")
    private WebElement TechnicalSkillPointofContact;
    
    //Locating the Field Email - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[9]/div[1]/div/input")
    private WebElement emailPointofContact;
    
    //Locating the Field Count of employee - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[9]/div[2]/div/input")
    private WebElement employeeCountPointofContact;
    
    //Locating the Field collaborate - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[10]/div/ng-select/div")
    private WebElement collaboratePointofContact;
    
    //Locating the Field -collaborate - Internships - Point of Contact
    @FindBy(xpath="/html/body/ng-dropdown-panel/div/div[2]/div[3]/span")
    private WebElement collaborateitemPointofContact;
    
    //Locating the Field -Number of Patents per Year  - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[11]/div[1]/div/select")
    private WebElement NumberofPatentsperYearPointofContact;
     
    //Locating the Field Item -Number of Patents per Year  - (value 1: 1-10)- Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[11]/div[1]/div/select/option[2]")
    private WebElement NumberofPatentsperYearValPointofContact;
    
    //Locating the Field - Average yearly fresher hiring in your company - Point of Contact 
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[11]/div[2]/div/select")
    private WebElement AvgfrshrPointofContact;
    
    //Locating the Field Item - Average yearly fresher hiring in your company - Point of Contact
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[11]/div[2]/div/select/option[3]")
    private WebElement AvgfrshrValPointofContact;
    
    //Locating the Field - Any corporate interface program/ activities -  Point of Contact 
    @FindBy(xpath=" /html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[12]/div/input")
    private WebElement details;
   
    //Locating the Toggle - Point of Contact -
    @FindBy(xpath="//*[@id=\"flexSwitchCheckDefault\"]")
    private WebElement toggle;
    
    //Locating the Text - Point of Contact -- Register Button 
    @FindBy(xpath="/html/body/app-root/app-corporateform/header/div[2]/section/div/div/div/form/div/div[13]/div[2]/input")
    private WebElement Register;
    
    
    public CorporateMembershipForm(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
    }

    //FormHeading - CorporateMembershipForm
    public String FormHead() throws InterruptedException{
	return FormHead.getText();
	}

    //Scroll Down a page 
    public void scrollDownPage() throws InterruptedException{
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(1000);
	}

    //Click on Membership menu 
    public void clickName(String StrUserName) throws InterruptedException{
	Thread.sleep(1000);
	Name.sendKeys(StrUserName);
	Thread.sleep(1000);
    } 

    public void clickAddress(String StrAddress) throws InterruptedException{
	Thread.sleep(1000);
	Address.sendKeys(StrAddress);
	Thread.sleep(1000);
    }


    public void clickHeadoftheOrganization(String StrHeadoftheOrganization) throws InterruptedException{
	Thread.sleep(2000);
	HeadoftheOrganization.sendKeys(StrHeadoftheOrganization);
	Thread.sleep(2000);
    }


    public void clickNatureoftheOrga(String StrNatureoftheOrganization) throws InterruptedException{
	Thread.sleep(1000);
	NatureoftheOrganization.sendKeys(StrNatureoftheOrganization);
	Thread.sleep(1000);
    }

    public void clickWebsite(String StrWebsite) throws InterruptedException{
	Thread.sleep(1000);
	Website.sendKeys(StrWebsite);
	Thread.sleep(1000);
    }
	
    public void clickTypeofthecompany() throws InterruptedException{
		Thread.sleep(1000);
		Typeofthecompany.click();
		Thread.sleep(1000);
    }
		
    public void clickTypeofthecompanyPrivate() throws InterruptedException{
		Thread.sleep(1000);
		TypeofthecompanyPrivate.click();
		Thread.sleep(1000);	
	}


    public void clickCorporateIdentifyNumber(String StrCorporateIdentifyNumber) throws InterruptedException{
    	Thread.sleep(1000);
    	CorporateIdentifyNumber.sendKeys(StrCorporateIdentifyNumber);
    	Thread.sleep(1000);	
	}


    public void clickGSTNumber(String StrGSTNumber) throws InterruptedException{
    	Thread.sleep(1000);
    	GSTNumber.sendKeys(StrGSTNumber);
    	Thread.sleep(1000);	
    }

    public String clickPointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	System.out.println(PointofContact.getText());
    	return PointofContact.getText();
	}

    public void clickNamePointofContact(String StrNamePointofContact) throws InterruptedException{
    	Thread.sleep(1000);
    	NamePointofContact.sendKeys(StrNamePointofContact);
		Thread.sleep(1000);
	}

    public void clickMobilePointofContact(String StrMobilePointofContact) throws InterruptedException{
    	Thread.sleep(1000);
    	MobilePointofContact.sendKeys(StrMobilePointofContact);
    	Thread.sleep(1000);
	
    }


    public void clickTechnicalSkillPointofContact(String StrTechnicalSkillPointofContact) throws InterruptedException{
    	Thread.sleep(1000);
    	TechnicalSkillPointofContact.sendKeys(StrTechnicalSkillPointofContact);
    	Thread.sleep(1000);
	}

    public void clickemailPointofContact(String StremailPointofContact) throws InterruptedException{
    	Thread.sleep(1000);
    	emailPointofContact.sendKeys(StremailPointofContact);
    	Thread.sleep(1000);
	}

    public void clickemployeeCountPointofContact(String StremployeeCountPointofContact) throws InterruptedException{
    	Thread.sleep(1000);
    	employeeCountPointofContact.sendKeys(StremployeeCountPointofContact);
    	Thread.sleep(1000);
	}


    public void clickcollaboratePointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	collaboratePointofContact.click();
    	Thread.sleep(1000);
    }

    public void clickcollaborateitemPointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	collaborateitemPointofContact.click();
    	Thread.sleep(1000);
				
    }

    public void clickNumberofPatentsperYearPointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	NumberofPatentsperYearPointofContact.click();
    	Thread.sleep(1000);
			
    }

    public void clickNumberofPatentsperYearValPointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	NumberofPatentsperYearValPointofContact.click();
    	Thread.sleep(1000);
	
    }

    public void clickAvgfrshrPointofContact() throws InterruptedException{
    	Thread.sleep(2000);
    	AvgfrshrPointofContact.click();
    	Thread.sleep(1000);
	}

    public void clickAvgfrshrValPointofContact() throws InterruptedException{
    	Thread.sleep(1000);
    	AvgfrshrValPointofContact.click();
    	Thread.sleep(1000);
    	
    }

    //Scroll Down a page 
    public void scrollDownSlightPage() throws InterruptedException{
    	Thread.sleep(1000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,200)", "");
    	Thread.sleep(1000);
	}

    public void clickdetails(String Strdetails) throws InterruptedException{
    	Thread.sleep(1000);
    	details.sendKeys(Strdetails);
    	Thread.sleep(1000);
	
    }

    public void clicktoggle() throws InterruptedException{
    	Thread.sleep(1000);
    	toggle.click();
    	Thread.sleep(1000);
	
    }

    //BUTTON eNABLED/dISABLED
    public boolean EnabledRegister() throws InterruptedException{
    	Thread.sleep(1000);
    	return Register.isEnabled();
	}

    public void clickRegister() throws InterruptedException{
    	Thread.sleep(1000);
    	Register.click();
    	Thread.sleep(1000);
	
    }


}