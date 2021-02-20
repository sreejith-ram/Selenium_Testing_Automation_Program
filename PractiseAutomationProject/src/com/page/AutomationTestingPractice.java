package com.page;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class AutomationTestingPractice extends TestBase{
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	@FindBy(xpath="//div[@id='n2-ss-6-align']")
	List<WebElement> slider;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]")
	List<WebElement> arrivals;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement arrivalHome;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement image1;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement image2;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement image3;
	@FindBy(xpath="//a[contains(text(),'Description')]")
	WebElement description;
	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	WebElement review;
	
	
	public AutomationTestingPractice()
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void clickShopMenu()
	{
		shop.click();
	}
	
	public void clickHomeMenu()
	{
		home.click();
	}
	
	public int noOfSliders()
	{
		return slider.size();
		
	}
	
	public int noOfArrivals()
	{
		return arrivals.size();
		
	}
	
	public void clickOnImage()
	{
		image1.click();
		arrivalHome.click();
	}
	
	public String clickOnImage1()
	{
		image1.click();
		return driver.getTitle();
	}
	
	public String clickOnImage2()
	{
		image2.click();
		return driver.getTitle();
	}
	
	public String clickOnImage3()
	{
		image3.click();
		return driver.getTitle();
	}
	
	public void navigateBack()
	{
		arrivalHome.click();
	}
	
	public void clickDescription()
	{
		description.click();
	}
	
	public void clickReview()
	{
		review.click();
	}
	
}
