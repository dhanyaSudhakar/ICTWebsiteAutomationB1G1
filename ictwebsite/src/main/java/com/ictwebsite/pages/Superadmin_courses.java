package com.ictwebsite.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Superadmin_courses {
	
	WebDriver driver;
	@FindBy(xpath="/html/body/app-root/app-dashboard/body/aside/app-sidenavbar/aside/div[2]/ul/div/ul/li[2]/a")
	private WebElement Courses;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[1]/div/div[1]/input")
	private WebElement Search;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[1]/tr/td[7]/i[1]")
	private WebElement ViewMean;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[1]/tr/td[7]/i[2]")
	private WebElement EditMean;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[1]/tr/td[7]/i[3]")
	private WebElement DeleteMean;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[2]/tr/td[7]/i[1]")
	private WebElement ViewDSA;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[2]/tr/td[7]/i[2]")
	private WebElement EditDSA;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[2]/tr/td[7]/i[3]")
	private WebElement DeleteDSA;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[4]/tr/td[7]/i[1]")
	private WebElement ViewRPA;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[4]/tr/td[7]/i[2]")
	private WebElement EditRPA;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[4]/tr/td[7]/i[3]")
	private WebElement DeleteRPA;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[5]/tr/td[7]/i[1]")
	private WebElement ViewST;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[5]/tr/td[7]/i[2]")
	private WebElement EditST;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[5]/tr/td[7]/i[3]")
	private WebElement DeleteST;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[6]/tr/td[7]/i[1]")
	private WebElement ViewDM;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[6]/tr/td[7]/i[2]")
	private WebElement EditDM;
	@FindBy(xpath="/html/body/app-root/app-courses/div/main/div/div/div/div/div[2]/div/table/tbody[6]/tr/td[7]/i[3]")
	private WebElement DeleteDM;
	
	public Superadmin_courses(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
}
}
