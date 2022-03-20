package com.ictwebsite.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
    
	//Locating the object - Email
    @FindBy(xpath="//*[@id=\"exampleModalForm\"]/div/div/div/div/div[2]/form/div[1]/input")
    private WebElement Email;
	
    //Locating the object - Password
    @FindBy(xpath="//*[@id=\"exampleModalForm\"]/div/div/div/div/div[2]/form/div[2]/input")
    private WebElement Password;	
    
    //Locating the object - SignIn Button
    @FindBy(xpath="//*[@id=\"exampleModalForm\"]/div/div/div/div/div[2]/form/div[3]/button")
    private WebElement SignIn;  
      
      
    public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }  
    
    //Click on Email
    public void setEmail(String StrEmail) throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	Email.sendKeys(StrEmail);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    } 
    
    //assertion - to get the text from email textbox
    public String matchEmail(){
    	String GetUsername = Email.getAttribute("value");
    	return GetUsername;
    }
    
    
    //Inputting data on Email
    public void clickPassword(String StrPassword) throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	Password.sendKeys(StrPassword);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    } 
    
    //assertion - to get the text from password textbox
    public String matchPassword(){
    	String GetPassword = Password.getAttribute("value");
    	return GetPassword;
    }
    
   //Click on SignIn Button
    public void clickSignIn() throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	SignIn.click();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    } 
    
}
