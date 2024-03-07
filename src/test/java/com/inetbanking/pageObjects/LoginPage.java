package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	
	@FindBy(xpath = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement fname;
	
	@FindBy(xpath = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement lname;
	
	@FindBy(xpath = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="radiooptions")
	@CacheLookup
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='checkbox1']")
	@CacheLookup
	WebElement checkboxes;
	
	
	
	
	public void pfName(String firname)
	{
		fname.sendKeys(firname);
		
	}
	public void plName(String lasname)
	{
		lname.sendKeys(lasname);
		
	}
	public void personAddress(String paddress)
	{
		address.sendKeys(paddress);
		
	}
	public void pemail(String mailid)
	{
		email.sendKeys(mailid);
		
	}
	public void pGender()
	{
		gender.click();
		
	}
	
	public void perCheckbox()
	{
		checkboxes.click();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
