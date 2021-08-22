package org.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Autotest {

	public static WebDriver driver;
	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikka\\eclipse-workspace\\TestngFrdemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
	}
	
	
	@Parameters({"fName","sName","emailid","password"})
	@Test
	public void registeration(String fName, String sName,String emailid,String regpassword) {
		
		POM pageElements= new POM();
				
		
		WebElement register = pageElements.getRegister();
		register.click();
			
		WebElement selectPA = pageElements.getSelectPA();
		selectPA.click();
		
		WebElement firstName = pageElements.getFirstName();
		firstName.sendKeys(fName);
	    
	    WebElement secondName = pageElements.getSecondName();
		secondName.sendKeys(sName);
				
		WebElement email = pageElements.getEmail();
		email.sendKeys(emailid);
		
	    WebElement password = pageElements.getPassword();
	    password.sendKeys(regpassword);
	    
	    WebElement regbuttonclick = pageElements.getRegbuttonclick();
	    regbuttonclick.click();
					
		}


	}

