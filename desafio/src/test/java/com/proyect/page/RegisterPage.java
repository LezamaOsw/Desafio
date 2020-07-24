package com.proyect.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.proyect.utility.utility;

public class RegisterPage extends utility{
	
	By loginLocator = By.id("login-account-link");
	By registerButtonLocator = By.cssSelector("div.pm-content>form>p>strong>a#ads_without_account");
	By registerLocator = By.xpath("//h2[@class='formContainer-title']");
	
	By typeLocator = By.id("label_is_company_p");
	By nameLocator = By.id("account_name");
	By genderLocator = By.id("gender_male");
	By dropdownList_Comune = By.id("account_commune");
	By dropdownList_Region = By.id("account_region");
	By typePhoneLocator = By.id("label_phoneInputTypeMobile");
	By phoneLocator = By.id("phone");
	By emailLocator = By.id("account_email");
	By passwordLocator = By.id("account_password");
	By verifyPasswordLocator = By.id("account_password_verify");
	By conditionsLocator = By.cssSelector("label#label_accept_conditions>span");
	By submitBtnLocator = By.id("edit_profile_btn");
	
	By  registredMessage = By.xpath("//div[@title='Email enviado']");
	
	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean login() {
		try {
			click(loginLocator);
			Thread.sleep(1000);
			return true;
		}catch (Throwable ea){
			System.out.println(ea.getMessage());
			return false;
		}		
	}
	
	public Boolean signupForm() {
		try {
			click(registerButtonLocator);
			Thread.sleep(2000);
			return true;
		}catch (Throwable eb){
			System.out.println(eb.getMessage());
			return false;
		}		
	}
	
	public Boolean userType() {
		try {
			click(typeLocator);
			return true;
		}catch (Throwable ec){
			System.out.println(ec.getMessage());
			return false;
		}		
	}
	
	public Boolean userName(String name) {
		try {
			type(name, nameLocator);
			return true;
		}catch (Throwable ed){
			System.out.println(ed.getMessage());
			return false;
		}		
	}
	
	public Boolean userGender() {
		try {
			click(genderLocator);
			return true;
		}catch (Throwable ef){
			System.out.println(ef.getMessage());
			return false;
		}		
	}
	
	public Boolean selectRegion(String region) {
		try {
			selectDropdown(dropdownList_Region, region);
			return true;
		}catch (Throwable eg){
			System.out.println(eg.getMessage());
			return false;
		}		
	}
	
	public Boolean selectComune(String comune) {
		try {
			selectDropdown(dropdownList_Comune, comune);
			return true;
		}catch (Throwable eh){
			System.out.println(eh.getMessage());
			return false;
		}		
	}
	
	public Boolean typePhone() {
		try {
			click(typePhoneLocator);
			return true;
		}catch (Throwable ei){
			System.out.println(ei.getMessage());
			return false;
		}		
	}
	
	public Boolean phoneNumber(String phoneNumber) {
		try {
			type(phoneNumber, phoneLocator);
			return true;
		}catch (Throwable ej){
			System.out.println(ej.getMessage());
			return false;
		}		
	}
	
	public Boolean emailAddress(String mail) {
		try {
			type(mail, emailLocator);
			return true;
		}catch (Throwable ek){
			System.out.println(ek.getMessage());
			return false;
		}		
	}
	
	public Boolean userPassword(String password) {
		try {
			type(password, passwordLocator);
			return true;
		}catch (Throwable el){
			System.out.println(el.getMessage());
			return false;
		}		
	}
	
	public Boolean verifyPassword(String passwordve) {
		try {
			type(passwordve, verifyPasswordLocator);
			return true;
		}catch (Throwable em){
			System.out.println(em.getMessage());
			return false;
		}		
	}
	
	public Boolean acceptConditions() {
		try {
			click(conditionsLocator);
			return true;
		}catch (Throwable en){
			System.out.println(en.getMessage());
			return false;
		}		
	}
	
	public Boolean submitRegister() {
		try {
			click(submitBtnLocator);
			Thread.sleep(2000);
			return true;
		}catch (Throwable eo){
			System.out.println(eo.getMessage());
			return false;
		}		
	}
	
	public Boolean registerConfirmation() {
		
		return isDisplayed(registredMessage);
	}
	
}
