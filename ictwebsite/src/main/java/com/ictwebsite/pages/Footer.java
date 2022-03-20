package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	WebDriver driver;
    @FindBy(xpath ="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[1]/div[1]/a")
    private WebElement logo;	
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[1]/div[2]/ul/li[1]/a")
    private WebElement ICTFB;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement ICTTwitter;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[1]/div[2]/ul/li[3]/a")
    private WebElement ICTLinkedin;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[1]/div[2]/ul/li[3]/a")
    private WebElement ICTGithub;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[1]/div[2]/ul/li[5]/a")
    private WebElement ICTYoutube;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[5]/div/ul/li[1]/a")
    private WebElement Terms;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[5]/div/ul/li[2]/a")
    private WebElement Privacy;
    @FindBy(xpath="/html/body/app-root/app-home-main/app-footer/footer/div/div/div[5]/div/ul/li[3]/a")
    private WebElement Licenses;
    
    public Footer(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
    
    public void ClickICTFacebook() {
		ICTFB.click();
	}
    
    public void ClickICTTwitter() {
		ICTTwitter.click();
	}
    
    public void ClickICTLinkedin() {
		ICTLinkedin.click();
	}
    
    public void ClickICTGithub() {
		ICTGithub.click();
	}
    
    public void ClickICTYoutube() {
		ICTYoutube.click();
	}
    
    public void ClickTerms() {
		Terms.click();
	}
    
    public void ClickPrivacy() {
		Privacy.click();
	}
    
    public void ClickLicenses() {
		Licenses.click();
	}
    
    
    
  
}
