package com.proyect.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.proyect.dataprovider.DataProviderSearch;
import com.proyect.page.SearchPage;

public class SearchTest extends Base{
	

  @Test(description="Buscar un articulo", dataProvider ="SearchData", dataProviderClass=DataProviderSearch.class)
  public void searchTest(String Email, String Password, String Consulta, String Region, String Categoria, String Tipo, String Percio_Minimo, String Precio_Maximo, String Cuartos_Minimo, String Cuartos_Maximo, String Tama�o_Minimo,String Tama�o_Maximo, String Ba�o_Minimo, String Ba�o_Maximo, String Minimo_Condominio, String Maximo_Condominio, String Garage) {
	  
	  SearchPage searchPage = new SearchPage(driver);
	  SoftAssert softAssertion= new SoftAssert();
  
	  softAssertion.assertTrue(searchPage.login(Email, Password), "No Encuentra el Login");
	  softAssertion.assertTrue(searchPage.searchPage(), "No se entro a la BUsqueda");
	  
	  softAssertion.assertTrue(searchPage.insertQuery(Consulta), "No se encuentra el campo Busqueda");
	  softAssertion.assertTrue(searchPage.selectRegion(Region), "No se selecciona la Region");
	  softAssertion.assertTrue(searchPage.selectComuna(), "No se selecciona la comuna");
	  softAssertion.assertTrue(searchPage.selectCategory(Categoria), "No se selecciona la categoria");
	  softAssertion.assertTrue(searchPage.selectEstateType(Tipo), "No se selecciona el tipo");
	  softAssertion.assertTrue(searchPage.selectPrice(Percio_Minimo,Precio_Maximo), "No se selecciona el precio");
	  softAssertion.assertTrue(searchPage.selectRooms(Cuartos_Minimo, Cuartos_Maximo), "No se selecciona los cuartos");
	  softAssertion.assertTrue(searchPage.selectSize(Tama�o_Minimo, Tama�o_Maximo), "No se selecciona el tama�o");
	  softAssertion.assertTrue(searchPage.selectBathrooms(Ba�o_Minimo, Ba�o_Maximo), "No se seleccionan los ba�os");
	  softAssertion.assertTrue(searchPage.selectCondominio(Minimo_Condominio, Maximo_Condominio), "No selecciona el precio del condominio");
	  softAssertion.assertTrue(searchPage.selectGarage(Garage), "No se selecciona el estacionamiento");
	  softAssertion.assertTrue(searchPage.submitSearch(), "No envia el submit");
	  softAssertion.assertAll();	
  }
  

}
