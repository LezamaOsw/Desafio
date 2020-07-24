package com.proyect.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.proyect.utility.utility;

public class SearchPage extends utility {
	By loginLocator = By.id("login-account-link");
	By emailLocator = By.xpath("//div[@class='pm-content']//input[@placeholder='Correo electrónico']");
	By passwordLocator = By.cssSelector("div.pm-content>form>input[type='password']");
	By submitLoginLocator = By.cssSelector("div.pm-content>form>button#acc_login_submit_button");
	
	By userLogLocator = By.cssSelector("span.header-userName");
	By regionLocator = By.id("region_name_15");
	
	By pubLocator = By.cssSelector("div[xpath='1']");
	By searchPageLocator = By.name("q");
	By dropdownRegion = By.id("searcharea_expanded");
	By dropdwonList_Comuna = By.id("multicom-head");
	By selectComunaSelector = By.xpath("//*[@id='multicom-widget']/label[50]");
	By categorySelector = By.id("catgroup");
	By estateTypeSelector = By.id("estate_type_ret");
	By minPriceSelector = By.id("ps_2");
	By maxPriceSelector = By.id("pe_2");
	By minRoomsSelector = By.id("rooms_ros");
	By maxRoomsSelector = By.id("rooms_roe");
	By minSizeSelector = By.id("ss_0");
	By maxSizeSelector = By.id("se_0");
	By minBathroomsSelector = By.id("bathrooms_brs");
	By maxBathroomsSelector = By.id("bathrooms_bre");
	By minCondominioSelector = By.id("condominio_cos");
	By maxCondominioSelector = By.id("condominio_coe");
	By garageLocator = By.id("garage_spaces_gs");
	By searchBtnLocator = By.id("searchbutton");
	
	
	

	public SearchPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean login(String mail, String pass) {
		try {
			click(loginLocator);
			Thread.sleep(500);
			type(mail, emailLocator);
			type(pass, passwordLocator);
			click(submitLoginLocator);
			Thread.sleep(1000);
			return true;
		}catch (Throwable ea){
			System.out.println(ea.getMessage());
			return false;
		}		
	}
	
	public Boolean searchPage() {
		try {
			click(regionLocator);
			return true;
		}catch (Throwable eb){
			System.out.println(eb.getMessage());
			return false;
		}		
	}
	
	public Boolean insertQuery(String search) {
		try {
			Thread.sleep(10000);
			if (isDisplayed(pubLocator)) 
			{
				click (pubLocator);
			};
			type(search,searchPageLocator);
			return true;
		}catch (Throwable ec){
			System.out.println(ec.getMessage());
			return false;
		}	
	}
	
	public Boolean selectRegion(String region) {
		try {
			selectDropdown(dropdownRegion, region);
			return true;
		}catch (Throwable ed){
			System.out.println(ed.getMessage());
			return false;
		}	
	}
	
	public Boolean selectComuna() {
		try {
			click(dropdwonList_Comuna);
			Thread.sleep(500);
			click(selectComunaSelector);
		return true;
		}catch (Throwable ee){
			System.out.println(ee.getMessage());
			return false;
		}	
	}
	
	public Boolean selectCategory(String category) {
		try {
			selectDropdown(categorySelector, category);
			return true;
		}catch (Throwable ef){
			System.out.println(ef.getMessage());
			return false;
		}	
	}
	
	public Boolean selectEstateType(String type) {
		try {
			selectDropdown(estateTypeSelector, type);
			return true;
		}catch (Throwable eg){
			System.out.println(eg.getMessage());
			return false;
		}	
	}
	
	public Boolean selectPrice(String minP, String maxP) {
		try {
			selectDropdown(minPriceSelector, minP);
			selectDropdown(maxPriceSelector, maxP);
			return true;
		}catch (Throwable eh){
			System.out.println(eh.getMessage());
			return false;
		}	
	}
	
	public Boolean selectRooms(String minR, String maxR) {
		try {
			selectDropdown(minRoomsSelector, minR);
			selectDropdown(maxRoomsSelector, maxR);
			return true;
		}catch (Throwable ei){
			System.out.println(ei.getMessage());
			return false;
		}	
	}
	
	public Boolean selectSize(String minSize, String maxSize) {
		try {
			selectDropdown(minSizeSelector, minSize);
			selectDropdown(maxSizeSelector, maxSize);
			return true;
		}catch (Throwable ej){
			System.out.println(ej.getMessage());
			return false;
		}	
	}
	
	public Boolean selectBathrooms(String minBth, String maxBth) {
		try {
			selectDropdown(minBathroomsSelector, minBth);
			selectDropdown(maxBathroomsSelector, maxBth);
			return true;
		}catch (Throwable ek){
			System.out.println(ek.getMessage());
			return false;
		}	
	}
	
	public Boolean selectCondominio(String minCondo, String maxCondo) {
		try {
			selectDropdown(minCondominioSelector, minCondo);
			selectDropdown(maxCondominioSelector, maxCondo);
			return true;
		}catch (Throwable el){
			System.out.println(el.getMessage());
			return false;
		}	
	}
	
	public Boolean selectGarage(String numberGarage) {
		try {
			selectDropdown(garageLocator, numberGarage);
			return true;
		}catch (Throwable em){
			System.out.println(em.getMessage());
			return false;
		}	
	}
	
	public Boolean submitSearch() {
		try {
			click(searchBtnLocator);
			return true;
		}catch (Throwable en){
			System.out.println(en.getMessage());
			return false;
		}	
	}
	
	
}
