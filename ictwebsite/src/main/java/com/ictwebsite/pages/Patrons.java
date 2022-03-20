package com.ictwebsite.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patrons {
	
WebDriver driver;
    
	//Locating the menu KNOWLWDGE from the Dashboard
	@FindBy(xpath="//*[@id=\"myDiv\"]/li[10]/a")
	private WebElement patronDashboard; 
	
	//click on space
	@FindBy(xpath="//*[@id=\"listSearch\"]")
	private WebElement clickSpace; 
	     
	//Add Patron Button
	@FindBy(xpath="/html/body/app-root/app-patron/div/main/div/div/div/div/div[1]/div/div[2]/div/a")
	private WebElement Addpatron; 
	     
	//Choose File
	@FindBy(xpath="/html/body/app-root/app-add-patron/body/main/div/div/div/div/div/div/div/div[2]/form/div/div/div/div/div[1]/input")
	private WebElement patronChooseFile; 
	  
	//Add Partner - Submit
	@FindBy(xpath="//*[@id=\"imm\"]/div[2]/button")
	private WebElement addPatronSubmit; 
	   
	     
	     public Patrons(WebDriver driver){
		        this.driver = driver;
		        //This initElements method will create all WebElements
		        PageFactory.initElements(driver, this);
		    }  
		    
	     
	     //Click on Knowledge from Dashboard
	     public void clickpatronDashboard() throws InterruptedException{
	     	Thread.sleep(1000);
	    	patronDashboard.click();
	      	Thread.sleep(2000);
	    } 
	     
 
	     public void clickAreaSpace() throws InterruptedException{
		     Thread.sleep(1000);
	    	 clickSpace.click();
	    	 Thread.sleep(2000);
	    }
	       
	     
	     public void clickAddpatron() throws InterruptedException{
		     Thread.sleep(1000);
	    	 Addpatron.click();
	      	 Thread.sleep(2000); 	 
	     }
	     
	     public void clickaddPatronSubmit() throws InterruptedException{
		     	
	    	Thread.sleep(1000);
	    	addPatronSubmit.click();
	      	Thread.sleep(2000);
	      }     
	     
	     public void clickpatronChooseFile(String strChoosefile) throws InterruptedException{
		    
	    	Thread.sleep(1000);
	    	patronChooseFile.sendKeys(strChoosefile);
	      	Thread.sleep(2000);
	    }  
	     
}
