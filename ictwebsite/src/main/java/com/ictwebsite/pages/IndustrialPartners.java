package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndustrialPartners {
	
WebDriver driver;
    
		//Locating the menu Industral from the Dashboard
		@FindBy(xpath="/html/body/app-root/app-dashboard/body/aside/app-sidenavbar/aside/div[2]/ul/div/ul/li[8]/a")
		private WebElement Industral;  
     
		//Locating the Add Industral Button
		@FindBy(xpath="/html/body/app-root/app-industrial/div/main/div/div/div/div/div[1]/div/div[2]/div/a")
		private WebElement AddIndustral;  
     
		//Locating the element - Add Partner Button
		@FindBy(xpath="//*[@id=\"imm\"]/div[2]/button")
		private WebElement  AddPartner;
	    
		//Locating the message  - NETWORK ERROR
		@FindBy(xpath="/html/body/div/div/h2")
		private WebElement  NetworkError;
	    
		//Locating the element - Choose file
		@FindBy(xpath="//*[@id=\"imm\"]/div[1]/input")
		private WebElement  Choosefile; 
	    
		//Locating the element - Ok Button
		@FindBy(xpath="/html/body/div/div/div[6]/button[1]")
		private WebElement  Okbutton; 
	    
		//Locating Delete icon
		@FindBy(xpath="/html/body/app-root/app-industrial/div/main/div/div/div/div/div[2]/div/table/tbody[17]/tr/td[3]")
		private WebElement  iconDelete;
	    
	 
		public IndustrialPartners(WebDriver driver){
			this.driver = driver;
			//This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}  
	    
		//Click on Industral from Dashboard
	    public void clickIndustral() throws InterruptedException{
	    	Thread.sleep(1000);
	    	Industral.click();
	    	Thread.sleep(2000);
	    } 
	    
	    
	    //Click on AddIndustral from Industral
	    public void clickAddIndustral() throws InterruptedException{
	    	Thread.sleep(1000);
	    	AddIndustral.click();
	    	Thread.sleep(2000);
	    } 
		
	    //clicking on Add Partner Button
	    public void clickAddPartner() throws InterruptedException{
	    	Thread.sleep(1000);
	    	AddPartner.click();
	    	Thread.sleep(2000);
	    } 
	    
	    //clicking on Add Partner Button
	    public String clickNetworkError() throws InterruptedException{
	    	Thread.sleep(1000);
	    	System.out.println(NetworkError.getText());
	    	return  NetworkError.getText();
	    	
	    	//NetworkError.click();
	    	//Thread.sleep(1000);
	    }
	    
	  //clicking on Add Partner Button
	    public void clickChoosefile(String StrFile) throws InterruptedException{
	    	Thread.sleep(1000);
	    	Choosefile.sendKeys(StrFile);
	    	Thread.sleep(1000);
	    	}
	    
	    
	  //clicking on Add Partner Button
	    public void clickOK() throws InterruptedException{
	    	Thread.sleep(1000);
	    	Okbutton.click();
	    	Thread.sleep(1000);
	    }
	    
	
}
