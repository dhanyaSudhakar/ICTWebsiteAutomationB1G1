package com.ictwebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-banner-home/body/header/div/div/div/div/div/button")
	private WebElement GetStarted;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-banner-home/body/div/section[2]/div/div/div[2]/div/div[2]/button")
	private WebElement FindoutMore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div/div/div[2]/div/a/button")
	private WebElement MeanKnowmore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div/div/div[2]/div/a/button")
	private WebElement MernKnowmore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[7]/div/div/div/div[2]/div/a/button")
	private WebElement DSAKnowmore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[10]/div/div/div/div[2]/div/a/button")
	private WebElement RPAKnowmore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[11]/div/div/div/div[2]/div/a/button")
	private WebElement STKnowmore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[12]/div/div/div/div[2]/div/a/button")
	private WebElement DMKnowmore;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[2]/div[1]/i")
	private WebElement CoursePrevious;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-cards/body/div/div/owl-carousel-o/div/div[2]/div[2]/i")
	private WebElement CourseForward;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-testimonials/section/div[2]/owl-carousel-o/div/div[2]/div[1]/i")
	private WebElement TestPrevious;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-testimonials/section/div[2]/owl-carousel-o/div/div[2]/div[2]/i")
	private WebElement TestForward;
	
   
  public Home(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void GetStarted()
{
	GetStarted.click();
}

public void FindoutMore() 
{
	FindoutMore.click();	
}

public void MeanKnowmore() 
{
	MeanKnowmore.click();	
}

public void MernKnowmore() 
{
	MernKnowmore.click();	
}

public void DSAKnowmore() 
{
	DSAKnowmore.click();	
}

public void RPAKnowmore() 
{
	RPAKnowmore.click();	
}

public void STKnowmore() 
{
	STKnowmore.click();	
}

public void DMKnowmore() 
{
	DMKnowmore.click();	
}

public void CoursePrevious() 
{
	CoursePrevious.click();	
}

public void CourseForward() 
{
	CourseForward.click();	
}

public void TestPrevious() 
{
	TestPrevious.click();	
}

public void TestForward() 
{
	TestForward.click();	
}

}






































