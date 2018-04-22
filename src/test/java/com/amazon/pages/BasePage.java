package com.amazon.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public BasePage()
	{
		
	}

}
