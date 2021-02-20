package com.stepdef;

import org.junit.Assert;

import com.page.AutomationTestingPractice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.When.Whens;

public class LoginStepDef {
	AutomationTestingPractice testing;

	@Given("user is on home page")
	public void user_is_on_home_page() {
		testing = new AutomationTestingPractice();
	}

	@When("user click on shop")
	public void user_click_on_shop() {
		testing.clickShopMenu();
	}

	@When("user clicks on home")
	public void user_clicks_on_home() {
		testing.clickHomeMenu();
	}

	@Then("user is on slider page")
	public void user_is_on_slider_page() {
		Assert.assertEquals(testing.noOfSliders(), 3);
	}

	@Then("user is on arrival page")
	public void user_is_on_arrival_page() {
		Assert.assertEquals(testing.noOfArrivals(), 3);
	}
	
	@Then("user should click on image")
	public void user_should_click_on_image() {
		testing.clickOnImage();
		testing.navigateBack();
	}
	
	@When("each image should be clickable and navigatable")
	public void each_image_should_be_clickable_and_navigatable() {
		testing.clickOnImage1();
		Assert.assertEquals(testing.clickOnImage1(), "Selenium Ruby &#8211; Automation Practice Site");
		testing.navigateBack();
		testing.clickOnImage2();
		Assert.assertEquals(testing.clickOnImage2(), "Thinking in HTML &#8211; Automation Practice Site");
		testing.navigateBack();
		testing.clickOnImage3();
		Assert.assertEquals(testing.clickOnImage3(), "Mastering JavaScript &#8211; Automation Practice Site");
		testing.navigateBack();
	}
	
	@When(user clicks on descriptions)
	public void user_clicks_on_descriptions() {
		testing.clickDescription();
	}
	
	@Then(user clicks on review button)
	public void user_clicks_on_review_button() {
		testing.clickReview();
	}
	
	
}
