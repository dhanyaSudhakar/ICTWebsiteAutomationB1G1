package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	WebDriver driver;
    @FindBy(xpath ="/html/body/app-root/app-dashboard/body/aside/app-sidenavbar/aside/div[2]/ul/li/div/ul/li/a")
    private WebElement logout;	
	
    public LogoutPage(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
    
    public void clickLogout(){
        logout.click();
}
}
