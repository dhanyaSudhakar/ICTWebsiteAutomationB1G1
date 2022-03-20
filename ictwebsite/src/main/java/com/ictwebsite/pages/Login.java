package com.ictwebsite.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
WebDriver driver;
    @FindBy(xpath ="/html/body/app-root/app-home-main/app-header/div[1]/div/div/nav/div/div/ul/li[7]/a")
    private WebElement login;		
    @FindBy(name ="email")
    private WebElement username;
    @FindBy(name ="password")
    private WebElement password;    
    @FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[2]/div/div/div/div/div/div/div/div[2]/form/div[3]/button")
    private WebElement signin;

public Login(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

public void clickLogin(){
    login.click();
}

public void setUserName(String strUserName){
	username.sendKeys(strUserName);     
}
//Set password in password textbox
public void setPassword(String strPassword){
   password.sendKeys(strPassword);
}
//Click on login button
public void clickSignin(){
        signin.click();
}
}
