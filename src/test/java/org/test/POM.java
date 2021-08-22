package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Autotest {

	
public POM() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[text()='register']")
    private	WebElement register;
	@FindBy(xpath="//input[@id='personalaccount-radio']")
	private WebElement selectPA;
	@FindBy(xpath="//input[@id='personalaccount-radio']//following :: input[2]")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='personalaccount-radio']//following :: input[3]")
	private WebElement secondName;
	@FindBy(xpath="//input[@id='personalaccount-radio']//following :: input[4]")
	private WebElement email;
	@FindBy(xpath="//input[@id='personalaccount-radio']//following :: input[6]")
	private WebElement password;
	@FindBy(xpath="//button[text()='Register']")
	private WebElement regbuttonclick;
	
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRegbuttonclick() {
		return regbuttonclick;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getSelectPA() {
		return selectPA;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getSecondName() {
		return secondName;
	}
	public WebElement getEmail() {
		return email;
	}
}
