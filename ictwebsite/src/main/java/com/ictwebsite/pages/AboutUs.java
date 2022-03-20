package com.ictwebsite.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/app-root/app-about-main/app-banner/header/div/div[1]/div/div/div[2]/a[1]")
	private WebElement FaceBook;
	@FindBy(xpath="/html/body/app-root/app-about-main/app-banner/header/div/div[1]/div/div/div[2]/a[2]")
	private WebElement InstaGram;
	@FindBy(xpath="/html/body/app-root/app-about-main/app-banner/header/div/div[1]/div/div/div[2]/a[3]")
	private WebElement Twitter;
	@FindBy(xpath="/html/body/app-root/app-about-main/app-banner/header/div/div[1]/div/div/div[2]/a[4]")
	private WebElement GooglePlus;
	@FindBy(xpath="/html/body/app-root/app-about-main/app-team/section/div/div/section/div/owl-carousel-o/div/div[2]/div[1]")
	private WebElement TeamPrevious;
	@FindBy(xpath="/html/body/app-root/app-about-main/app-team/section/div/div/section/div/owl-carousel-o/div/div[2]/div[2]")
	private WebElement TeamNext;
	@FindBy(xpath="/html/body/app-root/app-about-main/app-patrons/section/div[2]/div/div/div[2]/a")
	private WebElement Careers;
	
	 public AboutUs(WebDriver driver){
		    this.driver = driver;
		    //This initElements method will create all WebElements
		    PageFactory.initElements(driver, this);
		}
	 
	public void ClickFacebook() {
		FaceBook.click();
	}

	public void ClickInstagram() {
		InstaGram.click();
	}
	
	public void ClickTwitter() {
		Twitter.click();
	}
	
	public void ClickGoogle() {
		GooglePlus.click();
	}
	
	public void ClickTeamprevious() {
	     TeamPrevious.click();
	}

	public void ClickTeamnext() {
	     TeamNext.click();
	}

	public void ClickCareers() {
		Careers.click();
	}
}


