package com.proyect.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.proyect.utility.utility;

public class PublishPage extends utility{
	
	By loginLocator = By.id("login-account-link");
	By emailLocator = By.cssSelector("div.pm-content>form>input[type='email']");
	By passwordLocator = By.cssSelector("div.pm-content>form>input[type='password']");
	By submitLoginLocator = By.cssSelector("div.pm-content>form>button#acc_login_submit_button");
	
	By userLogLocator = By.cssSelector("span.header-userName");
	By postBtnLocator = By.cssSelector("a[aria-label='Publicar Aviso']");
	
	By categoryGroupLocator = By.id("category_group");
	By conditionSelector = By.id("condition");
	By genderSelector = By.id("gender");
	By clothSizeSelector = By.id("clothing_size");
	By postTitleLocator = By.id("subject");
	By postBodyLocator = By.id("body");
	By priceLocator = By.id("price");
	By uploadLocator = By.name("file");
	By regionLocator = By.id("region");
	By comunesLocator = By.id("communes");
	By conditionsLocator = By.cssSelector("form#aiform>div>label.ipt_label");
	By crateBtnLocator = By.cssSelector("input#submit_create_now");
	
	
	public PublishPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}	

	public Boolean login(String mail, String pass) {
		try {
			click(loginLocator);
			Thread.sleep(1000);
			type(mail, emailLocator);
			type(pass, passwordLocator);
			click(submitLoginLocator);
			Thread.sleep(2000);
			return true;
		}catch (Throwable ea){
			System.out.println(ea.getMessage());
			return false;
		}		
	}
	
	public Boolean ingresarPublicar() {
		try {
			click(postBtnLocator);
			Thread.sleep(2000);
			return true;
		}catch (Throwable eb) {
			System.out.println(eb.getMessage());
			return false;
		}
	}
	
	public Boolean selectCategory (String category) {
		try {
			selectDropdown(categoryGroupLocator, category);
			Thread.sleep(2000);
			return true;
		}catch (Throwable ec) {
			System.out.println(ec.getMessage());
			return false;
		}
	}
	
	public Boolean selectCondition (String condition){
		try {
			selectDropdown(conditionSelector, condition);
			return true;
		}catch (Throwable ed) {
			System.out.println(ed.getMessage());
			return false;
		}
	}
	
	public Boolean selectGender (String gender) {
		try {
			selectDropdown(genderSelector, gender);
			return true;
		}catch (Throwable ee) {
			System.out.println(ee.getMessage());
			return false;
		}
	}
	
	public Boolean selectSize (String size) {
		try {
			selectDropdown(clothSizeSelector, size);
			return true;
		}catch (Throwable ef) {
			System.out.println(ef.getMessage());
			return false;
		}
	}
	
	public Boolean titlePost(String title) {
		try {
			type(title, postTitleLocator);
			return true;
		}catch (Throwable eg) {
			System.out.println(eg.getMessage());
			return false;
		}
	}
	
	public Boolean bodyPost (String body) {
		try {
			type(body, postBodyLocator);
			return true;
		}catch (Throwable eh) {
			System.out.println(eh.getMessage());
			return false;
		}
	}
	
	public Boolean pricePost (String price) {
		try {
			type(price, priceLocator);
			return true;
		}catch (Throwable ei) {
			System.out.println(ei.getMessage());
			return false;
		}
	}
	
	public Boolean uploadPhoto (String path) {
		try {
			upload(uploadLocator, path);
			return true;
		}catch (Throwable ej) {
			System.out.println(ej.getMessage());
			return false;
		}
	}
	
	public Boolean selectRegion (String region) {
		try {
			selectDropdown(regionLocator, region);
			return true;
		}catch (Throwable ek) {
			System.out.println(ek.getMessage());
			return false;
		}
	}
	
	public Boolean selectComune (String comune) {
		try {
			selectDropdown(comunesLocator, comune);
			return true;
		}catch (Throwable el) {
			System.out.println(el.getMessage());
			return false;
		}
	}
	
	public Boolean acceptConditions () {
		try {
			click(conditionsLocator);	
			return true;
		}catch (Throwable em) {
			System.out.println(em.getMessage());
			return false;
		}
	}
	
	public Boolean submitPost () {
		try {
			click(crateBtnLocator);
			return true;
		}catch (Throwable en) {
			System.out.println(en.getMessage());
			return false;
		}
	}

}
