package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KnowledgePartners {

WebDriver driver;
      
	//Locating the menu KNOWLWDGE from the Dashboard
     @FindBy(xpath="/html/body/app-root/app-industrial/div/aside/app-sidenavbar/aside/div[2]/ul/div/ul/li[9]/a")
     private WebElement Knowledge;  
     
     //Locating the Add KNOWLWDGE Button
     @FindBy(xpath="/html/body/app-root/app-knowledgepartner/div/main/div/div/div/div/div[1]/div/div[2]/div/a")
     private WebElement AddKnowledge;   
     
  
     //Locating choose file    
     @FindBy(xpath="/html/body/app-root/app-addknowledge/body/main/div/div/div/div/div/div/div/div[2]/form/div/div/div/div/div[1]/input")
	 private WebElement Choosefile;     
     
   
     //Locating the  Add KNOWLWDGE Submit Button
     @FindBy(xpath="/html/body/app-root/app-addknowledge/body/main/div/div/div/div/div/div/div/div[2]/form/div/div/div/div/div[2]/button")
     private WebElement AddKnowledgeSub; 
     

     public KnowledgePartners(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }  
	    
     
     //Click on Knowledge from Dashboard
     public void clickKnowledge() throws InterruptedException{
     	Thread.sleep(1000);
     	Knowledge.click();
     	Thread.sleep(2000);
     } 
     
     
   //Click on Knowledge from KnowledgePAGE
     public void clickAddKnowledge() throws InterruptedException{
     	Thread.sleep(1000);
     	AddKnowledge.click();
     	Thread.sleep(2000);
     } 
     
     
     //Click on Knowledge from KnowledgePAGE
     public void clickChoosefile(String strChoosefile) throws InterruptedException{
     	Thread.sleep(1000);
     	Choosefile.sendKeys(strChoosefile);
     	Thread.sleep(2000);
     } 
     
  
     //Click on Knowledge from KnowledgePAGE
     public void clickAddKnowledgeSubmit() throws InterruptedException{
     	Thread.sleep(1000);
     	AddKnowledgeSub.click();
     	Thread.sleep(2000);
     }
     

}
