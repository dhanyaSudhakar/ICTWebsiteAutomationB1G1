package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"divchart\"]/app-todos/div/form/div[1]/div/input")
	private WebElement admin;
	
	@FindBy(xpath="//*[@id=\"divchart\"]/app-todos/div/form/div[1]/div/button")
	private WebElement addbutton;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/body/aside/app-sidenavbar/aside/div[2]/ul/div/ul/li[3]/a")
	private WebElement testimony;
	
	@FindBy(xpath="//*[@id=\"myDiv\"]/li[5]/a")
	private WebElement academic;
	
	@FindBy(xpath="/html/body/app-root/app-academic-membership/body/main/div/div/div/div/div[1]/div/div[2]/div/button")
	private WebElement download;
	
	@FindBy(xpath="//*[@id=\"myDiv\"]/li[6]/a")
	private WebElement corporate;
	
	@FindBy(xpath="//*[@id=\"myDiv\"]/li[7]/a")
	private WebElement partnership;
	
	@FindBy(xpath="//*[@id=\"myDiv\"]/li[11]/a")
	private WebElement event;
	
	//public AdminPage(WebDriver driver){
	    // this.driver = driver;
	    // PageFactory.initElements(driver, this);
	//}
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	     PageFactory.initElements(driver, this);
		
	}
	
	public void setTaskName(String strTaskName) throws InterruptedException{
		Thread.sleep(5000);
	  	admin.sendKeys(strTaskName);
	  }
	public void setSignin(){
	 	addbutton.click();  
	}
	
	public void setTestimony() throws InterruptedException{
		Thread.sleep(5000);
	 	testimony.click(); 
	}
	
	public void setAcademic() {
		academic.click();
		
	}	
	
	
	public void setDownload(){
	 	download.click(); 
	}
	
	public void setCorporate(){
		corporate.click();
	}	
	public void setPartnership(){
		partnership.click();
	}	
	
	public void setEvent(){
		event.click();
	}

	
	
	
	
		
		
	}
	

