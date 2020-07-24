package com.proyect.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class utility {
	
public WebDriver driver;
	
	public WebDriver chromeDriverConection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public List<WebElement> findElements(By Locator){
		return driver.findElements(Locator);
	}
	
	public String getText(WebElement element){
		return element.getText();
	}
	
	public String getText (By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click (By locator) {
		driver.findElement(locator).click();
	}
	
	public void click (WebElement element) {
		element.click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			return false;
		}
		
	}
	
	public void visit (String url) {
		driver.get(url);
	}
	
	public void selectDropdown (By locator, String selectText) {
		Select selectList = new Select(findElement(locator));
		selectList.selectByVisibleText(selectText);
		
	}
	public void upload (By locator, String path) {
		
	driver.findElement(locator).sendKeys(path);
	
	}

}
