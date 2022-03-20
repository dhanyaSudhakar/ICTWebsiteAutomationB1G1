package com.ictwebsite.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUser {
	
WebDriver driver;
    

	     //Locating Admin User - Dashboard 
	     @FindBy(xpath="/html/body/app-root/app-dashboard/body/aside/app-sidenavbar/aside/div[2]/ul/div/ul/li[13]/a")
	     private WebElement adminUserDashboard; 
	     
	     //Locating Add Admin button
	     @FindBy(xpath="/html/body/app-root/app-admin-user/div/main/div/div/div/div/div[1]/div/div[2]/div/a")
	     private WebElement addAdmin;
	     
	     
	     //Locating  Label - New Admin User    
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[1]/div/h2")
	     private WebElement newAdminUser;
	     
	     //Locating Field - UserName
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[1]/input")
	     private WebElement UserName;	     
	     
	     //Locating field - first name
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[2]/input")
	     private WebElement FirstName;
	     
	     //Locating field - last name
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[3]/input")
	     private WebElement LastName;
	    
	     //Locating field - Email
	     @FindBy(xpath=" /html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[4]/input")
	     private WebElement Email;
	     
	      //Locating field - Designation
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[5]/input")
	     private WebElement Designation;
	     
	     //Locating Password
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[6]/input")
	     private WebElement Password;
	     
	     //Locating Full Access
	     @FindBy(xpath="//*[@id=\"superAdmin\"]")
	     private WebElement FullAccess;
	 
	     //Locating Add Access
	     @FindBy(xpath="//*[@id=\"addAccess\"]")
	     private WebElement AddAccess;
	    
	     //Locating Edit Access
	     @FindBy(xpath="//*[@id='editAccess']")
	     private WebElement EditAccess;
	     
	     //Locating Delete Access
	     @FindBy(xpath="//*[@id=\"deleteAccess\"]")
	     private WebElement DeleteAccess; 
	   
	     //Locating ADD Button
	     @FindBy(xpath="/html/body/app-root/app-add-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/button")
	     private WebElement AddButton; 
	     
	     //Locating Alert message
	     @FindBy(xpath="//*[@id=\"swal2-title\"]")
	     private WebElement Alertmessage; 
	   
	     
	      //Locating OK Button
	     @FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	     private WebElement OKButton; 
	     
	     //Locating the table
	     @FindBy(xpath="/html/body/app-root/app-admin-user/div/main/div/div/div/div/div[2]/div/table")
	     private WebElement getTable; 
	     
	     
	   //Locating the table 
	     @FindBy(tagName="tr")
	     private WebElement getTabletr; 
	     
	     
	     //lOCATING THE HEADING FROM THE VIEW DETAILS (USERDETAILS)
	     @FindBy(xpath="/html/body/app-root/app-view-admin-user/body/main/div/div/div/div/div/h2")
	     private WebElement getHeadingUseradmin; 
	     
	    //deleteconfirmation
	     @FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	     private WebElement yesDelete;
	     
	     //ok button 
	     @FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	     private WebElement yesDeleteOk;
	     
	     //Edit User - User Name
	     @FindBy(xpath="/html/body/app-root/app-edit-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[1]/input")
	     private WebElement EditUserName;
	     
	   
	     //Edit User - First Name
	     @FindBy(xpath="/html/body/app-root/app-edit-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[2]/input")
	     private WebElement EditFirstName;
	     
	   //Edit User - Last Name
	     @FindBy(xpath="/html/body/app-root/app-edit-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[3]/input")
	     private WebElement EditLastName;
	     
	   //Edit User -Email Address
	     @FindBy(xpath="/html/body/app-root/app-edit-admin-user/body/main/div/div/div/div/div/div/div/div[2]/form/div[1]/div/div/div[2]/div[4]/input")
	     private WebElement EditEmailAddress;
	     
	     public AdminUser(WebDriver driver){
		        	this.driver = driver;
		        	//This initElements method will create all WebElements
		        	PageFactory.initElements(driver, this);
	     			}  
	    
	     
	     //Click on Admin User - Dashboard
	     public void clickadminUserDashboard() throws InterruptedException{
	     	 Thread.sleep(5000);
	    	 adminUserDashboard.click();
	      	 Thread.sleep(5000);
	       } 
	
	    //Click on Add Admin button
	     public void clickaddAdmin() throws InterruptedException{
	     	 Thread.sleep(4000);
	    	 addAdmin.click();
	      	Thread.sleep(4000);
	     } 
	     
	     //Click on Label - New Admin User 
	     public String clicknewAdminUser(){
	     	 return newAdminUser.getText();
	      } 
	     
	   //Click on field - User Name
	     public void clickUserName(String strUserName) throws InterruptedException{
	      	Thread.sleep(1000);
	      	UserName.sendKeys(strUserName);
	      	Thread.sleep(2000);
	     }
	     
	   //Click on field - First Name
	     public void clickFirstName(String strFirstName) throws InterruptedException{
		      	Thread.sleep(1000);
		      	FirstName.sendKeys(strFirstName);
		      	Thread.sleep(2000);
		     }
	     
	   //Click on field -  Last Name
	     public void clickLastName(String strLastName) throws InterruptedException{
		      	Thread.sleep(1000);
		      	LastName.sendKeys(strLastName);
		      	Thread.sleep(2000);
		     }
	     
	   //Click on field - Email
	     public void clickEmail(String strEmail) throws InterruptedException{
		      	Thread.sleep(1000);
		      	Email.sendKeys(strEmail);
		      	Thread.sleep(2000);
		     }
	     
	   //Click on field - Designation
	     public void clickDesignation(String strDesignation) throws InterruptedException{
		      	Thread.sleep(1000);
		      	Designation.sendKeys(strDesignation);
		      	Thread.sleep(2000);
		     }
	     
	   //Click on field - Password 
	     public void clickPassword(String strPassword) throws InterruptedException{
		      	Thread.sleep(1000);
		      	Password.sendKeys(strPassword);
		      	Thread.sleep(2000);
		     }
	     
	     //Click on Toggle - Full Access
	     public void clickFullAccess() throws InterruptedException{
		      	Thread.sleep(1000);
		      	FullAccess.click();
		      	Thread.sleep(2000);
		     }
	     
	     //Click on Toggle - Add Access
	     public void clickAddAccess() throws InterruptedException{
		      	Thread.sleep(1000);
		      	AddAccess.click();
		      	Thread.sleep(2000);
		     }
	     
	     //Click on Toggle - Edit Access
	     public void clickEditAccess() throws InterruptedException{
		      	Thread.sleep(1000);
		      	EditAccess.click();
		      	Thread.sleep(2000);
		     }
	     
	     //Click on Toggle - Delete Access
	     public void clickDeleteAccess() throws InterruptedException{
		      	Thread.sleep(1000);
		      	DeleteAccess.click();
		      	Thread.sleep(2000);
		     }
	     
	     //Click on the button - Add 
	     public void clickAddButton() throws InterruptedException{
		      	Thread.sleep(1000);
		      	AddButton.click();
		      	Thread.sleep(2000);
		     }
	     
	     //Click on the Alert "OK"
	     public void clickOKButton() throws InterruptedException{
		      	Thread.sleep(1000);
		      	OKButton.click();
		      	Thread.sleep(2000);
		     }
	     
	     //Getting the alert message 
	     public String clickAlertmessage() throws InterruptedException{
	    	 Thread.sleep(2000);
	     	 return Alertmessage.getText();
	   } 
	     
	    
	
	
	     public List<WebElement> getTableView()  throws InterruptedException{
	    	 System.out.println("view");
//	    	 getting (all) the each cell data and storing it in list
	    	List<WebElement> list = getTable.findElements(By.tagName("td"));
//	    	
	    		for (WebElement optionview : list) {
	    			
	    			driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	    			
//	    			matching option with the given xpath data and click 
	    			optionview.findElement(By.xpath("//i[@class='fas fa-eye text-info']")).click();
	    			
	    			
	    			break;
	    			
	 			}
	 		return  list;
	 	}
	     
 
	     public List<WebElement> getTableEdit()  throws InterruptedException{
	    	 System.out.println("edit");
	    	 driver.navigate().back();
	    	 
	    	 
	 		Thread.sleep(3000);
	 	
	 		List<WebElement> list = getTable.findElements(By.tagName("td"));
	 	
	 		for (WebElement optionedit : list) {
	 			
	 			optionedit.findElement(By.xpath("//i[@class='fas fa-edit ms-3 text-warning']")).click();
	 		
	 			break;
	 		}
	 		
	 		return  list;
	 	
	 	}
	     
 public List<WebElement> getTableDelete()  throws InterruptedException{
	 System.out.println("hai");
	 driver.navigate().back();
	 
	    	
	 		Thread.sleep(3000);
	 	
	 		List<WebElement> list = getTable.findElements(By.tagName("td"));
	 	
	 		for (WebElement optiondelete : list) {
	 			
	 			optiondelete.findElement(By.xpath("//i[@class='fas fa-trash ms-3 text-danger']")).click();
	 		
	 			 
	 			break;
	 		}
	 		
	 		return  list;
	 	
	 	}
	     
	     
	     
 //Getting the alert message 
 public String clickgetHeadingUseradmin() throws InterruptedException{
	 Thread.sleep(4000);
 	 return getHeadingUseradmin.getText();
 	 
} 



public void clickyesDelete() throws InterruptedException {
	Thread.sleep(4000);
	 yesDelete.click();
	 Thread.sleep(4000);
	 yesDeleteOk.click();
	
} 
 
//assertion wit the spread sheet data and input text field of edit user

public String matchGetEditUserName() throws InterruptedException{
	Thread.sleep(4000);
	String GetEditUserName = EditUserName.getAttribute("value");
	System.out.println(GetEditUserName);
	return GetEditUserName;
		
}


public String matchGetEditFirstName() throws InterruptedException{
	Thread.sleep(4000);
	String GetEditFirstName= EditFirstName.getAttribute("value");
	System.out.println(GetEditFirstName);
	return GetEditFirstName;
		
}

  
public String matchEditLastName () throws InterruptedException{
	Thread.sleep(4000);
	String GetEditLastName  = EditLastName.getAttribute("value");
	System.out.println(GetEditLastName);
	return GetEditLastName ;
		
}


public String matchGetEditEmailAddress() throws InterruptedException{
	Thread.sleep(4000);
	String GetEditEmailAddress = EditEmailAddress.getAttribute("value");
	System.out.println(GetEditEmailAddress);
	return GetEditEmailAddress;
		
}
	     
  
	     
	     
}
