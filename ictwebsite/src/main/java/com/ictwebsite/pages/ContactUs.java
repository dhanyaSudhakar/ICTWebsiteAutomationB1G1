package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

	WebDriver driver;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/header/div/div/div/div/div/a[1]")
	private WebElement ICTFacebook;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/header/div/div/div/div/div/a[2]")
	private WebElement ICTInstagram;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/header/div/div/div/div/div/a[3]")
	private WebElement ICTTwitter;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/header/div/div/div/div/div/a[4]")
	private WebElement ICTGooglePlus;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div[1]/input")
	private WebElement Name;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div[2]/input")
	private WebElement Email;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div[3]/input")
	private WebElement CourseName;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div[4]/div/input")
	private WebElement Message;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[1]/div/div/div/div/div/div[1]/form/div[2]/div[2]/div/button")
	private WebElement Submit;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[2]/div/div/div[1]/div/div[1]/div/input")
	private WebElement SubEmail;
	@FindBy(xpath="/html/body/app-root/app-contactus/body/div/section[2]/div/div/div[1]/div/div[2]/button")
	private WebElement Subscribe;
	
public ContactUs(WebDriver driver){
	this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
    
		}



}
