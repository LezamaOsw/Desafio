package com.base;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base{
	
	public WebDriver driver;

	@BeforeMethod
    public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yapo.cl/");
    }
	
	@AfterMethod
	  public void afterClass() {
		 // driver.quit();
	  }
}


